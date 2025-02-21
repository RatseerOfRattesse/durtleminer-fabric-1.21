package net.ratseerofrattesse.durtleminer.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;
import net.ratseerofrattesse.durtleminer.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Dark purpur
        BlockStateModelGenerator.BlockTexturePool darkPurpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DARK_PURPUR_BLOCK);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.DARK_PURPUR_PILLAR, TexturedModel.END_FOR_TOP_CUBE_COLUMN, TexturedModel.END_FOR_TOP_CUBE_COLUMN_HORIZONTAL);
        darkPurpurPool.stairs(ModBlocks.DARK_PURPUR_STAIRS);
        darkPurpurPool.slab(ModBlocks.DARK_PURPUR_SLAB);

        //Chorus
        BlockStateModelGenerator.BlockTexturePool chorusPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHORUS_PLANKS);
        chorusPool.slab(ModBlocks.CHORUS_SLAB);
        chorusPool.stairs(ModBlocks.CHORUS_STAIRS);
        chorusPool.button(ModBlocks.CHORUS_BUTTON);
        chorusPool.fenceGate(ModBlocks.CHORUS_FENCE_GATE);
        chorusPool.fence(ModBlocks.CHORUS_FENCE);
        chorusPool.pressurePlate(ModBlocks.CHORUS_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.CHORUS_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHORUS_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Lesser Firmament
        itemModelGenerator.register(ModItems.LESSER_FIRMAMENT_AMALGAM, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESSER_FIRMAMENT_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LESSER_FIRMAMENT_PICKAXE, Models.GENERATED);

        //Trial keys
        itemModelGenerator.register(ModItems.ENDER_TRIAL_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.OMINOUS_ENDER_TRIAL_KEY, Models.GENERATED);

        //Mysterious keys
        itemModelGenerator.register(ModItems.MYSTERIOUS_ENDER_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MYSTERIOUS_FARM_KEY, Models.GENERATED);

        //Daggers
        itemModelGenerator.register(ModItems.WOODEN_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STONE_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.IRON_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.DIAMOND_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.GOLD_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.HANDHELD);

        //Hez Happy Music
        itemModelGenerator.register(ModItems.MUSIC_DISC_HEZ_HAPPY_MUSIC, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DOOR_GUYS_THEME, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_JAZZ_CUBE, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ELIMINATE, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_GAT_RITZYS_CONTINUANCE_CUBE, Models.TEMPLATE_MUSIC_DISC);
        itemModelGenerator.register(ModItems.MUSIC_DISC_HIVE_MINDS_THINK_ALIKE, Models.TEMPLATE_MUSIC_DISC);


        //SoW Trims
        itemModelGenerator.register(ModItems.INTERNECION_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CONFLUENCE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.UNITY_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.EXTREMISM_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.REBELLION_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NAIVETY_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FORESIGHT_SMITHING_TEMPLATE, Models.GENERATED);

        //Mr. Finch's Hoe
        itemModelGenerator.register(ModItems.MRFINCHS_HOE, Models.HANDHELD);

        //Shattered Items
        itemModelGenerator.register(ModItems.SHATTERED_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHATTERED_DAGGER, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHATTERED_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHATTERED_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHATTERED_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SHATTERED_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHATTERED_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHATTERED_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHATTERED_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SHATTERED_BOOTS));
    }
}
