package com.vedel.MobSwords;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item PigSword;
	public static Item SheepSword;	
	public static Item CowSword;
	
	public static void load() {
		PigSword = new ItemSword(Item.ToolMaterial.IRON).setUnlocalizedName("PigSword").setTextureName(MobSwords.modid + ":" + "PigSword");
        GameRegistry.registerItem(PigSword, "Oink");
		
        SheepSword = new ItemSword(Item.ToolMaterial.IRON).setUnlocalizedName("SheepSword").setTextureName(MobSwords.modid + ":" + "SheepSword");
        GameRegistry.registerItem(SheepSword, "Baa");
        
		CowSword = new ItemSword(Item.ToolMaterial.IRON).setUnlocalizedName("CowSword").setTextureName(MobSwords.modid + ":" + "CowSword");
        GameRegistry.registerItem(CowSword, "Moo");
	}
}
