
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.mod.pizzacraft_two.block.entity.PizzaOvenOnBlockEntity;
import net.mod.pizzacraft_two.block.entity.PizzaOvenBlockEntity;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class Pizzacraft2ModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> PIZZA_OVEN = register("pizza_oven", Pizzacraft2ModBlocks.PIZZA_OVEN, PizzaOvenBlockEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> LIT_PIZZA_OVEN = register("lit_pizza_oven", Pizzacraft2ModBlocks.LIT_PIZZA_OVEN, PizzaOvenOnBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}

	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, PIZZA_OVEN.get(), (blockEntity, side) -> ((PizzaOvenBlockEntity) blockEntity).getItemHandler());
		event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, LIT_PIZZA_OVEN.get(), (blockEntity, side) -> ((PizzaOvenOnBlockEntity) blockEntity).getItemHandler());
	}
}
