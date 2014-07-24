package com.gatorbyte.MobSwords;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class EventHook
{

	@SubscribeEvent
	public void entityAttacked(AttackEntityEvent event)
	{	
		EntityPlayer player = event.entityPlayer;
		World world = player.worldObj;
		ItemStack itemStack = player.getCurrentEquippedItem();
		Item item = itemStack.getItem();
		Entity entity = EntityFactory.getEntity(item, world); 
		if(entity != null)
		{
			if(!world.isRemote)
			{
				entity.setLocationAndAngles(event.entity.posX, event.entity.posY + 1, event.entity.posZ, MathHelper.wrapAngleTo180_float(world.rand.nextFloat() * 360.0F), 0.0F);
				world.spawnEntityInWorld(entity);
			}
//			else
//			{
//				//particle can only be spawned on the client
//				Random rand = new Random();
//				for(int i = 0; i <= 20; ++i)
//				{
//					world.spawnParticle("reddust", event.entity.posX + (rand.nextDouble() - 0.5D) * (double)event.entity.width, event.entity.posY + rand.nextDouble() * (double)event.entity.height - (double)event.entity.yOffset, event.entity.posZ + (rand.nextDouble() - 0.5D) * (double)event.entity.width, 0.0D, 0.0D, 0.0D);
//				}	
//			}
		}
		

	}
}