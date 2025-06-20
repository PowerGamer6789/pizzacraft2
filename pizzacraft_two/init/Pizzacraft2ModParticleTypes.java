
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class Pizzacraft2ModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PIZZA_PORTAL_PARTICAL = REGISTRY.register("pizza_portal_partical", () -> new SimpleParticleType(false));
}
