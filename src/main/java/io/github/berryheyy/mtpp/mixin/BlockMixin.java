package io.github.berryheyy.mtpp.mixin;

import io.github.berryheyy.mtpp.Mtpp;
import io.github.berryheyy.mtpp.Reference;
import io.github.berryheyy.mtpp.event.RiftEvents;
import io.github.berryheyy.mtpp.registry.ModItems;
import io.github.berryheyy.mtpp.registry.ModSoundEvents;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.VexEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;
import java.util.Random;

@Mixin(Block.class)
public class BlockMixin {

    @Inject(
            at = @At("RETURN"),
            method = "getDroppedStacks(Lnet/minecraft/block/BlockState;Lnet/minecraft/server/world/ServerWorld;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/entity/BlockEntity;Lnet/minecraft/entity/Entity;Lnet/minecraft/item/ItemStack;)Ljava/util/List;",
            cancellable = true
    )
    private static void getDroppedStacks(BlockState state, ServerWorld world, BlockPos pos, BlockEntity blockEntity, Entity entity, ItemStack stack, CallbackInfoReturnable<List<ItemStack>> ci) {

        if (stack.getItem().equals(ModItems.MAGMA_PICKAXE) ||
            stack.getItem().equals(ModItems.MAGMA_AXE) ||
            stack.getItem().equals(ModItems.MAGMA_HOE) ||
            stack.getItem().equals(ModItems.MAGMA_SHOVEL) ||
            stack.getItem().equals(ModItems.MAGMA_SWORD)) {
            ci.setReturnValue(DefaultedList.ofSize(1, ItemStack.EMPTY));
            ci.cancel();
        }

        if (stack.getItem().equals(ModItems.MAGMA_PICKAXE) ||
                stack.getItem().equals(ModItems.MAGMA_AXE) ||
                stack.getItem().equals(ModItems.MAGMA_HOE) ||
                stack.getItem().equals(ModItems.MAGMA_SHOVEL)) {
            if (entity instanceof PlayerEntity) {
                LootContext.Builder builder = (new LootContext.Builder(world)).random(world.random).parameter(LootContextParameters.ORIGIN, Vec3d.ofCenter(pos)).parameter(LootContextParameters.TOOL, stack).optionalParameter(LootContextParameters.THIS_ENTITY, entity).optionalParameter(LootContextParameters.BLOCK_ENTITY, blockEntity);
                List<ItemStack> stacks = state.getDroppedStacks(builder);

                PlayerEntity playerEntity = (PlayerEntity) entity;

                int dupeTimes = ((PlayerEntity) entity).experienceLevel;

                stacks.forEach(s -> {
                    s.setCount(s.getCount() * dupeTimes);
                });

                playerEntity.addExperienceLevels(-dupeTimes);

                // Determine if gate should be opened
                if (new Random(world.getSeed() / world.getTime()).nextFloat() < (dupeTimes / 100f)) {
                    RiftEvents.openRift(playerEntity, world, dupeTimes);
                }

                ci.setReturnValue(stacks);
                ci.cancel();
            }
        }
    }
}
