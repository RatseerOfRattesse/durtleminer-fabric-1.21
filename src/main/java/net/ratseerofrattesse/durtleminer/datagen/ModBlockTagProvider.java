package net.ratseerofrattesse.durtleminer.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        //Pickaxe required
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DARK_PURPUR_BLOCK);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DARK_PURPUR_PILLAR);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DARK_PURPUR_SLAB);
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.DARK_PURPUR_STAIRS);

        //Dark purpur
        getOrCreateTagBuilder(BlockTags.STAIRS).add(ModBlocks.DARK_PURPUR_STAIRS);
        getOrCreateTagBuilder(BlockTags.SLABS).add(ModBlocks.DARK_PURPUR_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.CHORUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.CHORUS_BUTTON);

        //Chorus
        getOrCreateTagBuilder(BlockTags.PLANKS).add(ModBlocks.CHORUS_PLANKS);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.CHORUS_BUTTON);
        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS).add(ModBlocks.CHORUS_DOOR);
        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS).add(ModBlocks.CHORUS_STAIRS);
        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS).add(ModBlocks.CHORUS_SLAB);
        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES).add(ModBlocks.CHORUS_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES).add(ModBlocks.CHORUS_PRESSURE_PLATE);
        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS).add(ModBlocks.CHORUS_TRAPDOOR);
        getOrCreateTagBuilder(BlockTags.FENCE_GATES).add(ModBlocks.CHORUS_FENCE);
        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS).add(ModBlocks.CHORUS_BUTTON);


    }
}
