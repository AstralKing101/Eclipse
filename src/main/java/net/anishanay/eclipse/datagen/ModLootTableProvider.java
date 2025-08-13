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
       addDrop((ModBlocks.KYPERNITE_ORE), oreDrops(ModBlocks.KYPERNITE_ORE, ModItems.RAW_KYPERNITE));
       addDrop((ModBlocks.COSMONITE_ORE), oreDrops(ModBlocks.COSMONITE_ORE, ModItems.RAW_COSMONITE));
       addDrop((ModBlocks.SILVER_ORE), oreDrops(ModBlocks.SILVER_ORE, ModItems.RAW_SILVER));
       addDrop(ModBlocks.ASHWOOD_LEAVES, leavesDrops(ModBlocks.ASHWOOD_LEAVES, ModBlocks.ASHWOOD_SAPLING, 0.0625f));

    }
 }
