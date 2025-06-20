
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mod.pizzacraft_two.fluid.PizzaSauceFluid;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

public class Pizzacraft2ModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> PIZZA_SAUCE = REGISTRY.register("pizza_sauce", () -> new PizzaSauceFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_PIZZA_SAUCE = REGISTRY.register("flowing_pizza_sauce", () -> new PizzaSauceFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(PIZZA_SAUCE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_PIZZA_SAUCE.get(), RenderType.translucent());
		}
	}
}
