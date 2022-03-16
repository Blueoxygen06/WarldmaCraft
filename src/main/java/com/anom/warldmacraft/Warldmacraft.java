package com.anom.warldmacraft;

import com.anom.warldmacraft.armor.WacArmorMaterial;
import com.anom.warldmacraft.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Warldmacraft implements ModInitializer {
    public static final String MOD_ID = "warldmacraft";

    public static final Identifier MFYSSC = new Identifier("warldmacraft:mfyssc");  //Sky City天空之城
    public static net.minecraft.sound.SoundEvent MFYSSCEVENTA = new net.minecraft.sound.SoundEvent(MFYSSC);
    public static final Identifier MFYSLR = new Identifier("warldmacraft:mfyslr");  //Love is deep and rainy情深深雨蒙蒙
    public static net.minecraft.sound.SoundEvent MFYSSCEVENTB = new net.minecraft.sound.SoundEvent(MFYSLR);
    public static final Identifier MFYSIF = new Identifier("warldmacraft:mfysif");  //Insect fly虫儿飞
    public static net.minecraft.sound.SoundEvent MFYSSCEVENTC = new net.minecraft.sound.SoundEvent(MFYSIF);
    public static final Identifier MFYSMO = new Identifier("warldmacraft:mfysmo");  //My Heart Will Go On我心永恒
    public static net.minecraft.sound.SoundEvent MFYSSCEVENTD = new net.minecraft.sound.SoundEvent(MFYSMO);

    public static final ArmorMaterial FABRIC_ARMOR = new WacArmorMaterial();
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(
                    new Identifier("warldmacraft", "general"))
            .icon(() -> new ItemStack(ModItems.MOAHAIR))
            .appendItems(stacks -> {
                stacks.add(new ItemStack(ModItems.MOAHAIR));
                stacks.add(new ItemStack(ModItems.GIRAFFESKIN));
                stacks.add(new ItemStack(ModItems.WARMAEGG));
                stacks.add(new ItemStack(ModItems.MAJILOR));
                stacks.add(new ItemStack(ModItems.WARBADGE));
                stacks.add(new ItemStack(ModItems.YYBADGE));
                stacks.add(new ItemStack(ModItems.DUCKEGG));
                stacks.add(new ItemStack(ModItems.WARPD));
                stacks.add(new ItemStack(ModItems.YYFT));
                stacks.add(new ItemStack(ModItems.WACBASIC));
                stacks.add(new ItemStack(ModItems.WACFIREA));
                stacks.add(new ItemStack(ModItems.WACFIREB));
                stacks.add(new ItemStack(ModItems.WACFIREC));
                stacks.add(new ItemStack(ModItems.WACFIRED));
            })
            .build();
    @Override
    public void onInitialize() {
        ModItems.registerItems();
        Registry.register(Registry.SOUND_EVENT, Warldmacraft.MFYSSC, MFYSSCEVENTA);
        Registry.register(Registry.SOUND_EVENT, Warldmacraft.MFYSLR, MFYSSCEVENTB);
        Registry.register(Registry.SOUND_EVENT, Warldmacraft.MFYSIF, MFYSSCEVENTC);
        Registry.register(Registry.SOUND_EVENT, Warldmacraft.MFYSMO, MFYSSCEVENTD);
    }

}


