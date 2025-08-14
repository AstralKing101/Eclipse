package net.anishanay.eclipse.item;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.item.custom.ModArmorItem;
import net.anishanay.eclipse.item.custom.SolarBlade;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
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
      public static final Item SUN_JEWEL = registerItem("sun_jewel", new Item(new Item.Settings()));
      public static final Item LUNAR_CRYSTAL = registerItem("lunar_crystal", new Item(new Item.Settings()));
      public static final Item SILVER_ROD = registerItem("silver_rod", new Item(new Item.Settings()));
      public static final Item GOLDEN_ROD = registerItem("golden_rod", new Item(new Item.Settings()));
      public static final Item SILVER_INGOT = registerItem("silver_ingot", new Item(new Item.Settings()));
      public static final Item RAW_SILVER = registerItem("raw_silver", new Item(new Item.Settings()));
      public static final Item RAW_KYPERNITE = registerItem("raw_kypernite", new Item(new Item.Settings()));
      public static final Item RAW_COSMONITE = registerItem("raw_cosmonite", new Item(new Item.Settings()));
      public static final Item DIVINE_NECTAR = registerItem("divine_nectar", new Item(new Item.Settings().food(ModFoodComponents.DIVINE_NECTAR)));
      public static final Item BOTTLE_OF_SUNLIGHT = registerItem("bottle_of_sunlight", new Item(new Item.Settings().food(ModFoodComponents.BOTTLE_OF_SUNLIGHT)));
      public static final Item BOTTLE_OF_MOONLIGHT = registerItem("bottle_of_moonlight", new Item(new Item.Settings().food(ModFoodComponents.BOTTLE_OF_MOONLIGHT)));
      public static final Item SOLAR_BLADE = registerItem("solar_blade", new SwordItem(ModToolMaterials.SOLARITE, new Item.Settings().attributeModifiers(SolarBlade.createAttributeModifiers(ModToolMaterials.SOLARITE, 10,-3f))));
      public static final Item LUNAR_BLADE = registerItem("lunar_blade", new SwordItem(ModToolMaterials.LUNARITE, new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.LUNARITE, 10,-3f))));

      public static final Item SOLARITE_HELMET = registerItem("solarite_helmet", new ArmorItem(ModArmorMaterials.SOLARITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
      public static final Item SOLARITE_CHESTPLATE = registerItem("solarite_chestplate", new ModArmorItem(ModArmorMaterials.SOLARITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));
      public static final Item SOLARITE_LEGGINGS = registerItem("solarite_leggings", new ArmorItem(ModArmorMaterials.SOLARITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));
      public static final Item SOLARITE_BOOTS = registerItem("solarite_boots", new ArmorItem(ModArmorMaterials.SOLARITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));
      public static final Item LUNARITE_HELMET = registerItem("lunarite_helmet", new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(50))));
      public static final Item LUNARITE_CHESTPLATE = registerItem("lunarite_chestplate", new ModArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(50))));
      public static final Item LUNARITE_LEGGINGS = registerItem("lunarite_leggings", new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(50))));
      public static final Item LUNARITE_BOOTS = registerItem("lunarite_boots", new ArmorItem(ModArmorMaterials.LUNARITE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(50))));


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
            fabricItemGroupEntries.add(ModItems.SUN_JEWEL);

            fabricItemGroupEntries.add(ModItems.LUNAR_CRYSTAL);
            fabricItemGroupEntries.add(ModItems.SILVER_ROD);
            fabricItemGroupEntries.add(ModItems.GOLDEN_ROD);
            fabricItemGroupEntries.add(ModItems.SILVER_INGOT);
            fabricItemGroupEntries.add(ModItems.RAW_SILVER);
            fabricItemGroupEntries.add(ModItems.RAW_COSMONITE);
            fabricItemGroupEntries.add(ModItems.RAW_KYPERNITE);






        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.SOLAR_BLADE);
            fabricItemGroupEntries.add(ModItems.LUNAR_BLADE);

            fabricItemGroupEntries.add(ModItems.SOLARITE_HELMET);
            fabricItemGroupEntries.add(ModItems.SOLARITE_CHESTPLATE);
            fabricItemGroupEntries.add(ModItems.SOLARITE_LEGGINGS);
            fabricItemGroupEntries.add(ModItems.SOLARITE_BOOTS);
            fabricItemGroupEntries.add(ModItems.LUNARITE_HELMET);
            fabricItemGroupEntries.add(ModItems.LUNARITE_CHESTPLATE);
            fabricItemGroupEntries.add(ModItems.LUNARITE_LEGGINGS);
            fabricItemGroupEntries.add(ModItems.LUNARITE_BOOTS);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.DIVINE_NECTAR);
            fabricItemGroupEntries.add(ModItems.BOTTLE_OF_SUNLIGHT);
            fabricItemGroupEntries.add(ModItems.BOTTLE_OF_MOONLIGHT);

        });

    }
}
