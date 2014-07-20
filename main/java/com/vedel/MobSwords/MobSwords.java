package com.vedel.MobSwords;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobSwords.modid, version = MobSwords.version)

public class MobSwords {

	public static final String modid = "MobSwords";
	public static final String version = "0.1 MC1.7.10";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Items.load();
    }
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		MinecraftForge.EVENT_BUS.register(new EventHook());
		Recipes.load();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}
