package io.github.berryheyy.mtpp;

public class Config {

    private static final SimpleConfig CONFIG = SimpleConfig.of(Reference.MOD_ID).request();

    public static void init() {}

    // Magma

    public static final int MAGMA_TOOL_MATERIAL_MINING_SPEED = CONFIG.getOrDefault("toolmaterial.magma.mining_speed", 400);
    public static final int MAGMA_TOOL_MATERIAL_DURABILITY = CONFIG.getOrDefault("toolmaterial.magma.durability", 100);
    public static final int MAGMA_TOOL_MATERIAL_MINING_LEVEL = CONFIG.getOrDefault("toolmaterial.magma.mining_level", 1);
    public static final int MAGMA_TOOL_MATERIAL_ENCHANTABILITY = CONFIG.getOrDefault("toolmaterial.magma.enchantability", 1);

    public static final int MAGMA_PICKAXE_ATTACK = CONFIG.getOrDefault("item.magma_pickaxe.attack", 5);
    public static final double MAGMA_PICKAXE_ATTACK_SPEED = CONFIG.getOrDefault("item.magma_pickaxe.attack_speed", 1.2);
    public static final double MAGMA_SHOVEL_ATTACK = CONFIG.getOrDefault("item.magma_shovel.attack", 5.5);
    public static final double MAGMA_SHOVEL_ATTACK_SPEED = CONFIG.getOrDefault("item.magma_shovel.attack_speed", 1);
    public static final double MAGMA_AXE_ATTACK = CONFIG.getOrDefault("item.magma_axe.attack", 9);
    public static final double MAGMA_AXE_ATTACK_SPEED = CONFIG.getOrDefault("item.magma_axe.attack_speed", 1);
    public static final int MAGMA_HOE_ATTACK = CONFIG.getOrDefault("item.magma_hoe.attack", 1);
    public static final double MAGMA_HOE_ATTACK_SPEED = CONFIG.getOrDefault("item.magma_hoe.attack_speed", 4);
    public static final int MAGMA_SWORD_ATTACK = CONFIG.getOrDefault("item.magma_sword.attack", 7);
    public static final double MAGMA_SWORD_ATTACK_SPEED = CONFIG.getOrDefault("item.magma_sword.attack_speed", 1.6);

    // Lapis

    public static final int LAPIS_TOOL_MATERIAL_MINING_SPEED = CONFIG.getOrDefault("toolmaterial.lapis.mining_speed", 2);
    public static final int LAPIS_TOOL_MATERIAL_DURABILITY = CONFIG.getOrDefault("toolmaterial.lapis.durability", 10);
    public static final int LAPIS_TOOL_MATERIAL_MINING_LEVEL = CONFIG.getOrDefault("toolmaterial.lapis.mining_level", 2);
    public static final int LAPIS_TOOL_MATERIAL_ENCHANTABILITY = CONFIG.getOrDefault("toolmaterial.lapis.enchantability", 1);

    public static final int LAPIS_PICKAXE_ATTACK = CONFIG.getOrDefault("item.lapis_pickaxe.attack", 3);
    public static final double LAPIS_PICKAXE_ATTACK_SPEED = CONFIG.getOrDefault("item.lapis_pickaxe.attack_speed", 1.2);
    public static final double LAPIS_SHOVEL_ATTACK = CONFIG.getOrDefault("item.lapis_shovel.attack", 3.5);
    public static final double LAPIS_SHOVEL_ATTACK_SPEED = CONFIG.getOrDefault("item.lapis_shovel.attack_speed", 1);
    public static final double LAPIS_AXE_ATTACK = CONFIG.getOrDefault("item.lapis_axe.attack", 9);
    public static final double LAPIS_AXE_ATTACK_SPEED = CONFIG.getOrDefault("item.lapis_axe.attack_speed", 0.8);
    public static final int LAPIS_HOE_ATTACK = CONFIG.getOrDefault("item.lapis_hoe.attack", 1);
    public static final double LAPIS_HOE_ATTACK_SPEED = CONFIG.getOrDefault("item.lapis_hoe.attack_speed", 2);
    public static final int LAPIS_SWORD_ATTACK = CONFIG.getOrDefault("item.lapis_sword.attack", 5);
    public static final double LAPIS_SWORD_ATTACK_SPEED = CONFIG.getOrDefault("item.lapis_sword.attack_speed", 1.6);

}
