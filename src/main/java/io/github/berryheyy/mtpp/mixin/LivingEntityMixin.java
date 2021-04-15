package io.github.berryheyy.mtpp.mixin;

import io.github.berryheyy.mtpp.Mtpp;
import io.github.berryheyy.mtpp.event.RiftEvents;
import io.github.berryheyy.mtpp.registry.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContext;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

    @Shadow
    protected abstract void dropLoot(DamageSource source, boolean causedByPlayer);

    @Inject(
            at = @At("HEAD"),
            method = "drop(Lnet/minecraft/entity/damage/DamageSource;)V",
            cancellable = true
    )
    protected void drop(DamageSource source, CallbackInfo ci) {
        if (source.getAttacker() instanceof LivingEntity) {
            LivingEntity attacker = (LivingEntity) source.getAttacker();

            ItemStack itemStack = attacker.getMainHandStack();

            if (itemStack.getItem().equals(ModItems.MAGMA_PICKAXE) ||
                    itemStack.getItem().equals(ModItems.MAGMA_AXE) ||
                    itemStack.getItem().equals(ModItems.MAGMA_HOE) ||
                    itemStack.getItem().equals(ModItems.MAGMA_SHOVEL) ||
                    itemStack.getItem().equals(ModItems.MAGMA_SWORD)) ci.cancel();

            if (itemStack.getItem().equals(ModItems.LAPIS_PICKAXE) ||
                    itemStack.getItem().equals(ModItems.LAPIS_AXE) ||
                    itemStack.getItem().equals(ModItems.LAPIS_HOE) ||
                    itemStack.getItem().equals(ModItems.LAPIS_SHOVEL) ||
                    itemStack.getItem().equals(ModItems.LAPIS_SWORD)) {


                if (attacker instanceof PlayerEntity && attacker.world instanceof ServerWorld) {
                    PlayerEntity playerEntity = (PlayerEntity) attacker;
                    ServerWorld serverWorld = (ServerWorld) attacker.world;

                    int dupeTimes = playerEntity.experienceLevel;

                    playerEntity.addExperienceLevels(-dupeTimes);

                    for (int i = 0; i < dupeTimes; i++) {
                        dropLoot(source, true);
                    }

                    // Determine if gate should be opened
                    if (new Random(serverWorld.getSeed() / serverWorld.getTime()).nextFloat() < (dupeTimes / 100f)) {
                        RiftEvents.openRift(playerEntity, serverWorld, dupeTimes);
                    }

                    ci.cancel();
                }
            }
        }
    }
}
