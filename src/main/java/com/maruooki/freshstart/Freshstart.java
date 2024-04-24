package com.maruooki.freshstart;

import com.maruooki.freshstart.World.CustomChests.LootGame1;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid = Freshstart.MODID, version = Freshstart.VERSION)
public class Freshstart
{
    public static final String MODID = "freshstart";
    public static final String VERSION = "1.0.0";

    @Mod.Instance("freshstart")
    public static Freshstart instance;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        LootGame1.initChestGenHook();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}