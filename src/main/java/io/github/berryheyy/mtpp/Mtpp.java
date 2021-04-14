package io.github.berryheyy.mtpp;

import io.github.berryheyy.mtpp.registry.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mtpp implements ModInitializer {

    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(Reference.MOD_ID, "tools"),
            () -> new ItemStack(ModItems.MAGMA_HOE));

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Override
    public void onInitialize() {

        Config.init();

        ModItems.init();
        ModBlocks.init();
        ModBlockEntities.init();

        ModSoundEvents.init();
        //ModParticleTypes.init();
    }

}
