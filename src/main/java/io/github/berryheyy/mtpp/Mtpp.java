package io.github.berryheyy.mtpp;

import io.github.berryheyy.mtpp.registry.ModBlockEntities;
import io.github.berryheyy.mtpp.registry.ModBlocks;
import io.github.berryheyy.mtpp.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mtpp implements ModInitializer {

    public static final Logger LOGGER = LogManager.getLogger(Reference.MOD_ID);

    @Override
    public void onInitialize() {

        Config.init();

        LOGGER.info(Config.MAGMA_PICKAXE_ATTACK);

        ModItems.init();
        ModBlocks.init();
        ModBlockEntities.init();
    }

}
