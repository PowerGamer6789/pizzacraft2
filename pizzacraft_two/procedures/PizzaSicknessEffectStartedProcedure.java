package net.mod.pizzacraft_two.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class PizzaSicknessEffectStartedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player)
			_player.getFoodData().setFoodLevel(1);
	}
}
