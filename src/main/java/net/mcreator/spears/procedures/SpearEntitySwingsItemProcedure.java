package net.mcreator.spears.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.spears.network.SpearsModVariables;

public class SpearEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("spears:lunge")))) != 0
				&& entity.getData(SpearsModVariables.PLAYER_VARIABLES).SpearLungeCooldown == 0) {
			{
				SpearsModVariables.PlayerVariables _vars = entity.getData(SpearsModVariables.PLAYER_VARIABLES);
				_vars.SpearLungeCooldown = 80;
				_vars.markSyncDirty();
			}
			if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("spears:lunge")))) == 1) {
				entity.push((entity.getDeltaMovement().x() * 1.3), 0, (entity.getDeltaMovement().z() * 1.3));
			} else {
				if (itemstack.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("spears:lunge")))) == 2) {
					entity.push((entity.getDeltaMovement().x() * 1.6), 0, (entity.getDeltaMovement().z() * 1.6));
				} else {
					entity.push((entity.getDeltaMovement().x() * 2), 0, (entity.getDeltaMovement().z() * 2));
				}
			}
		}
	}
}