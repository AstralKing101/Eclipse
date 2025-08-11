package net.anishanay.eclipse.world.gen.tree;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator ASHWOOD = new SaplingGenerator(Eclipse.MOD_ID + ":ashwood",
            Optional.empty(), Optional.of(ModConfiguredFeatures.ASHWOOD_KEY), Optional.empty());
}
