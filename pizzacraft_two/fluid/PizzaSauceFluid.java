
package net.mod.pizzacraft_two.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.mod.pizzacraft_two.init.Pizzacraft2ModItems;
import net.mod.pizzacraft_two.init.Pizzacraft2ModFluids;
import net.mod.pizzacraft_two.init.Pizzacraft2ModFluidTypes;
import net.mod.pizzacraft_two.init.Pizzacraft2ModBlocks;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

public abstract class PizzaSauceFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> Pizzacraft2ModFluidTypes.PIZZA_SAUCE_TYPE.get(), () -> Pizzacraft2ModFluids.PIZZA_SAUCE.get(),
			() -> Pizzacraft2ModFluids.FLOWING_PIZZA_SAUCE.get()).explosionResistance(100f).bucket(() -> Pizzacraft2ModItems.PIZZA_SAUCE_BUCKET.get()).block(() -> (LiquidBlock) Pizzacraft2ModBlocks.PIZZA_SAUCE.get());

	private PizzaSauceFluid() {
		super(PROPERTIES);
	}

	public static class Source extends PizzaSauceFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends PizzaSauceFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
