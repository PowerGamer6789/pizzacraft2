
package net.mod.pizzacraft_two.potion;

import net.mod.pizzacraft_two.procedures.PizzaSicknessEffectStartedProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class PizzaSicknessMobEffect extends MobEffect {
	public PizzaSicknessMobEffect() {
		super(MobEffectCategory.HARMFUL, -26368);
	}

	@Override
	public void onEffectStarted(LivingEntity entity, int amplifier) {
		PizzaSicknessEffectStartedProcedure.execute(entity);
	}
}
