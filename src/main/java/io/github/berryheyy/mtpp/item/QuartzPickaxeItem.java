package io.github.berryheyy.mtpp.item;

import io.github.berryheyy.mtpp.Config;
import io.github.berryheyy.mtpp.ModToolMaterials;
import io.github.berryheyy.mtpp.Mtpp;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class QuartzPickaxeItem extends PickaxeItem {

    public QuartzPickaxeItem() {
        super(ModToolMaterials.QUARTZ, Config.QUARTZ_PICKAXE_ATTACK-1, (float) Config.QUARTZ_PICKAXE_ATTACK_SPEED-4, new Settings().group(Mtpp.ITEM_GROUP));
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        if (!world.isClient && world instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) world;
            int experience = Config.getBlockExpEquivalent(state.getBlock());
            state.getBlock().dropExperience(serverWorld, pos, experience);
        }

        return super.postMine(stack, world, state, pos, miner);
    }
}
