package io.github.berryheyy.mtpp.mixin;

import io.github.berryheyy.mtpp.registry.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.concurrent.atomic.AtomicInteger;

@Mixin(LivingEntity.class)
public class LivingEntityMixin {

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
        }
    }
}
