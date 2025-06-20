
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mod.pizzacraft_two.client.gui.PizzaOvenGuiScreen;
import net.mod.pizzacraft_two.client.gui.CheeseGraterGuiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class Pizzacraft2ModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(Pizzacraft2ModMenus.PIZZA_OVEN_GUI.get(), PizzaOvenGuiScreen::new);
		event.register(Pizzacraft2ModMenus.CHEESE_GRATER_GUI.get(), CheeseGraterGuiScreen::new);
	}
}
