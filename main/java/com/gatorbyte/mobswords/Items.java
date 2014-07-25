package com.gatorbyte.mobswords;

import com.gatorbyte.mobswords.Item.ItemChickenSword;
import com.gatorbyte.mobswords.Item.ItemCowSword;
import com.gatorbyte.mobswords.Item.ItemPigSword;
import com.gatorbyte.mobswords.Item.ItemSheepSword;
import com.gatorbyte.mobswords.Item.ItemSquidSword;

import net.minecraft.item.Item;
import cpw.mods.fml.common.registry.GameRegistry;

public class Items {
	
	public static Item PigSword;
	public static Item SheepSword;	
	public static Item CowSword;
	public static Item ChickenSword;
	public static Item SquidSword;
	
	public static void load() {
		PigSword = new ItemPigSword(Item.ToolMaterial.WOOD).setTextureName("PigSword").setUnlocalizedName("PigSword");;
        GameRegistry.registerItem(PigSword, "PigSword");
		
        SheepSword = new ItemSheepSword(Item.ToolMaterial.WOOD).setTextureName("SheepSword").setUnlocalizedName("SheepSword");;
        GameRegistry.registerItem(SheepSword, "SheepSword");
        
		CowSword = new ItemCowSword(Item.ToolMaterial.WOOD).setTextureName("CowSword").setUnlocalizedName("CowSword");;
        GameRegistry.registerItem(CowSword, "CowSword");
        
        ChickenSword = new ItemChickenSword(Item.ToolMaterial.WOOD).setTextureName("ChickenSword").setUnlocalizedName("ChickenSword");
        GameRegistry.registerItem(ChickenSword, "ChickenSword");
        
        SquidSword = new ItemSquidSword(Item.ToolMaterial.WOOD).setTextureName("SquidSword").setUnlocalizedName("SquidSword");;
        GameRegistry.registerItem(SquidSword, "SquidSword");
	}
}
