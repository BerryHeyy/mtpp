package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.ModToolMaterials;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaShovelItem extends ShovelItem {
    public MagmaShovelItem() {
        super(ModToolMaterials.MAGMA, 3f, 7f, new Item.Settings().group(ItemGroup.TOOLS));
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {

        miner.setOnFireFor(3);
        return super.postMine(stack, world, state, pos, miner);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.setOnFireFor(10);
        attacker.setOnFireFor(3);
        return super.postHit(stack, target, attacker);
    }

}
