package io.github.berryheyy.mtpp.block;

import io.github.berryheyy.mtpp.entity.block.InfusingBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

public class InfusingBlock extends Block implements BlockEntityProvider {
    public InfusingBlock() {
        super(FabricBlockSettings.of(Material.STONE).strength(4, 4));
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockView world) {
        return new InfusingBlockEntity();
    }
}
