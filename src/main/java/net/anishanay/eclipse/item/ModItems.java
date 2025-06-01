package net.anishanay.eclipse.item;

import net.anishanay.eclipse.Eclipse;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item LUNARITE = registerItem("lunarite", new Item(new Item.Settings()));
      public static final Item KYPERNITE = registerItem("kypernite", new Item(new Item.Settings()));
      public static final Item SOLARITE = registerItem("solarite", new Item(new Item.Settings()));
      public static final Item COSMONITE = registerItem("cosmonite", new Item(new Item.Settings()));
      public static final Item ECLIPSINITE = registerItem("eclipsinite", new Item(new Item.Settings()));
      public static final Item SUN_JEWEL_FRAGMENT = registerItem("sun_jewel_fragment", new Item(new Item.Settings()));
      public static final Item LUNAR_CRYSTAL_SHARD = registerItem("lunar_crystal_shard", new Item(new Item.Settings()));
      public static final Item RAW_SOLARITE = registerItem("raw_solarite", new Item(new Item.Settings()));
      public static final Item RAW_LUNARITE = registerItem("raw_lunarite", new Item(new Item.Settings()));

      private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Eclipse.MOD_ID, name), item);
    }


    public static void registerModItems() {
        Eclipse.LOGGER.info("Registering Mod Items for" + Eclipse.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.LUNARITE);
            fabricItemGroupEntries.add(ModItems.KYPERNITE);
            fabricItemGroupEntries.add(ModItems.SOLARITE);
            fabricItemGroupEntries.add(ModItems.COSMONITE);
            fabricItemGroupEntries.add(ModItems.ECLIPSINITE);
            fabricItemGroupEntries.add(ModItems.SUN_JEWEL_FRAGMENT);
            fabricItemGroupEntries.add(ModItems.LUNAR_CRYSTAL_SHARD);
            fabricItemGroupEntries.add(ModItems.RAW_LUNARITE);
            fabricItemGroupEntries.add(ModItems.RAW_SOLARITE);
        });
    }
}
