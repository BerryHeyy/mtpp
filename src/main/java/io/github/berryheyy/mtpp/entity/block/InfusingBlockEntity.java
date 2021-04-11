package io.github.berryheyy.mtpp.entity.block;

import io.github.berryheyy.mtpp.registry.ModBlockEntities;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.Tickable;
import org.jetbrains.annotations.Nullable;

public class InfusingBlockEntity extends BlockEntity implements Tickable, NamedScreenHandlerFactory {


    public InfusingBlockEntity() {
        super(ModBlockEntities.INFUSING_BLOCK_ENTITY);
    }

    @Override
    public Text getDisplayName() {
        return null;
    }

    @Nullable
    @Override
    public ScreenHandler createMenu(int syncId, PlayerInventory inv, PlayerEntity player) {
        return null;
    }

    @Override
    public void tick() {

    }
}
