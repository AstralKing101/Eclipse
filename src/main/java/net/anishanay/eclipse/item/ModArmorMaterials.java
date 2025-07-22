package net.anishanay.eclipse.item;

import net.anishanay.eclipse.Eclipse;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> SOLARITE_ARMOR_MATERIAL = registerArmorMaterial("solarite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.BODY, 15);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.SOLARITE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Eclipse.MOD_ID, "solarite"))), 0,0




                    ));
    public static final RegistryEntry<ArmorMaterial> LUNARITE_ARMOR_MATERIAL = registerArmorMaterial("lunarite",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
                map.put(ArmorItem.Type.BOOTS, 5);
                map.put(ArmorItem.Type.LEGGINGS, 8);
                map.put(ArmorItem.Type.HELMET, 5);
                map.put(ArmorItem.Type.CHESTPLATE, 10);
                map.put(ArmorItem.Type.BODY, 15);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, () -> Ingredient.ofItems(ModItems.LUNARITE),
                    List.of(new ArmorMaterial.Layer(Identifier.of(Eclipse.MOD_ID, "lunarite"))), 0,0




            ));




    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material ) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(Eclipse.MOD_ID, name), material.get());
    }
}
