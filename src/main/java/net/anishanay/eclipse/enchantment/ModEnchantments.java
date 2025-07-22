package net.anishanay.eclipse.enchantment;

import net.anishanay.eclipse.Eclipse;
import net.minecraft.component.type.AttributeModifierSlot;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registerable;

import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntryList;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModEnchantments {
   public static final RegistryKey<Enchantment> STARFALL =
           RegistryKey.of(RegistryKeys.ENCHANTMENT, Identifier.of(Eclipse.MOD_ID, "starfall"));

   public static void bootstrap(Registerable<Enchantment> registerable) {
       var enchantments = registerable.getRegistryLookup(RegistryKeys.ENCHANTMENT);
       var items = registerable.getRegistryLookup(RegistryKeys.ITEM);


       register(registerable, STARFALL, Enchantment.builder(new Enchantment.Definition(
               items.getOrThrow(ItemTags.WEAPON_ENCHANTABLE)),
               Optional.of(items.getOrThrow(ItemTags.SWORD_ENCHANTABLE)),

                5,
                2,

               Enchantment.leveledCost(5,7),
                Enchantment.leveledCost(25,9),

               AttributeModifierSlot.MAINHAND


       )));
   }





    private static void  register(Registerable<Enchantment> registry, RegistryKey<Enchantment> key, Enchantment.Builder builder) {
     registry.register(key, builder.build(key.getValue()));
 }
}

