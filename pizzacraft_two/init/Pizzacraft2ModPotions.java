
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.registries.Registries;

public class Pizzacraft2ModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(Registries.POTION, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<Potion, Potion> POTION_OF_PIZZA = REGISTRY.register("potion_of_pizza", () -> new Potion(new MobEffectInstance(Pizzacraft2ModMobEffects.PIZZA_SICKNESS, 3600, 0, false, true)));
}
