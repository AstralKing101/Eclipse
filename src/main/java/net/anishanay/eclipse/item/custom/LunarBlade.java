package net.anishanay.eclipse.item.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class LunarBlade extends SwordItem {

    public LunarBlade(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public int getMaxUseTime(ItemStack stack, LivingEntity user) {
        return 60;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 40, 2, false, false, true));
        user.setCurrentHand(hand);
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    @Override
    public void onStoppedUsing(ItemStack stack, World world, LivingEntity user, int remainingUseTicks) {
        if (!(user instanceof PlayerEntity player)) return;

        int chargeTime = getMaxUseTime(stack, player) - remainingUseTicks;
        float chargePercent = Math.min(chargeTime / 60f, 1.0f);

        int beamCount = (int) (3 + chargePercent * 10);
        int rings = (int) (3 + chargePercent * 3);
        float damage = 5f + chargePercent * 15f;

        final int MAX_DISTANCE = 100;
        final int TICK_PROGRESS = 1;
        final boolean INCLUDE_FLUIDS = false;

        Vec3d start;
        Vec3d end;
        HitResult result;

        if (!player.isSneaking()) {
            result = player.raycast(MAX_DISTANCE, TICK_PROGRESS, INCLUDE_FLUIDS);
            start = result.getPos().add(0, 100, 0);
            end = result.getPos();
        } else {
            start = player.getEyePos();
            end = start.add(player.getRotationVec(1.0f).multiply(MAX_DISTANCE));
        }

        double distance = start.distanceTo(end);
        int step = (int) (distance * 6);
        double radiusStep = 0.4;

        if (world.isClient) {
            for (int i = 0; i <= step; i++) {
                double progress = i / (double) step;
                double cx = start.x + (end.x - start.x) * progress;
                double cy = start.y + (end.y - start.y) * progress;
                double cz = start.z + (end.z - start.z) * progress;

                world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, cx, cy, cz, 0, 0, 0);

                for (int ring = 0; ring < rings; ring++) {
                    double radius = radiusStep * (ring + 1);
                    for (int beam = 0; beam < beamCount; beam++) {
                        double angle = (2 * Math.PI / beamCount) * beam;
                        double ox = Math.cos(angle) * radius;
                        double oz = Math.sin(angle) * radius;
                        world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, cx + ox, cy, cz + oz, 0, 0, 0);
                    }
                }
            }
        }

        if (!world.isClient) {
            for (int i = 0; i <= step; i++) {
                double progress = i / (double) step;
                double cx = start.x + (end.x - start.x) * progress;
                double cy = start.y + (end.y - start.y) * progress;
                double cz = start.z + (end.z - start.z) * progress;

                applyDamage(world, player, cx, cy, cz, damage, beamCount, rings, radiusStep);
            }
            player.getItemCooldownManager().set(this, 20 + (int) (chargePercent * 40));
        }
    }

    private void applyDamage(World world, PlayerEntity user, double x, double y, double z, float damage, int beamCount, int rings, double radiusStep) {
        Box hitbox = new Box(x - 0.3, y - 0.3, z - 0.3, x + 0.3, y + 0.3, z + 0.3);
        List<Entity> entities = world.getOtherEntities(user, hitbox, e -> e instanceof LivingEntity && e.isAlive());
        for (Entity e : entities) {
            e.damage(world.getDamageSources().playerAttack(user), damage);
        }

        for (int ring = 0; ring < rings; ring++) {
            double radius = radiusStep * (ring + 1);
            for (int beam = 0; beam < beamCount; beam++) {
                double angle = (2 * Math.PI / beamCount) * beam;
                double ox = Math.cos(angle) * radius;
                double oz = Math.sin(angle) * radius;
                Box ringHitbox = new Box(x + ox - 0.3, y - 0.3, z + oz - 0.3, x + ox + 0.3, y + 0.3, z + oz + 0.3);
                List<Entity> ringEntities = world.getOtherEntities(user, ringHitbox, e -> e instanceof LivingEntity && e.isAlive());
                for (Entity e : ringEntities) {
                    e.damage(world.getDamageSources().playerAttack(user), damage);
                }
            }
        }


    }
}
