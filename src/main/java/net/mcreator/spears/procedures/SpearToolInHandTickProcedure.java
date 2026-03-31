package net.mcreator.spears.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.spears.network.SpearsModVariables;

public class SpearToolInHandTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SpearsModVariables.PLAYER_VARIABLES).SpearLungeCooldown > 0) {
			{
				SpearsModVariables.PlayerVariables _vars = entity.getData(SpearsModVariables.PLAYER_VARIABLES);
				_vars.SpearLungeCooldown = entity.getData(SpearsModVariables.PLAYER_VARIABLES).SpearLungeCooldown - 1;
				_vars.markSyncDirty();
			}
		}
	}
}