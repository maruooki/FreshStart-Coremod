package com.maruooki.freshstart.World.CustomChests;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class LootGame4 {
    public LootGame4() {
    }
    public static void initChestGenHook() {
        String key = "freshstart.LOOT_GAME4";
        ChestGenHooks info = ChestGenHooks.getInfo(key);
        info.setMin(1);
        info.setMax(2);
        info.addItem(new WeightedRandomChestContent(new ItemStack(Items.iron_ingot, 1, 0), 1, 4, 40));
        info.addItem(new WeightedRandomChestContent(new ItemStack(Items.netherbrick, 1, 0), 1,4, 90));
    }
}
