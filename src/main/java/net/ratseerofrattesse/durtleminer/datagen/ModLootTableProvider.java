package net.ratseerofrattesse.durtleminer.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        //Dark Purpur
        addDrop(ModBlocks.DARK_PURPUR_BLOCK);
        addDrop(ModBlocks.DARK_PURPUR_PILLAR);
        addDrop(ModBlocks.DARK_PURPUR_STAIRS);
        addDrop(ModBlocks.DARK_PURPUR_SLAB, slabDrops(ModBlocks.DARK_PURPUR_SLAB));

        //Chorus
        addDrop(ModBlocks.CHORUS_PLANKS);
        addDrop(ModBlocks.CHORUS_STAIRS);
        addDrop(ModBlocks.CHORUS_SLAB, slabDrops(ModBlocks.CHORUS_SLAB));
        addDrop(ModBlocks.CHORUS_BUTTON);
        addDrop(ModBlocks.CHORUS_PRESSURE_PLATE);
        addDrop(ModBlocks.CHORUS_FENCE);
        addDrop(ModBlocks.CHORUS_FENCE_GATE);
        addDrop(ModBlocks.CHORUS_DOOR, doorDrops(ModBlocks.CHORUS_DOOR));
        addDrop(ModBlocks.CHORUS_TRAPDOOR);


    }
}
