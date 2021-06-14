package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Mtpp;
import io.github.berryheyy.mtpp.Reference;
import io.github.berryheyy.mtpp.block.ExperienceClusterBlock;
import io.github.berryheyy.mtpp.data.ItemModelGenerator;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block EXPERIENCE_CLUSTER_BLOCK = register(new ExperienceClusterBlock(), "experience_cluster");

    public static void init() {

    }

    private static Block register(Block block, String name) {
        Registry.register(Registry.BLOCK, new Identifier(Reference.MOD_ID, name), block);
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), new BlockItem(block, new Item.Settings().group(Mtpp.ITEM_GROUP)));

        ItemModelGenerator.registerBlockItemModel(name);

        return block;
    }

}
