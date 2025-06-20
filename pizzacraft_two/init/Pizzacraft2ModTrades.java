
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class Pizzacraft2ModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == Pizzacraft2ModVillagerProfessions.PIZZA_CHEF.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(Pizzacraft2ModItems.COOKED_CHEESE_PIZZA.get(), 12), 16, 9, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.EMERALD, 8), new ItemStack(Pizzacraft2ModItems.PEPPERONI.get(), 8), new ItemStack(Pizzacraft2ModItems.COOKED_PEPPERONI_PIZZA.get(), 12), 16, 9, 0.05f));
		}
		if (event.getType() == Pizzacraft2ModVillagerProfessions.PIZZA_CHEF.get()) {
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EMERALD, 24), new ItemStack(Pizzacraft2ModBlocks.PIZZA_OVEN.get()), 2, 6, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Pizzacraft2ModBlocks.PIZZA_OVEN.get()), new ItemStack(Pizzacraft2ModItems.FIRE.get()), new ItemStack(Pizzacraft2ModBlocks.LIT_PIZZA_OVEN.get()), 10, 5, 0.05f));
		}
		if (event.getType() == Pizzacraft2ModVillagerProfessions.PIZZA_CHEF.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Pizzacraft2ModItems.COOKED_CHEESE_PIZZA.get()), 12, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD), new ItemStack(Pizzacraft2ModItems.PEPPERONI.get(), 8), new ItemStack(Pizzacraft2ModItems.COOKED_PEPPERONI_PIZZA.get()), 12, 5, 0.05f));
		}
		if (event.getType() == Pizzacraft2ModVillagerProfessions.PIZZA_CHEF.get()) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(Pizzacraft2ModItems.PIZZA_ARMOR_CHESTPLATE.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Pizzacraft2ModItems.PIZZA_ARMOR_BOOTS.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3), new ItemStack(Pizzacraft2ModItems.PIZZA_ARMOR_HELMET.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5), new ItemStack(Pizzacraft2ModItems.PIZZA_ARMOR_LEGGINGS.get()), 10, 5, 0.05f));
		}
		if (event.getType() == Pizzacraft2ModVillagerProfessions.PIZZA_CHEF.get()) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Pizzacraft2ModItems.PIZZA_PICKAXE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 9), new ItemStack(Pizzacraft2ModItems.PIZZA_SWORD.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 64), new ItemStack(Items.EMERALD, 5), new ItemStack(Pizzacraft2ModItems.PIZZA_HOE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 7), new ItemStack(Pizzacraft2ModItems.PIZZA_AXE.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.EMERALD, 4), new ItemStack(Pizzacraft2ModItems.PIZZA_SHOVEL.get()), 10, 5, 0.05f));
		}
	}
}
