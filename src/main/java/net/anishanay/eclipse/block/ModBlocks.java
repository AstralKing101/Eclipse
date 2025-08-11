package net.anishanay.eclipse.block;

import net.anishanay.eclipse.Eclipse;
import net.anishanay.eclipse.world.gen.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {


    public static final Block LUNARITE_ORE = registerBlock("lunarite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block SOLARITE_ORE = registerBlock("solarite_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block LUNARITE_BLOCK = registerBlock("lunarite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block SOLARITE_BLOCK = registerBlock("solarite_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHERITE)));
    public static final Block SUN_STONE = registerBlock("sun_stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block MOON_STONE = registerBlock("moon_stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.CALCITE)));
    public static final Block ASHWOOD_LOG = registerBlock("ashwood_log",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ASHWOOD_PLANKS = registerBlock("ashwood_planks",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block ASHWOOD_LEAVES = registerBlock("ashwood_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block GLIMMERWOOD_LOG = registerBlock("glimmerwood_log",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block GLIMMERWOOD_PLANKS = registerBlock("glimmerwood_planks",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.WOOD)));
    public static final Block GLIMMERWOOD_LEAVES = registerBlock("glimmerwood_leaves",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block SUNBURNT_GRASS_BLOCK = registerBlock("sunburnt_grass_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.GRASS)));
    public static final Block MOONLIT_GRASS_BLOCK = registerBlock("moonlit_grass_block",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.GRASS)));
    public static final Block SUNBURNT_DIRT = registerBlock("sunburnt_dirt",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.GRASS)));
    public static final Block MOONLIT_DIRT = registerBlock("moonlit_dirt",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.GRASS)));
    public static final Block SOLARSLATE = registerBlock("solarslate",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block LUNARSLATE = registerBlock("lunarslate",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block ASHWOOD_SAPLING = registerBlock("ashwood_sapling",
            new SaplingBlock(ModSaplingGenerators.ASHWOOD, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Eclipse.MOD_ID, name), block);
    }


    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Eclipse.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    public static void registerModBlocks() {
        Eclipse.LOGGER.info("Registering Mod Blocks for " + Eclipse.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.LUNARITE_ORE);
            fabricItemGroupEntries.add(ModBlocks.SOLARITE_ORE);
            fabricItemGroupEntries.add(ModBlocks.SUN_STONE);
            fabricItemGroupEntries.add(ModBlocks.MOON_STONE);
            fabricItemGroupEntries.add(ModBlocks.ASHWOOD_LOG);
            fabricItemGroupEntries.add(ModBlocks.ASHWOOD_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.ASHWOOD_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.GLIMMERWOOD_LOG);
            fabricItemGroupEntries.add(ModBlocks.GLIMMERWOOD_PLANKS);
            fabricItemGroupEntries.add(ModBlocks.GLIMMERWOOD_LEAVES);
            fabricItemGroupEntries.add(ModBlocks.SUNBURNT_GRASS_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.MOONLIT_GRASS_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.SUNBURNT_DIRT);
            fabricItemGroupEntries.add(ModBlocks.MOONLIT_DIRT);
            fabricItemGroupEntries.add(ModBlocks.SOLARSLATE);
            fabricItemGroupEntries.add(ModBlocks.LUNARSLATE);
            fabricItemGroupEntries.add(ModBlocks.ASHWOOD_SAPLING);

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.LUNARITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.SOLARITE_BLOCK);

        });

    }
}










