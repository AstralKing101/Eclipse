package net.anishanay.eclipse.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.Vec3d;

public record ExplosiveEnchantmentEffect() implements EnchantmentEntityEffect {

    public static final MapCodec<ExplosiveEnchantmentEffect> CODEC = MapCodec.unit(ExplosiveEnchantmentEffect::new);
    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if(level == 1) {
            EntityType.TNT.spawn(world, user.getBlockPos(), SpawnReason.TRIGGERED);
        }
        if(level == 2) {
            EntityType.TNT.spawn(world, user.getBlockPos(), SpawnReason.TRIGGERED);
            EntityType.TNT.spawn(world, user.getBlockPos(), SpawnReason.TRIGGERED);

        }


    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
