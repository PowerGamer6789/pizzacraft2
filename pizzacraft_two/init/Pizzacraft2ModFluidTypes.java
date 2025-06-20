
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mod.pizzacraft_two.fluid.types.PizzaSauceFluidType;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

public class Pizzacraft2ModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<FluidType, FluidType> PIZZA_SAUCE_TYPE = REGISTRY.register("pizza_sauce", () -> new PizzaSauceFluidType());
}
