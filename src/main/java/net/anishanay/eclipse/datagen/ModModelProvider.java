package net.anishanay.eclipse.datagen;

import net.anishanay.eclipse.block.ModBlocks;
import net.anishanay.eclipse.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
     public ModModelProvider(FabricDataOutput output) {
            super(output);
          }

      @Override
      public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
          blockStateModelGenerator.registerSingleton(ModBlocks.SUNBURNT_GRASS_BLOCK, TexturedModel.CUBE_COLUMN);
          blockStateModelGenerator.registerSingleton(ModBlocks.MOONLIT_GRASS_BLOCK, TexturedModel.CUBE_COLUMN);
          blockStateModelGenerator.registerSingleton(ModBlocks.SUNBURNT_DIRT, TexturedModel.CUBE_COLUMN);
          blockStateModelGenerator.registerSingleton(ModBlocks.MOONLIT_DIRT, TexturedModel.CUBE_ALL);
          blockStateModelGenerator.registerSingleton(ModBlocks.SOLARSLATE, TexturedModel.CUBE_ALL);
          blockStateModelGenerator.registerSingleton(ModBlocks.LUNARSLATE, TexturedModel.CUBE_ALL);
          blockStateModelGenerator.registerTintableCross(ModBlocks.ASHWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

          }



      @Override
     public void generateItemModels(ItemModelGenerator itemModelGenerator) {


  }
}
