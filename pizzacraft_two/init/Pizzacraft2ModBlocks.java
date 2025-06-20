
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.mod.pizzacraft_two.block.SnowyCheesyGrassBlockBlock;
import net.mod.pizzacraft_two.block.RainbowPizzaStairsBlock;
import net.mod.pizzacraft_two.block.RainbowPizzaSlabBlock;
import net.mod.pizzacraft_two.block.RainbowPizzaBlock;
import net.mod.pizzacraft_two.block.PizzaSauceBlock;
import net.mod.pizzacraft_two.block.PizzaOvenOnBlock;
import net.mod.pizzacraft_two.block.PizzaOvenBlock;
import net.mod.pizzacraft_two.block.PizzaDimensionPortalBlock;
import net.mod.pizzacraft_two.block.PizzaCraft2BricksBlock;
import net.mod.pizzacraft_two.block.FireBlockBlock;
import net.mod.pizzacraft_two.block.CrustBlockBlock;
import net.mod.pizzacraft_two.block.CounterBlock;
import net.mod.pizzacraft_two.block.CheesyGrassBlockBlock;
import net.mod.pizzacraft_two.block.CheeseOreBlock;
import net.mod.pizzacraft_two.block.CheeseLeavesBlock;
import net.mod.pizzacraft_two.block.CheeseGraterBlock;
import net.mod.pizzacraft_two.block.CheeseBlockBlock;
import net.mod.pizzacraft_two.block.CashRegisterBlock;
import net.mod.pizzacraft_two.block.BlockOfPepperoniBlock;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.level.block.Block;

public class Pizzacraft2ModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(Pizzacraft2Mod.MODID);
	public static final DeferredBlock<Block> PIZZA_SAUCE = REGISTRY.register("pizza_sauce", PizzaSauceBlock::new);
	public static final DeferredBlock<Block> BLOCK_OF_PEPPERONI = REGISTRY.register("block_of_pepperoni", BlockOfPepperoniBlock::new);
	public static final DeferredBlock<Block> CHEESE_ORE = REGISTRY.register("cheese_ore", CheeseOreBlock::new);
	public static final DeferredBlock<Block> PIZZA_OVEN = REGISTRY.register("pizza_oven", PizzaOvenBlock::new);
	public static final DeferredBlock<Block> CHEESY_GRASS_BLOCK = REGISTRY.register("cheesy_grass_block", CheesyGrassBlockBlock::new);
	public static final DeferredBlock<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", CheeseBlockBlock::new);
	public static final DeferredBlock<Block> CRUST_BLOCK = REGISTRY.register("crust_block", CrustBlockBlock::new);
	public static final DeferredBlock<Block> CHEESE_LEAVES = REGISTRY.register("cheese_leaves", CheeseLeavesBlock::new);
	public static final DeferredBlock<Block> PIZZA_DIMENSION_PORTAL = REGISTRY.register("pizza_dimension_portal", PizzaDimensionPortalBlock::new);
	public static final DeferredBlock<Block> CASH_REGISTER = REGISTRY.register("cash_register", CashRegisterBlock::new);
	public static final DeferredBlock<Block> FIRE_BLOCK = REGISTRY.register("fire_block", FireBlockBlock::new);
	public static final DeferredBlock<Block> COUNTER = REGISTRY.register("counter", CounterBlock::new);
	public static final DeferredBlock<Block> RAINBOW_PIZZA = REGISTRY.register("rainbow_pizza", RainbowPizzaBlock::new);
	public static final DeferredBlock<Block> RAINBOW_PIZZA_SLAB = REGISTRY.register("rainbow_pizza_slab", RainbowPizzaSlabBlock::new);
	public static final DeferredBlock<Block> RAINBOW_PIZZA_STAIRS = REGISTRY.register("rainbow_pizza_stairs", RainbowPizzaStairsBlock::new);
	public static final DeferredBlock<Block> LIT_PIZZA_OVEN = REGISTRY.register("lit_pizza_oven", PizzaOvenOnBlock::new);
	public static final DeferredBlock<Block> PIZZA_CRAFT_2_BRICKS = REGISTRY.register("pizza_craft_2_bricks", PizzaCraft2BricksBlock::new);
	public static final DeferredBlock<Block> CHEESE_GRATER = REGISTRY.register("cheese_grater", CheeseGraterBlock::new);
	public static final DeferredBlock<Block> SNOWY_CHEESY_GRASS_BLOCK = REGISTRY.register("snowy_cheesy_grass_block", SnowyCheesyGrassBlockBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
