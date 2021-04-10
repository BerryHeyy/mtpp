package io.github.berryheyy.mtpp.mixin;

import com.sun.org.apache.xpath.internal.operations.Mod;
import io.github.berryheyy.mtpp.Mtpp;
import io.github.berryheyy.mtpp.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

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
    }

}
