package com.gatorbyte.MobSwords.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.gatorbyte.MobSwords.MobSwords;

public class ItemSquidSword extends ItemSword {

	public ItemSquidSword()
	{
		super(Item.ToolMaterial.IRON);
		this.setUnlocalizedName("SquidSword");
		this.setTextureName(MobSwords.modid + ":" + "SquidSword");
	}
}
