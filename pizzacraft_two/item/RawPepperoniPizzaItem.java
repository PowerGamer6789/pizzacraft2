
package net.mod.pizzacraft_two.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawPepperoniPizzaItem extends Item {
	public RawPepperoniPizzaItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
