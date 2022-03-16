package com.anom.warldmacraft.registry;

import com.anom.warldmacraft.armor.WacArmor;
import com.anom.warldmacraft.tools.*;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

import static com.anom.warldmacraft.Warldmacraft.FABRIC_ARMOR;
import static com.anom.warldmacraft.Warldmacraft.MOD_ID;

public class ModItems {
    public static final Item GIRAFFESKIN = new Item(new Item.Settings().maxCount(64));
    public static final Item WARMAEGG = new Item(new Item.Settings().maxCount(64));
    public static final Item MAJILOR = new Item(new Item.Settings().maxCount(64));
    public static final Item WARBADGE = new Item(new Item.Settings().maxCount(64));
    public static final Item YYBADGE = new Item(new Item.Settings().maxCount(64));
    public static final Item WARPD = new Item(new Item.Settings().maxCount(64));
    public static final Item DUCKEGG = new Item(new Item.Settings().maxCount(64));
    public static final Item WACBASIC = new Item(new Item.Settings().maxCount(16));
    public static final WacToolFIREA WACFIREA = new WacToolFIREA(new Item.Settings().maxCount(1));
    public static final WacToolFIREB WACFIREB = new WacToolFIREB(new Item.Settings().maxCount(1));
    public static final WacToolFIREC WACFIREC = new WacToolFIREC(new Item.Settings().maxCount(1));
    public static final WacToolFIRED WACFIRED = new WacToolFIRED(new Item.Settings().maxCount(1));
    public static ToolItem MOAHAIR = new SwordItem(WacToolMOAHAIR.INSTANCE, 2, -0.1F, new Item.Settings().maxCount(1));
    public static ToolItem YYFT = new SwordItem(WacToolYYFT.INSTANCE, 2, -0.1F, new Item.Settings().maxCount(1).rarity(Rarity.RARE).fireproof());
    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "giraffe_skin"), GIRAFFESKIN);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warma_egg"), WARMAEGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "majilor"), MAJILOR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warma_badge"), WARBADGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "yiyu_badge"), YYBADGE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "warma_pendant"), WARPD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "duck_egg"), DUCKEGG);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "moahair"), MOAHAIR);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wacfire_basic"), WACBASIC);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wacfire_red"), WACFIREA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wacfire_blue"), WACFIREB);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wacfire_yellow"), WACFIREC);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wacfire_green"), WACFIRED);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "yiyufairytale"), YYFT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"giraffe_helmet"), new WacArmor(FABRIC_ARMOR, EquipmentSlot.HEAD));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"giraffe_chestplate"), new WacArmor(FABRIC_ARMOR, EquipmentSlot.CHEST));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"giraffe_leggings"), new WacArmor(FABRIC_ARMOR, EquipmentSlot.LEGS));
        Registry.register(Registry.ITEM, new Identifier(MOD_ID,"giraffe_boots" ), new WacArmor(FABRIC_ARMOR, EquipmentSlot.FEET));
        //
    }
}
