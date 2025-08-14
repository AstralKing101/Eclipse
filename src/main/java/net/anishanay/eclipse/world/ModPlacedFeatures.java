package net.anishanay.eclipse.world;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.block.ModBlocks;
import net.anishanay.eclipse.world.gen.ModOrePlacement;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
public static final RegistryKey<PlacedFeature> ASHWOOD_PLACED_KEY = registerKey("ashwood_placed");
public static final RegistryKey<PlacedFeature> SOLARITE_ORE_PLACED_KEY = registerKey("solarite_ore_placed");



public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

    register(context, SOLARITE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SOLARITE_ORE_KEY),
            ModOrePlacement.modifiersWithCount(4,
                    HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(80))));



        register(context, ASHWOOD_PLACED_KEY, configuredFeatures.getOrThrow((ModConfiguredFeatures.ASHWOOD_KEY)
        ), VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2), ModBlocks.ASHWOOD_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Eclipse.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}