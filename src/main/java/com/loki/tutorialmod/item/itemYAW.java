package com.loki.tutorialmod.item;

import com.loki.tutorialmod.TutorialMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import java.util.List;

public class itemYAW extends Item {

    public itemYAW(String name) {
        setUnlocalizedName(name);
        setCreativeTab(TutorialMod.tabTutorial);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        tooltip.add("Moar wrenches");
        tooltip.add("unlocal: " + stack.getUnlocalizedName().substring(5));
        super.addInformation(stack, playerIn, tooltip, advanced);
    }
}
