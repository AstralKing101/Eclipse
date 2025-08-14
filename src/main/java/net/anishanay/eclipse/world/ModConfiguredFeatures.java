package net.anishanay.eclipse.world;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;

import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;

import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;

import java.util.List;


public class ModConfiguredFeatures {
public static final RegistryKey<ConfiguredFeature<?, ?>> ASHWOOD_KEY = registerKey("ashwood");
public static final RegistryKey<ConfiguredFeature<?, ?>> SOLARITE_ORE_KEY = registerKey("solarite_ore");

public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    RuleTest stoneReplaceables = new TagMatchRuleTest((BlockTags.STONE_ORE_REPLACEABLES));
    RuleTest deepslateReplaceables = new TagMatchRuleTest((BlockTags.DEEPSLATE_ORE_REPLACEABLES));
    List<OreFeatureConfig.Target> solarrealmSolariteOres =
            List.of((OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.SOLARITE_ORE.getDefaultState())));
            List.of((OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.SOLARITE_ORE.getDefaultState())));


    register(context, SOLARITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(solarrealmSolariteOres, 4));





        register(context, ASHWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.ASHWOOD_LOG),
                new DarkOakTrunkPlacer(5, 6, 3),

                BlockStateProvider.of(ModBlocks.ASHWOOD_LEAVES),
                new AcaciaFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(1)),

                new TwoLayersFeatureSize(1, 0, 2)).build());

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Eclipse.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}