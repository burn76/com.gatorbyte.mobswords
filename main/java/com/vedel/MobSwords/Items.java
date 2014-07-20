package com.vedel.MobSwords;

import com.vedel.MobSwords.Item.ItemChickenSword;
import com.vedel.MobSwords.Item.ItemCowSword;
import com.vedel.MobSwords.Item.ItemPigSword;
import com.vedel.MobSwords.Item.ItemSheepSword;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item PigSword;
	public static Item SheepSword;	
	public static Item CowSword;
	public static Item ChickenSword;
	
	public static void load() {
		PigSword = new ItemPigSword();
        GameRegistry.registerItem(PigSword, "Oink");
		
        SheepSword = new ItemSheepSword();
        GameRegistry.registerItem(SheepSword, "Baa");
        
		CowSword = new ItemCowSword();
        GameRegistry.registerItem(CowSword, "Moo");
        
        ChickenSword = new ItemChickenSword();
        GameRegistry.registerItem(ChickenSword, "Cluck");
	}
}
