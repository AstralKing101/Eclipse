package net.anishanay.eclipse.enchantment.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.enchantment.EnchantmentEffectContext;
import net.minecraft.enchantment.effect.EnchantmentEntityEffect;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.projectile.DragonFireballEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public record DragonsBaneEnchantmentEffect() implements EnchantmentEntityEffect {

    public static final MapCodec<DragonsBaneEnchantmentEffect> CODEC = MapCodec.unit(DragonsBaneEnchantmentEffect::new);
    @Override
    public void apply(ServerWorld world, int level, EnchantmentEffectContext context, Entity user, Vec3d pos) {
        if(level == 1) {
            if (user instanceof LivingEntity player) {
                DragonFireballEntity fireball = new DragonFireballEntity(world, player, user.getRotationVector().multiply(2)) {
                    @Override
                    protected void onCollision(HitResult hitResult) {
                        for (int i = 0; i < 3; i++) {
                            super.onCollision(hitResult);
                        }
                    }
                };
                world.spawnEntity(fireball);

            }


        }
    }

    @Override
    public MapCodec<? extends EnchantmentEntityEffect> getCodec() {
        return CODEC;
    }
}
