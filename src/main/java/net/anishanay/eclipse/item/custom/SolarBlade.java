package net.anishanay.eclipse.item.custom;


import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;

import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.particle.ParticleTypes;

import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class SolarBlade extends SwordItem {


    public SolarBlade(ToolMaterial toolMaterial, Settings settings) {
        super(toolMaterial, settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        final int MAX_DISTANCE = 100;
        final int TICK_PROGRESS = 1;
        final boolean INCLUDE_FLUIDS = false;

        HitResult result = user.raycast(MAX_DISTANCE, TICK_PROGRESS, INCLUDE_FLUIDS);

        BlockHitResult resultAlternative =
                (BlockHitResult) user.raycast(MAX_DISTANCE, TICK_PROGRESS, INCLUDE_FLUIDS);

        Vec3d start = user.getEyePos();
        Vec3d end = result.getPos();


        if (world.isClient) {
            double distance = start.distanceTo(end);

            int step = (int) (distance * 6);

            for (int i = 0; i <= step; i++){

                double progress = i / (double) step;

                double x = start.x + (end.x - start.x) * progress;
                double y = start.y + (end.y - start.y) * progress;
                double z = start.z + (end.z - start.z) * progress;

                world.addParticle(
                        ParticleTypes.ELECTRIC_SPARK,
                        x, y, z,
                        0.0, 0.0, 0.0
                );
            }

        }
        return TypedActionResult.consume(user.getStackInHand(hand));
    }}