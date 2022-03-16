package com.anom.warldmacraft.tools;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WacToolYYFT implements ToolMaterial {

    public static final WacToolYYFT INSTANCE = new WacToolYYFT();

    @Override
    public int getDurability() {
        return (int) 2052F;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 0;
    }
    @Override
    public float getAttackDamage() {
        return (int)18.3F;
    }
    @Override
    public int getMiningLevel() {
        return (int) 0.0F;
    }
    @Override
    public int getEnchantability() {
        return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {return null;}

}
