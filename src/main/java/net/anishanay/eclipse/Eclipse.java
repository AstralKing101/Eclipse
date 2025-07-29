package net.anishanay.eclipse;

import net.anishanay.eclipse.block.ModBlocks;
import net.anishanay.eclipse.enchantment.ModEnchantmentEffects;
import net.anishanay.eclipse.enchantment.ModEnchantments;
import net.anishanay.eclipse.item.ModItemGroups;
import net.anishanay.eclipse.item.ModItems;
import net.anishanay.eclipse.item.custom.ModArmorItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.client.session.telemetry.TelemetryLogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Eclipse implements ModInitializer {
	public static final String MOD_ID = "eclipse";




	public static final Logger LOGGER = LoggerFactory.getLogger(Eclipse.class);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModEnchantmentEffects.registerEnchantmentEffects();




	}
}