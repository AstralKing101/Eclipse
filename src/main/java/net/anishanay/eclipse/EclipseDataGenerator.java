package net.anishanay.eclipse;


import net.anishanay.eclipse.datagen.ModModelProvider;
import net.anishanay.eclipse.datagen.ModRegistryDataGenerator;
import net.anishanay.eclipse.enchantment.ModEnchantments;
import net.anishanay.eclipse.world.ModConfiguredFeatures;
import net.anishanay.eclipse.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.client.gui.screen.pack.ResourcePackOrganizer;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class EclipseDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(ModRegistryDataGenerator::new);
		pack.addProvider(ModModelProvider::new);


	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder
				.addRegistry(RegistryKeys.ENCHANTMENT, ModEnchantments::bootstrap);
		registryBuilder
				.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder
				.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);



	}
}
