package com.vedel.MobSwords;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item CowSword;	
	public static Item PigSword;
	
	public static void load() {
		CowSword = new Item().setUnlocalizedName("CowSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MobSwords.modid + ":" + "CowSword");
        GameRegistry.registerItem(CowSword, "Moo");
        
        PigSword = new Item().setUnlocalizedName("PigSword").setCreativeTab(CreativeTabs.tabCombat).setTextureName(MobSwords.modid + ":" + "PigSword");
        GameRegistry.registerItem(PigSword, "Oink");
	}
}
