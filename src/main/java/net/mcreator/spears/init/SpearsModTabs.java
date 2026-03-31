/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spears.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import net.mcreator.spears.SpearsMod;

@EventBusSubscriber
public class SpearsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpearsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(SpearsModItems.WOODEN_SPEAR.get());
			tabData.accept(SpearsModItems.STONE_SPEAR.get());
			tabData.accept(SpearsModItems.COPPER_SPEAR.get());
			tabData.accept(SpearsModItems.GOLD_SPEAR.get());
			tabData.accept(SpearsModItems.DIAMOND_SPEAR.get());
			tabData.accept(SpearsModItems.NETHERITE_SPEAR.get());
		}
	}
}