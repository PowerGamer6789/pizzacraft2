
package net.mod.pizzacraft_two.item;

import net.mod.pizzacraft_two.Pizzacraft2Mod;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class PizzaTowerSongItem extends Item {
	public PizzaTowerSongItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(Pizzacraft2Mod.MODID, "pizza_tower_song"))));
	}
}
