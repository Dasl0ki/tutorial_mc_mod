package com.loki.tutorialmod.block;

import com.loki.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

    public static Block tutorialBlock;
    public static Block derpBlock;

    public static void preInit() {

        tutorialBlock = new BlockTutorialBlock(Material.ROCK, "tutorial_block");
        derpBlock = new BlockDerpBlock(Material.ROCK, "derp_block");

        registerBlocks();

    }

    public static void registerBlocks() {
        registerBlock(tutorialBlock, "tutorial_block");
        registerBlock(derpBlock, "derp_block");

    }

    public static void registerBlock(Block block, String name) {

        GameRegistry.register(block, new ResourceLocation(TutorialMod.MODID, name));
        GameRegistry.register(new ItemBlock(block), new ResourceLocation(TutorialMod.MODID, name));


    }

    public static void registerRenders() {

        registerRender(tutorialBlock);
        registerRender(derpBlock);

    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
