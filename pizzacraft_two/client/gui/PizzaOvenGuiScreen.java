package net.mod.pizzacraft_two.client.gui;

import net.mod.pizzacraft_two.world.inventory.PizzaOvenGuiMenu;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class PizzaOvenGuiScreen extends AbstractContainerScreen<PizzaOvenGuiMenu> {
	private final static HashMap<String, Object> guistate = PizzaOvenGuiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public PizzaOvenGuiScreen(PizzaOvenGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = ResourceLocation.parse("pizzacraft2:textures/screens/pizza_oven_gui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics, mouseX, mouseY, partialTicks);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.pizzacraft2.pizza_oven_gui.label_pizza_oven"), 39, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pizzacraft2.pizza_oven_gui.label_there_is_a_gui_here"), 35, 26, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pizzacraft2.pizza_oven_gui.label_if_you_did_that"), 45, 49, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.pizzacraft2.pizza_oven_gui.label_is_so_embarrassing"), 37, 58, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
	}
}
