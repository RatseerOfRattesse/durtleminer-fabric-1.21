package net.ratseerofrattesse.durtleminer.datagen;


import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;
import net.ratseerofrattesse.durtleminer.item.ModItems;
import net.ratseerofrattesse.durtleminer.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        //Chorus
        getOrCreateTagBuilder(ItemTags.PLANKS).add(Item.fromBlock(ModBlocks.CHORUS_PLANKS));

        //Discs
        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(ModItems.MUSIC_DISC_HEZ_HAPPY_MUSIC);

        //SoW Trims
        getOrCreateTagBuilder(ItemTags.TRIM_TEMPLATES)
                .add(ModItems.CONFLUENCE_SMITHING_TEMPLATE)
                .add(ModItems.EXTREMISM_SMITHING_TEMPLATE)
                .add(ModItems.FORESIGHT_SMITHING_TEMPLATE)
                .add(ModItems.INTERNECION_SMITHING_TEMPLATE)
                .add(ModItems.NAIVETY_SMITHING_TEMPLATE)
                .add(ModItems.REBELLION_SMITHING_TEMPLATE)
                .add(ModItems.UNITY_SMITHING_TEMPLATE);

        //Mr. Finch's Hoe
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.MRFINCHS_HOE);

        //Pickaxes
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.LESSER_FIRMAMENT_PICKAXE);

        //Lesser Firmament
        getOrCreateTagBuilder(ModTags.Items.LESSER_FIRMAMENT)
                .add(ModItems.LESSER_FIRMAMENT_PICKAXE)
                .add(ModItems.LESSER_FIRMAMENT_AMALGAM)
                .add(ModItems.LESSER_FIRMAMENT_TEMPLATE);

        //Mysterious Keys
        getOrCreateTagBuilder(ModTags.Items.MYSTERIOUS_KEYS)
                .add(ModItems.MYSTERIOUS_ENDER_KEY)
                .add(ModItems.MYSTERIOUS_FARM_KEY);

        //Trial Keys
        getOrCreateTagBuilder(ModTags.Items.TRIAL_KEYS)
                .add(Items.TRIAL_KEY)
                .add(Items.OMINOUS_TRIAL_KEY)
                .add(ModItems.ENDER_TRIAL_KEY)
                .add(ModItems.OMINOUS_ENDER_TRIAL_KEY);

        //Daggers
        getOrCreateTagBuilder(ModTags.Items.DAGGERS)
                .add(ModItems.WOODEN_DAGGER)
                .add(ModItems.IRON_DAGGER)
                .add(ModItems.GOLD_DAGGER)
                .add(ModItems.DIAMOND_DAGGER)
                .add(ModItems.NETHERITE_DAGGER)
                .add(ModItems.STONE_DAGGER);
    }
}