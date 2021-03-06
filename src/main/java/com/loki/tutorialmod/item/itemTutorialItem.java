package com.loki.tutorialmod.item;

import com.loki.tutorialmod.TutorialMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import java.util.List;

public class itemTutorialItem extends ItemSword {

    public itemTutorialItem(ToolMaterial material,String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(TutorialMod.tabTutorial);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Item Tooltip");
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
