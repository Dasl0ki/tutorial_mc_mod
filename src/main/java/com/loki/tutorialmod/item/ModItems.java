package com.loki.tutorialmod.item;

import com.loki.tutorialmod.TutorialMod;
import javafx.scene.control.Tab;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

    public static Item tutorialItem;
    public static Item YAW;

    public static void preInit() {

        tutorialItem = new itemTutorialItem(EnumHelper.addToolMaterial("TUTORIAL", 3, 1, 8.0F, 10.0F, 10), "tutorial_item");
        YAW = new itemYAW("item_yaw");
        registerItems();

    }

    public static void registerItems() {

        GameRegistry.register(tutorialItem, new ResourceLocation(TutorialMod.MODID, "tutorial_item"));
        GameRegistry.register(YAW, new ResourceLocation(TutorialMod.MODID, "item_yaw"));

    }

    public static void registerRenders() {
        registerRender(tutorialItem);
        registerRender(YAW);
    }

    public static void registerRender(Item item) {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TutorialMod.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }
}
