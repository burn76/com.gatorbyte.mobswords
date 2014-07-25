package com.gatorbyte.mobswords.proxy;

import net.minecraftforge.common.MinecraftForge;

import com.gatorbyte.mobswords.handler.AttackEntityEventHandler;

public class CommonProxy implements IProxy
{
    @Override
    public void registerEventHandlers()
    {
    	MinecraftForge.EVENT_BUS.register(new AttackEntityEventHandler());
    }
    
    @Override
    public void registerTileEntities()
    {

    }

	@Override
	public void initRenderingAndTextures() 
	{
				
	}
}
