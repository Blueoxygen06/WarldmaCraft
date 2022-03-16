package com.anom.warldmacraft.tools;

import com.anom.warldmacraft.Warldmacraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class WacToolFIRED extends Item {

    public WacToolFIRED(Settings settings) {
        super(settings);
    }
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.playSound(Warldmacraft.MFYSSCEVENTD, 10.0F, 1.0F);
        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }

}
