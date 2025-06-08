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

                      })






                      .build());









     public static void registerItemGroups() {
        Eclipse.LOGGER.info("Registering Mod Item Groups for" + Eclipse.MOD_ID);
    }
}
