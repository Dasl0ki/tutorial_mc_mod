package com.loki.tutorialmod.block;

import com.loki.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

/**
 * Created by thelo on 15.12.2016.
 */
public class BlockDerpBlock extends Block {
    public BlockDerpBlock(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.setCreativeTab(TutorialMod.tabTutorial);
        this.setHardness(10F);
        this.setResistance(50F);
        this.setSoundType(SoundType.STONE);
        this.setLightLevel(1F);
    }
}
