package io.github.berryheyy.mtpp.event;

import io.github.berryheyy.mtpp.Mtpp;
import io.github.berryheyy.mtpp.network.PacketManager;
import io.github.berryheyy.mtpp.registry.ModSoundEvents;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class RiftEvents {

    public static void openRift(PlayerEntity playerEntity, ServerWorld world, int dupeTimes) {
        world.playSound(null, playerEntity.getBlockPos(), ModSoundEvents.RIFT_OPEN, SoundCategory.PLAYERS, 1f, 1f);



        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                BlockPos beginPos = playerEntity.getBlockPos();
                Random mobSummonRandom = new Random(world.getSeed() / world.getTime());
                for (int x = -4; x <= 4; x++)
                    for (int y = 4; y >= 0; y--)
                        for (int z = -4; z <= 4; z++) {
                            world.setBlockState(beginPos.add(x, y, z), Blocks.AIR.getDefaultState());
                            BlockPos currentPos = new BlockPos(beginPos.getX() + x, beginPos.getY() + y, beginPos.getZ() + z);

                            // Check to spawn mob
                            if (mobSummonRandom.nextFloat() < (dupeTimes / 200f)) {
                                CompoundTag tag = new CompoundTag();
                                tag.putString("id", new Identifier("minecraft", "vex").toString());


                                Entity vex = EntityType.loadEntityWithPassengers(tag, world, entity1 -> {
                                    entity1.refreshPositionAndAngles(currentPos.getX(), currentPos.getY(), currentPos.getZ(), entity1.yaw, entity1.pitch);
                                    return entity1;
                                });

                                ((MobEntity) vex).initialize(world, world.getLocalDifficulty(vex.getBlockPos()), SpawnReason.COMMAND, (EntityData) null, (CompoundTag) null);

                                world.spawnEntity(vex);
                            }

                            PacketByteBuf buf = PacketByteBufs.create();
                            buf.writeBlockPos(currentPos);
                            ServerPlayNetworking.send((ServerPlayerEntity) playerEntity, PacketManager.SPAWN_RIFT_PARTICLE_PACKET_ID, buf);
                        }

                this.cancel();
            }
        }, 1100);
    }
}
