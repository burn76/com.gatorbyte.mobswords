package com.gatorbyte.MobSwords;


import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MobSwords.modid, version = MobSwords.version)

public class MobSwords {

	public static final String modid = "MobSwords";
	public static final String version = "0.1.0";
	public static final String mcversion = "1.7.10";
	public static final String name = "MobSwords";
	public static final String description = "Fun mod to craft mob spawning swords.";
	public static final String credits = "The Gatorbyte Software Development Team";
	public static final String url = "http://www.gatorbytesoftware.com/mods";
	public static List<String> authorList = new ArrayList<String>();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	authorList.add("pro_slayer");
    	authorList.add("burn81");
    	authorList.add("burn76");
    	event.getModMetadata().version = MobSwords.version;
    	event.getModMetadata().name = MobSwords.name;
    	event.getModMetadata().description = MobSwords.description;
    	event.getModMetadata().authorList = authorList;
    	event.getModMetadata().credits = MobSwords.credits;
    	event.getModMetadata().url = MobSwords.url;
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
