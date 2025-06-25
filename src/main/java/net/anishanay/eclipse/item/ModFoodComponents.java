package net.anishanay.eclipse.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent DIVINE_NECTAR = new FoodComponent.Builder().nutrition(10).saturationModifier(5F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.ABSORPTION, 100000, 2), 1.0F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.HEALTH_BOOST, 100000, 2), 1.0F)


            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.REGENERATION, 100000, 2), 1.0F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.RESISTANCE, 100000, 2), 1.0F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 100000, 2), 1.0F)

            .build();


    public static final FoodComponent BOTTLE_OF_SUNLIGHT = new FoodComponent.Builder().nutrition(10).saturationModifier(5F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.ABSORPTION, 100000, 2), 1.0F)

            .build();


    public static final FoodComponent BOTTLE_OF_MOONLIGHT = new FoodComponent.Builder().nutrition(10).saturationModifier(5F)
            .statusEffect(new net.minecraft.entity.effect.StatusEffectInstance(StatusEffects.ABSORPTION, 100000, 2), 1.0F)





            .build();
}
