package at.mueseb.carpettrapdoors.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.Half;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CarpetTrapdoor extends TrapDoorBlock {


    public CarpetTrapdoor(Properties properties, BlockSetType blockSetType) {
        super(properties, blockSetType);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collisionContext) {
        if (!blockState.getValue(OPEN)) {
            return blockState.getValue(HALF) == Half.TOP ? Block.box(0.0, 15.0, 0.0, 16.0, 16.0, 16.0) : Block.box(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
        } else {
            switch(blockState.getValue(FACING)) {
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
