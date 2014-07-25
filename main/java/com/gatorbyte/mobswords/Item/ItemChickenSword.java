package com.gatorbyte.mobswords.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

import com.gatorbyte.mobswords.MobSwords;
import com.gatorbyte.mobswords.reference.Reference;

public class ItemChickenSword extends ItemSword {

	public ItemChickenSword(ToolMaterial material)
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
