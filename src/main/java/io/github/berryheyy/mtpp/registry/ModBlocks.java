package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Reference;
import io.github.berryheyy.mtpp.block.InfusingBlock;
import io.github.berryheyy.mtpp.data.ItemModelGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block INFUSING_BLOCK = register(new InfusingBlock(), "infusing");

    public static void init() {

    }

    private static Block register(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);

        ItemModelGenerator.registerBlockItemModel(name);

        return block;
    }

}
