
package net.mod.pizzacraft_two.item;

import net.mod.pizzacraft_two.init.Pizzacraft2ModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class PizzaSauceItem extends BucketItem {
	public PizzaSauceItem() {
		super(Pizzacraft2ModFluids.PIZZA_SAUCE.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
