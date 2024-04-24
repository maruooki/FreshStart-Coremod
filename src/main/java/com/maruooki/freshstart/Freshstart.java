package com.maruooki.freshstart;

import com.maruooki.freshstart.World.CustomChests.LootGame1;
import com.maruooki.freshstart.World.CustomChests.LootGame2;
import com.maruooki.freshstart.World.CustomChests.LootGame3;
import com.maruooki.freshstart.World.CustomChests.LootGame4;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = Freshstart.MODID,
        version = Freshstart.VERSION
)
public class Freshstart
{
    public static final String MODID = "freshstart";
    public static final String VERSION = "1.0.1";

    @Mod.Instance("freshstart")
    public static Freshstart instance;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        // currently, these are configured through TooMuchLoot, they will have embedded tables eventually.
        LootGame1.initChestGenHook();
        LootGame2.initChestGenHook();
        LootGame3.initChestGenHook();
        LootGame4.initChestGenHook();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
}

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
    }
}