
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mod.pizzacraft_two.potion.PizzaSicknessMobEffect;
import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

public class Pizzacraft2ModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> PIZZA_SICKNESS = REGISTRY.register("pizza_sickness", () -> new PizzaSicknessMobEffect());
}
