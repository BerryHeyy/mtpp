package io.github.berryheyy.mtpp.registry;

import io.github.berryheyy.mtpp.Reference;
import io.github.berryheyy.mtpp.data.ItemModelGenerator;
import io.github.berryheyy.mtpp.item.*;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final ShovelItem MAGMA_SHOVEL = new MagmaShovelItem();
    public static final PickaxeItem MAGMA_PICKAXE = new MagmaPickaxeItem();
    public static final AxeItem MAGMA_AXE = new MagmaAxeItem();
    public static final HoeItem MAGMA_HOE = new MagmaHoeItem();
    public static final SwordItem MAGMA_SWORD = new MagmaSwordItem();

    public static final ShovelItem LAPIS_SHOVEL = new LapisShovelItem();
    public static final PickaxeItem LAPIS_PICKAXE = new LapisPickaxeItem();
    public static final AxeItem LAPIS_AXE = new LapisAxeItem();
    public static final HoeItem LAPIS_HOE = new LapisHoeItem();
    public static final SwordItem LAPIS_SWORD = new LapisSwordItem();

    public static void init() {
        registerTool(MAGMA_SHOVEL, "magma_shovel");
        registerTool(MAGMA_PICKAXE, "magma_pickaxe");
        registerTool(MAGMA_AXE, "magma_axe");
        registerTool(MAGMA_HOE, "magma_hoe");
        registerTool(MAGMA_SWORD, "magma_sword");

        registerTool(LAPIS_SHOVEL, "lapis_shovel");
        registerTool(LAPIS_PICKAXE, "lapis_pickaxe");
        registerTool(LAPIS_AXE, "lapis_axe");
        registerTool(LAPIS_HOE, "lapis_hoe");
        registerTool(LAPIS_SWORD, "lapis_sword");

    }

    private static void registerTool(Item item, String name) {
        Registry.register(Registry.ITEM, new Identifier(Reference.MOD_ID, name), item);
        ItemModelGenerator.registerItemModelHandheld(name);
    }

}
