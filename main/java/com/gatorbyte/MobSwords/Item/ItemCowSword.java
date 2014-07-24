package com.gatorbyte.MobSwords.Item;

import com.gatorbyte.MobSwords.MobSwords;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemCowSword extends ItemSword {

	public ItemCowSword()
	{
		super(Item.ToolMaterial.IRON);
		this.setUnlocalizedName("CowSword");
		this.setTextureName(MobSwords.modid + ":" + "CowSword");
	}
}
