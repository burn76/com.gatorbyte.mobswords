package com.vedel.MobSwords;

import com.vedel.MobSwords.Item.ItemCowSword;
import com.vedel.MobSwords.Item.ItemPigSword;
import com.vedel.MobSwords.Item.ItemSheepSword;
import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item PigSword;
	public static Item SheepSword;	
	public static Item CowSword;
	
	public static void load() {
		PigSword = new ItemPigSword().setUnlocalizedName("PigSword").setTextureName(MobSwords.modid + ":" + "PigSword");
        GameRegistry.registerItem(PigSword, "Oink");
		
        SheepSword = new ItemSheepSword().setUnlocalizedName("SheepSword").setTextureName(MobSwords.modid + ":" + "SheepSword");
        GameRegistry.registerItem(SheepSword, "Baa");
        
		CowSword = new ItemCowSword().setUnlocalizedName("CowSword").setTextureName(MobSwords.modid + ":" + "CowSword");
        GameRegistry.registerItem(CowSword, "Moo");
	}
}
