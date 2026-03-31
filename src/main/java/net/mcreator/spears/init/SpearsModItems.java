/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.spears.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.spears.item.*;
import net.mcreator.spears.SpearsMod;

import java.util.function.Function;

public class SpearsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(SpearsMod.MODID);
	public static final DeferredItem<Item> WOODEN_SPEAR;
	public static final DeferredItem<Item> STONE_SPEAR;
	public static final DeferredItem<Item> COPPER_SPEAR;
	public static final DeferredItem<Item> GOLD_SPEAR;
	public static final DeferredItem<Item> DIAMOND_SPEAR;
	public static final DeferredItem<Item> NETHERITE_SPEAR;
	static {
		WOODEN_SPEAR = register("wooden_spear", WoodenSpearItem::new);
		STONE_SPEAR = register("stone_spear", StoneSpearItem::new);
		COPPER_SPEAR = register("copper_spear", CopperSpearItem::new);
		GOLD_SPEAR = register("gold_spear", GoldSpearItem::new);
		DIAMOND_SPEAR = register("diamond_spear", DiamondSpearItem::new);
		NETHERITE_SPEAR = register("netherite_spear", NetheriteSpearItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}