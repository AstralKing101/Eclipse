package net.anishanay.eclipse.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


import static net.anishanay.eclipse.Eclipse.MOD_ID;

public class ModItemGroups {

    public static final ItemGroup ECLIPSE = FabricItemGroup.builder(
                    new Identifier(MOD_ID, "eclipse_group"))
            .displayName(Text.translatable("itemGroup.eclipse.eclipse_items"))
            .icon(() -> new ItemStack(ModItems.ECLIPSINITE))
            .entries((context, entries) -> {
                entries.add(ModItems.ECLIPSINITE);
                entries.add(ModItems.COSMONITE);
                entries.add(ModItems.SOLARITE);
                entries.add(ModItems.LUNARITE);
                entries.add(ModItems.SUN_JEWEL_FRAGMENT);
                entries.add(ModItems.LUNAR_CRYSTAL_SHARD);
                entries.add(ModItems.RAW_LUNARITE);
                entries.add(ModItems.RAW_SOLARITE);
            })
            .build();




}
