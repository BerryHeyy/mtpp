package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MagmaSwordItem extends SwordItem {


    public MagmaSwordItem() {
        super(ModToolMaterials.MAGMA, Config.MAGMA_SWORD_ATTACK-1, (float) Config.MAGMA_SWORD_ATTACK_SPEED-4, new Item.Settings().group(Mtpp.ITEM_GROUP));
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
