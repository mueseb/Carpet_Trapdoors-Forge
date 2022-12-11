package com.example.carpettrapdoors.block;

import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CarpetTrapdoor extends TrapDoorBlock {


    public CarpetTrapdoor(Properties p_249948_, SoundEvent p_250139_, SoundEvent p_248559_) {
        super(p_249948_, p_250139_, p_248559_);
    }

    @Override
    public VoxelShape getShape(BlockState p_57563_, BlockGetter p_57564_, BlockPos p_57565_, CollisionContext p_57566_) {
        if (!p_57563_.getValue(OPEN)) {
            return p_57563_.getValue(HALF) == Half.TOP ? Block.box(0.0, 15.0, 0.0, 16.0, 16.0, 16.0) : Block.box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
        } else {
            switch(p_57563_.getValue(FACING)) {
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
