package net.anishanay.eclipse.block;

import net.anishanay.eclipse.Eclipse;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
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

        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.LUNARITE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.SOLARITE_BLOCK);

        });

    }
}










