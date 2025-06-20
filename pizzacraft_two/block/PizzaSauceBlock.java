
package net.mod.pizzacraft_two.block;

import net.mod.pizzacraft_two.init.Pizzacraft2ModFluids;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

public class PizzaSauceBlock extends LiquidBlock {
	public PizzaSauceBlock() {
		super(Pizzacraft2ModFluids.PIZZA_SAUCE.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
