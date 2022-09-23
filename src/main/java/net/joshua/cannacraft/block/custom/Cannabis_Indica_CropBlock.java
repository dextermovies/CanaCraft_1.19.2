package net.joshua.cannacraft.block.custom;

import net.joshua.cannacraft.block.ModBlocks;
import net.joshua.cannacraft.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class Cannabis_Indica_CropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 6);

    public Cannabis_Indica_CropBlock(Properties properties) {super(properties);}

    @Override
    protected ItemLike getBaseSeedId() {return ModItems.CANNABIS_INDICA_SEEDS.get();}

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
    
    }