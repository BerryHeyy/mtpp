package io.github.berryheyy.mtpp;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    MAGMA(Config.MAGMA_TOOL_MATERIAL_DURABILITY, Config.MAGMA_TOOL_MATERIAL_MINING_SPEED, 0F, Config.MAGMA_TOOL_MATERIAL_MINING_LEVEL, Config.MAGMA_TOOL_MATERIAL_ENCHANTABILITY, () -> {
        return Ingredient.ofItems(Items.MAGMA_BLOCK);
    }),
    LAPIS(Config.LAPIS_TOOL_MATERIAL_DURABILITY, Config.LAPIS_TOOL_MATERIAL_MINING_SPEED, 0F, Config.LAPIS_TOOL_MATERIAL_MINING_LEVEL, Config.LAPIS_TOOL_MATERIAL_ENCHANTABILITY, () -> {
        return Ingredient.ofItems(Items.LAPIS_BLOCK);
    }),
    QUARTZ(Config.QUARTZ_TOOL_MATERIAL_DURABILITY, Config.QUARTZ_TOOL_MATERIAL_MINING_SPEED, 0F, Config.QUARTZ_TOOL_MATERIAL_MINING_LEVEL, Config.QUARTZ_TOOL_MATERIAL_ENCHANTABILITY, () -> {
        return Ingredient.ofItems(Items.QUARTZ_BLOCK);
    });


    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, int miningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
