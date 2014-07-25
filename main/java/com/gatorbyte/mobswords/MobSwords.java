package com.gatorbyte.mobswords;

import java.util.ArrayList;
import java.util.List;

import com.gatorbyte.mobswords.Item.crafting.Recipes;
import com.gatorbyte.mobswords.handler.AttackEntityEventHandler;
import com.gatorbyte.mobswords.proxy.IProxy;
import com.gatorbyte.mobswords.reference.Reference;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = "0.1")

public class MobSwords {
	
	@Mod.Instance("MobSwords")
    public static MobSwords instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	Items.load();
    }
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerEventHandlers();
		Recipes.load();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}
