package io.github.berryheyy.mtpp.block;

import io.github.berryheyy.mtpp.Config;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class ExperienceClusterBlock extends Block {

    public ExperienceClusterBlock() {
        super(FabricBlockSettings.of(Material.GLASS).strength(0.3f, 0.3f));
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        if (world.isClient) return;

        state.getBlock().dropExperience((ServerWorld) world, pos, Config.EXPERIENCE_CLUSTER_BREAK_EXPERIENCE_DROP);

    }
}
