package net.ratseerofrattesse.durtleminer.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;

public class ModBlocks {

    //Dark purpur
    public static final Block DARK_PURPUR_BLOCK = registerBlock("dark_purpur_block",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PURPUR_PILLAR = registerBlock((String)"dark_purpur_pillar",
            new PillarBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));
    public static final Block DARK_PURPUR_STAIRS = registerBlock("dark_purpur_stairs",
            new StairsBlock(ModBlocks.DARK_PURPUR_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5f, 6.0f)));
    public static final Block DARK_PURPUR_SLAB = registerBlock((String)"dark_purpur_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(2.0F, 6.0F)));



    //Chorus
    public static final Block CHORUS_PLANKS = registerBlock("chorus_planks", new Block(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASS).strength(0.4F).sounds(BlockSoundGroup.WOOD).burnable()));

    public static final Block CHORUS_STAIRS = registerBlock("chorus_stairs",
            new StairsBlock(ModBlocks.DARK_PURPUR_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F)));
    public static final Block CHORUS_SLAB = registerBlock((String)"chorus_slab",
            new SlabBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F)));
    public static final Block CHORUS_BUTTON = registerBlock("chorus_button",
            new ButtonBlock(BlockSetType.ACACIA, 2,
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F).noCollision()));
    public static final Block CHORUS_PRESSURE_PLATE = registerBlock("chorus_pressure_plate",
            new PressurePlateBlock(BlockSetType.ACACIA,
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F)));
    public static final Block CHORUS_FENCE = registerBlock("chorus_fence",
            new FenceBlock(AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F)));
    public static final Block CHORUS_FENCE_GATE = registerBlock("chorus_fence_gate",
            new FenceGateBlock(WoodType.ACACIA,
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4f)));
    public static final Block CHORUS_DOOR = registerBlock("chorus_door",
            new DoorBlock(BlockSetType.ACACIA,
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F).nonOpaque()));
    public static final Block CHORUS_TRAPDOOR = registerBlock("chorus_trapdoor",
            new TrapdoorBlock(BlockSetType.ACACIA,
                    AbstractBlock.Settings.create().mapColor(MapColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).strength(0.4F).nonOpaque()));

    //End Port Deco
    /*
    public static final Block ENDER_DRIVE = registerBlock("ender_drive",
            new Block(AbstractBlock.Settings.create().mapColor(MapColor.PALE_PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresTool().strength(1.5F, 6.0F)));

     */

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Durtleminer.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Durtleminer.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        Durtleminer.LOGGER.info("you better run cuz " + Durtleminer.MOD_ID + " is registering blocks");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.DARK_PURPUR_BLOCK);
            entries.add(ModBlocks.DARK_PURPUR_PILLAR);
            entries.add(ModBlocks.DARK_PURPUR_STAIRS);
            entries.add(ModBlocks.DARK_PURPUR_SLAB);
            entries.add(ModBlocks.CHORUS_PLANKS);
            entries.add(ModBlocks.CHORUS_PRESSURE_PLATE);
            entries.add(ModBlocks.CHORUS_STAIRS);
            entries.add(ModBlocks.CHORUS_BUTTON);
            entries.add(ModBlocks.CHORUS_DOOR);
            entries.add(ModBlocks.CHORUS_FENCE);
            entries.add(ModBlocks.CHORUS_FENCE_GATE);
            entries.add(ModBlocks.CHORUS_SLAB);
            entries.add(ModBlocks.CHORUS_TRAPDOOR);

        });
    }
}
