package net.anishanay.eclipse.datagen;

import net.anishanay.eclipse.block.ModBlocks;
import net.anishanay.eclipse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;


 public class ModLootTableProvider extends FabricBlockLootTableProvider {
     public  ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
         super(dataOutput, registryLookup);
     }
    @Override
     public void generate() {
       addDrop((ModBlocks.ASHWOOD_LOG));
       addDrop((ModBlocks.ASHWOOD_PLANKS));
       addDrop((ModBlocks.ASHWOOD_SAPLING));
       addDrop(ModBlocks.ASHWOOD_LEAVES, leavesDrops(ModBlocks.ASHWOOD_LEAVES, ModBlocks.ASHWOOD_SAPLING, 0.0625f));

    }
 }
