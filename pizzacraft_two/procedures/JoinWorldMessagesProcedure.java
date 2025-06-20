package net.mod.pizzacraft_two.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@EventBusSubscriber
public class JoinWorldMessagesProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"tellraw @s [\"\",{\"text\":\"PizzaCraft 2 \",\"bold\":true,\"color\":\"gold\"},{\"text\":\"| \",\"color\":\"white\"},{\"text\":\"Make sure to join our \",\"color\":\"yellow\"},{\"text\":\"Discord Server\",\"color\":\"blue\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://discord.gg/s9utzWQftU\"}},{\"text\":\" \\n\"},{\"text\":\"PizzaCraft 2 \",\"bold\":true,\"color\":\"gold\"},{\"text\":\" | \"},{\"text\":\"If you haven't already, \",\"color\":\"yellow\"},{\"text\":\"subscribe \",\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://youtube.com/@PizzaCraft2_Mod\"}},{\"text\":\"to our \",\"color\":\"yellow\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://youtube.com/@PizzaCraft2_Mod\"}},{\"text\":\"YouTube\",\"color\":\"red\",\"clickEvent\":{\"action\":\"open_url\",\"value\":\"https://youtube.com/@PizzaCraft2_Mod\"}},{\"text\":\"\\n \"}]");
			}
		}
	}
}
