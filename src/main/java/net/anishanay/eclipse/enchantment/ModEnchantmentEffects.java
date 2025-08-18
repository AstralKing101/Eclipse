package net.anishanay.eclipse.enchantment;


import com.mojang.serialization.MapCodec;
import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.enchantment.custom.DragonsBaneEnchantmentEffect;
import net.anishanay.eclipse.enchantment.custom.ExplosiveEnchantmentEffect;
import net.anishanay.eclipse.enchantment.custom.StarfallEnchantmentEffect;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantmentEffects {
   public static final MapCodec<? extends EnchantmentEntityEffect> STARFALL =
           registerEntityEffect("starfall", StarfallEnchantmentEffect.CODEC);


    private static MapCodec<? extends EnchantmentEntityEffect> registerEntityEffect(String name,
                                                                                    MapCodec<? extends EnchantmentEntityEffect> codec) {
         return Registry.register(Registries.ENCHANTMENT_ENTITY_EFFECT_TYPE, Identifier.of(Eclipse.MOD_ID, name), codec);
    }
    public static final MapCodec<? extends EnchantmentEntityEffect> DRAGONS_BANE =
            registerEntityEffect("dragons_bane", DragonsBaneEnchantmentEffect.CODEC);
    public static final MapCodec<? extends EnchantmentEntityEffect> EXPLOSIVE =
            registerEntityEffect("explosive", ExplosiveEnchantmentEffect.CODEC);







    public static void  registerEnchantmentEffects() {

    }
}
