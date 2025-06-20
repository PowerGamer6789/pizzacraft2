
package net.mod.pizzacraft_two.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class FireItem extends Item {
	public FireItem() {
		super(new Item.Properties().durability(100).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0.1f;
	}
}
