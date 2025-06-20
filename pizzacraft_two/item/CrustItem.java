
package net.mod.pizzacraft_two.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CrustItem extends Item {
	public CrustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
