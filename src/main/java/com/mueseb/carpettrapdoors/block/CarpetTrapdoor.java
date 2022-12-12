package com.mueseb.carpettrapdoors.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapDoorBlock;
import net.minecraft.state.properties.Half;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class CarpetTrapdoor extends TrapDoorBlock {

    public CarpetTrapdoor(Properties p_i48307_1_) {
        super(p_i48307_1_);
    }

    @Override
    public VoxelShape getShape(BlockState p_220053_1_, IBlockReader p_220053_2_, BlockPos p_220053_3_, ISelectionContext p_220053_4_) {
        if (!p_220053_1_.getValue(OPEN)) {
            return p_220053_1_.getValue(HALF) == Half.TOP ? Block.box(0.0, 15.0, 0.0, 16.0, 16.0, 16.0) : Block.box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
        } else {
            switch(p_220053_1_.getValue(FACING)) {
                case NORTH:
                default:
                    return Block.box(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
                case SOUTH:
                    return Block.box(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
                case WEST:
                    return Block.box(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
                case EAST:
                    return Block.box(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
            }
        }
    }
}
