package net.anishanay.eclipse.item;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
      public static final ItemGroup ECLIPSE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
              Identifier.of(Eclipse.MOD_ID, "eclipse_items"),
              FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.ECLIPSINITE))
                      .displayName(Text.translatable("itemgroup.eclipse.eclipse"))
                      .entries((displayContext, entries) -> {
                          entries.add(ModItems.ECLIPSINITE);
                          entries.add(ModItems.LUNARITE);
                          entries.add(ModItems.LUNAR_CRYSTAL_SHARD);
                          entries.add(ModItems.RAW_LUNARITE);
                          entries.add(ModItems.SOLARITE);
                          entries.add(ModItems.SOLARITE_HELMET);
                          entries.add(ModItems.SOLARITE_LEGGINGS);
                          entries.add(ModItems.SOLARITE_CHESTPLATE);
                          entries.add(ModItems.SOLARITE_BOOTS);
                          entries.add(ModItems.LUNARITE_HELMET);
                          entries.add(ModItems.LUNARITE_LEGGINGS);
                          entries.add(ModItems.LUNARITE_CHESTPLATE);
                          entries.add(ModItems.LUNARITE_BOOTS);
                          entries.add(ModItems.RAW_SOLARITE);
                          entries.add(ModItems.KYPERNITE);
                          entries.add(ModItems.SUN_JEWEL_FRAGMENT);
                          entries.add(ModItems.COSMONITE);
                          entries.add(ModBlocks.LUNARITE_BLOCK);
                          entries.add(ModBlocks.SOLARITE_BLOCK);
                          entries.add(ModBlocks.LUNARITE_ORE);
                          entries.add(ModBlocks.SOLARITE_ORE);
                          entries.add(ModItems.SUN_JEWEL);
                          entries.add(ModItems.LUNAR_CRYSTAL);
                          entries.add(ModItems.SILVER_ROD);
                          entries.add(ModItems.GOLDEN_ROD);
                          entries.add(ModItems.SILVER_INGOT);
                          entries.add(ModItems.RAW_SILVER);
                          entries.add(ModBlocks.SUN_STONE);
                          entries.add(ModBlocks.MOON_STONE);
                          entries.add(ModItems.DIVINE_NECTAR);
                          entries.add(ModItems.BOTTLE_OF_SUNLIGHT);
                          entries.add(ModItems.BOTTLE_OF_MOONLIGHT);
                          entries.add(ModItems.RAW_KYPERNITE);
                          entries.add(ModItems.RAW_COSMONITE);
                          entries.add(ModItems.SOLAR_BLADE);

                          entries.add(ModItems.LUNAR_BLADE);
                          entries.add(ModBlocks.ASHWOOD_LOG);
                          entries.add(ModBlocks.ASHWOOD_PLANKS);
                          entries.add(ModBlocks.ASHWOOD_LEAVES);
                          entries.add(ModBlocks.GLIMMERWOOD_LOG);
                          entries.add(ModBlocks.GLIMMERWOOD_LEAVES);
                          entries.add(ModBlocks.GLIMMERWOOD_PLANKS);
                          entries.add(ModBlocks.SUNBURNT_GRASS_BLOCK);
                          entries.add(ModBlocks.ASHWOOD_SAPLING);
                          entries.add(ModBlocks.COSMONITE_ORE);
                          entries.add(ModBlocks.KYPERNITE_ORE);
                          entries.add(ModBlocks.SILVER_ORE);



                      })






                      .build());









     public static void registerItemGroups() {
        Eclipse.LOGGER.info("Registering Mod Item Groups for" + Eclipse.MOD_ID);
    }
}
