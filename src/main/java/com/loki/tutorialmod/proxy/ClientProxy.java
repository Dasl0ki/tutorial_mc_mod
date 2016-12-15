package com.loki.tutorialmod.proxy;

import com.loki.tutorialmod.block.ModBlocks;
import com.loki.tutorialmod.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void init(FMLInitializationEvent event) {

        ModItems.registerRenders();
        ModBlocks.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event) {

    }
}
