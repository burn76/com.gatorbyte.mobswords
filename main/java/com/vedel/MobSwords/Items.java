package com.vedel.MobSwords;

import com.vedel.MobSwords.Item.ItemChickenSword;
import com.vedel.MobSwords.Item.ItemCowSword;
import com.vedel.MobSwords.Item.ItemPigSword;
import com.vedel.MobSwords.Item.ItemSheepSword;
import com.vedel.MobSwords.Item.ItemSquidSword;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item PigSword;
	public static Item SheepSword;	
	public static Item CowSword;
	public static Item ChickenSword;
	public static Item SquidSword;
	
	public static void load() {
		PigSword = new ItemPigSword();
        GameRegistry.registerItem(PigSword, "PigSword");
		
        SheepSword = new ItemSheepSword();
        GameRegistry.registerItem(SheepSword, "SheepSword");
        
		CowSword = new ItemCowSword();
        GameRegistry.registerItem(CowSword, "CowSword");
        
        ChickenSword = new ItemChickenSword();
        GameRegistry.registerItem(ChickenSword, "ChickenSword");
        
        SquidSword = new ItemSquidSword();
        GameRegistry.registerItem(SquidSword, "SquidSword");
	}
}
