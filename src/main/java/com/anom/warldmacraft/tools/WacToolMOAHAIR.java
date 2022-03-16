package com.anom.warldmacraft.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WacToolMOAHAIR implements ToolMaterial {

    public static final WacToolMOAHAIR INSTANCE = new WacToolMOAHAIR();

    @Override
    public int getDurability() {
        return (int) 1026F;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }
    @Override
    public float getAttackDamage() {
        return (int)15.4F;
    }
    @Override
    public int getMiningLevel() {
        return (int) 0.0F;
    }
    @Override
    public int getEnchantability() {
        return 0;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.WHITE_WOOL);
    }

}
