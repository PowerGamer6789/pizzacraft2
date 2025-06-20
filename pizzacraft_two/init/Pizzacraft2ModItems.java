
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mod.pizzacraft_two.item.SteelItem;
import net.mod.pizzacraft_two.item.SnowyPepperoniPizzaItem;
import net.mod.pizzacraft_two.item.SnowyCheesePizzaItem;
import net.mod.pizzacraft_two.item.RawPepperoniPizzaItem;
import net.mod.pizzacraft_two.item.RainbowDyeItem;
import net.mod.pizzacraft_two.item.PizzaTowerSongItem;
import net.mod.pizzacraft_two.item.PizzaSwordItem;
import net.mod.pizzacraft_two.item.PizzaShovelItem;
import net.mod.pizzacraft_two.item.PizzaSauceItem;
import net.mod.pizzacraft_two.item.PizzaPickaxeItem;
import net.mod.pizzacraft_two.item.PizzaHoeItem;
import net.mod.pizzacraft_two.item.PizzaDimensionItem;
import net.mod.pizzacraft_two.item.PizzaBowItem;
import net.mod.pizzacraft_two.item.PizzaAxeItem;
import net.mod.pizzacraft_two.item.PizzaArmorItem;
import net.mod.pizzacraft_two.item.PepperoniItem;
import net.mod.pizzacraft_two.item.FireItem;
import net.mod.pizzacraft_two.item.CrustItem;
import net.mod.pizzacraft_two.item.CookedPepperoniPizzaItem;
import net.mod.pizzacraft_two.item.CookedCheesePizzaItem;
import net.mod.pizzacraft_two.item.CheeseStringItem;
import net.mod.pizzacraft_two.item.CheesePizzaItem;
import net.mod.pizzacraft_two.item.CheeseItem;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class Pizzacraft2ModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(Pizzacraft2Mod.MODID);
	public static final DeferredItem<Item> PIZZA_SAUCE_BUCKET = REGISTRY.register("pizza_sauce_bucket", PizzaSauceItem::new);
	public static final DeferredItem<Item> BLOCK_OF_PEPPERONI = block(Pizzacraft2ModBlocks.BLOCK_OF_PEPPERONI);
	public static final DeferredItem<Item> PEPPERONI = REGISTRY.register("pepperoni", PepperoniItem::new);
	public static final DeferredItem<Item> CHEESE = REGISTRY.register("cheese", CheeseItem::new);
	public static final DeferredItem<Item> CHEESE_ORE = block(Pizzacraft2ModBlocks.CHEESE_ORE);
	public static final DeferredItem<Item> CRUST = REGISTRY.register("crust", CrustItem::new);
	public static final DeferredItem<Item> RAW_CHEESE_PIZZA = REGISTRY.register("raw_cheese_pizza", CheesePizzaItem::new);
	public static final DeferredItem<Item> CHEESE_STRING = REGISTRY.register("cheese_string", CheeseStringItem::new);
	public static final DeferredItem<Item> COOKED_CHEESE_PIZZA = REGISTRY.register("cooked_cheese_pizza", CookedCheesePizzaItem::new);
	public static final DeferredItem<Item> FIRE = REGISTRY.register("fire", FireItem::new);
	public static final DeferredItem<Item> RAW_PEPPERONI_PIZZA = REGISTRY.register("raw_pepperoni_pizza", RawPepperoniPizzaItem::new);
	public static final DeferredItem<Item> COOKED_PEPPERONI_PIZZA = REGISTRY.register("cooked_pepperoni_pizza", CookedPepperoniPizzaItem::new);
	public static final DeferredItem<Item> PIZZA_OVEN = block(Pizzacraft2ModBlocks.PIZZA_OVEN);
	public static final DeferredItem<Item> PIZZA_TOWER_SONG = REGISTRY.register("pizza_tower_song", PizzaTowerSongItem::new);
	public static final DeferredItem<Item> PIZZA_SWORD = REGISTRY.register("pizza_sword", PizzaSwordItem::new);
	public static final DeferredItem<Item> CHEESY_GRASS_BLOCK = block(Pizzacraft2ModBlocks.CHEESY_GRASS_BLOCK);
	public static final DeferredItem<Item> CHEESE_BLOCK = block(Pizzacraft2ModBlocks.CHEESE_BLOCK);
	public static final DeferredItem<Item> CRUST_BLOCK = block(Pizzacraft2ModBlocks.CRUST_BLOCK);
	public static final DeferredItem<Item> CHEESE_LEAVES = block(Pizzacraft2ModBlocks.CHEESE_LEAVES);
	public static final DeferredItem<Item> PIZZA_DIMENSION = REGISTRY.register("pizza_dimension", PizzaDimensionItem::new);
	public static final DeferredItem<Item> CASH_REGISTER = block(Pizzacraft2ModBlocks.CASH_REGISTER);
	public static final DeferredItem<Item> STEEL = REGISTRY.register("steel", SteelItem::new);
	public static final DeferredItem<Item> FIRE_BLOCK = block(Pizzacraft2ModBlocks.FIRE_BLOCK);
	public static final DeferredItem<Item> PIZZA_ARMOR_HELMET = REGISTRY.register("pizza_armor_helmet", PizzaArmorItem.Helmet::new);
	public static final DeferredItem<Item> PIZZA_ARMOR_CHESTPLATE = REGISTRY.register("pizza_armor_chestplate", PizzaArmorItem.Chestplate::new);
	public static final DeferredItem<Item> PIZZA_ARMOR_LEGGINGS = REGISTRY.register("pizza_armor_leggings", PizzaArmorItem.Leggings::new);
	public static final DeferredItem<Item> PIZZA_ARMOR_BOOTS = REGISTRY.register("pizza_armor_boots", PizzaArmorItem.Boots::new);
	public static final DeferredItem<Item> COUNTER = block(Pizzacraft2ModBlocks.COUNTER);
	public static final DeferredItem<Item> PIZZA_PICKAXE = REGISTRY.register("pizza_pickaxe", PizzaPickaxeItem::new);
	public static final DeferredItem<Item> PIZZA_AXE = REGISTRY.register("pizza_axe", PizzaAxeItem::new);
	public static final DeferredItem<Item> PIZZA_HOE = REGISTRY.register("pizza_hoe", PizzaHoeItem::new);
	public static final DeferredItem<Item> PIZZA_SHOVEL = REGISTRY.register("pizza_shovel", PizzaShovelItem::new);
	public static final DeferredItem<Item> RAINBOW_DYE = REGISTRY.register("rainbow_dye", RainbowDyeItem::new);
	public static final DeferredItem<Item> RAINBOW_PIZZA = block(Pizzacraft2ModBlocks.RAINBOW_PIZZA);
	public static final DeferredItem<Item> RAINBOW_PIZZA_SLAB = block(Pizzacraft2ModBlocks.RAINBOW_PIZZA_SLAB);
	public static final DeferredItem<Item> RAINBOW_PIZZA_STAIRS = block(Pizzacraft2ModBlocks.RAINBOW_PIZZA_STAIRS);
	public static final DeferredItem<Item> LIT_PIZZA_OVEN = block(Pizzacraft2ModBlocks.LIT_PIZZA_OVEN);
	public static final DeferredItem<Item> PIZZA_CRAFT_2_BRICKS = block(Pizzacraft2ModBlocks.PIZZA_CRAFT_2_BRICKS);
	public static final DeferredItem<Item> PIZZA_BOW = REGISTRY.register("pizza_bow", PizzaBowItem::new);
	public static final DeferredItem<Item> CHEESE_GRATER = block(Pizzacraft2ModBlocks.CHEESE_GRATER);
	public static final DeferredItem<Item> SNOWY_CHEESE_PIZZA = REGISTRY.register("snowy_cheese_pizza", SnowyCheesePizzaItem::new);
	public static final DeferredItem<Item> SNOWY_PEPPERONI_PIZZA = REGISTRY.register("snowy_pepperoni_pizza", SnowyPepperoniPizzaItem::new);
	public static final DeferredItem<Item> SNOWY_CHEESY_GRASS_BLOCK = block(Pizzacraft2ModBlocks.SNOWY_CHEESY_GRASS_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
