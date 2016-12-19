package com.loki.tutorialmod.block;

import com.loki.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import javax.annotation.Nullable;

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

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        if(!worldIn.isRemote) {
            if(playerIn.isSneaking() == true) {
                if(hand == EnumHand.MAIN_HAND) {
                    playerIn.addChatComponentMessage(new TextComponentString("Herp Derp"));
                    //worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
                    worldIn.destroyBlock(pos, true);
                }
            }
        }
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }
}
