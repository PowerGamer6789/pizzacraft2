
package net.mod.pizzacraft_two.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SnowyCheesyGrassBlockBlock extends Block {
	public SnowyCheesyGrassBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.POWDER_SNOW).strength(1f, 10f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
