
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.mod.pizzacraft_two.world.inventory.PizzaOvenGuiMenu;
import net.mod.pizzacraft_two.world.inventory.CheeseGraterGuiMenu;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

public class Pizzacraft2ModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<PizzaOvenGuiMenu>> PIZZA_OVEN_GUI = REGISTRY.register("pizza_oven_gui", () -> IMenuTypeExtension.create(PizzaOvenGuiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<CheeseGraterGuiMenu>> CHEESE_GRATER_GUI = REGISTRY.register("cheese_grater_gui", () -> IMenuTypeExtension.create(CheeseGraterGuiMenu::new));
}
