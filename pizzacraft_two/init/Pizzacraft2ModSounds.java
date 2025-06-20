
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mod.pizzacraft_two.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class Pizzacraft2ModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, Pizzacraft2Mod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> PIZZA_SONG = REGISTRY.register("pizza_song", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("pizzacraft2", "pizza_song")));
}
