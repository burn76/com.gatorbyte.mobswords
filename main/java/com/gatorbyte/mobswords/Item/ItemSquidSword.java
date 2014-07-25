package com.gatorbyte.mobswords.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

import com.gatorbyte.mobswords.MobSwords;
import com.gatorbyte.mobswords.reference.Reference;

public class ItemSquidSword extends ItemSword {

	public ItemSquidSword(ToolMaterial material)
	{
		super(material);
	}
	
	@Override
    public Item setTextureName(String name)
    {
        this.iconString = Reference.MOD_ID + ":" + name;
        return this;
    }
}
