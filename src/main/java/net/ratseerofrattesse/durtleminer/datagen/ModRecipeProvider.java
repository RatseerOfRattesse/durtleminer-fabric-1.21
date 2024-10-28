package net.ratseerofrattesse.durtleminer.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;
import net.ratseerofrattesse.durtleminer.item.ModItems;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //somebody help me figure out why it has to be lists ;-;

        List<ItemConvertible> TEMPLATE = List.of(ModItems.LESSER_FIRMAMENT_TEMPLATE);


        //Lesser Firmament Pickaxe
        offerBlasting(exporter, TEMPLATE, RecipeCategory.MISC, ModItems.LESSER_FIRMAMENT_AMALGAM, 10.0f, 1000, "lesser_firmament");
        offerLesserFirmamentUpgradeRecipe(exporter, Items.NETHERITE_PICKAXE, RecipeCategory.TOOLS, ModItems.LESSER_FIRMAMENT_PICKAXE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.LESSER_FIRMAMENT_TEMPLATE, Items.END_STONE);


        //Dark Purpur Set
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_BLOCK)
                .pattern("DP")
                .pattern("PD")
                .input('D', Items.BLACK_DYE)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(Items.BLACK_DYE), conditionsFromItem(Items.BLACK_DYE))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, Identifier.of(Durtleminer.MOD_ID, "dark_purpur_block_black_dye"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_BLOCK)
                .pattern("IP")
                .pattern("PI")
                .input('I', Items.INK_SAC)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(Items.INK_SAC), conditionsFromItem(Items.INK_SAC))
                .criterion(hasItem(Items.POPPED_CHORUS_FRUIT), conditionsFromItem(Items.POPPED_CHORUS_FRUIT))
                .offerTo(exporter, Identifier.of(Durtleminer.MOD_ID, "dark_purpur_block_ink_sac"));
        createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_SLAB, Ingredient.ofItems(ModBlocks.DARK_PURPUR_BLOCK, ModBlocks.DARK_PURPUR_PILLAR))
                .criterion(hasItem(ModBlocks.DARK_PURPUR_BLOCK), conditionsFromItem(ModBlocks.DARK_PURPUR_BLOCK))
                .criterion(hasItem(ModBlocks.DARK_PURPUR_PILLAR), conditionsFromItem(ModBlocks.DARK_PURPUR_PILLAR))
                .offerTo(exporter);
        createStairsRecipe(ModBlocks.DARK_PURPUR_STAIRS, Ingredient.ofItems(ModBlocks.DARK_PURPUR_BLOCK, ModBlocks.DARK_PURPUR_PILLAR))
                .criterion(hasItem(ModBlocks.DARK_PURPUR_BLOCK), conditionsFromItem(ModBlocks.DARK_PURPUR_BLOCK))
                .criterion(hasItem(ModBlocks.DARK_PURPUR_PILLAR), conditionsFromItem(ModBlocks.DARK_PURPUR_PILLAR))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_PILLAR)
                .pattern("D")
                .pattern("D")
                .input('D', ModBlocks.DARK_PURPUR_SLAB)
                .criterion(hasItem(ModBlocks.DARK_PURPUR_SLAB), conditionsFromItem(ModBlocks.DARK_PURPUR_SLAB))
                .offerTo(exporter);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_PILLAR, ModBlocks.DARK_PURPUR_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_STAIRS, ModBlocks.DARK_PURPUR_BLOCK, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_PURPUR_SLAB, ModBlocks.DARK_PURPUR_BLOCK, 2);


        //Chorus Wood Set
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_PLANKS, 1)
                .input(Items.CHORUS_FRUIT, 4)
                .criterion(hasItem(Items.CHORUS_FRUIT), conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_SLAB, ModBlocks.CHORUS_PLANKS);
        createStairsRecipe(ModBlocks.CHORUS_STAIRS, Ingredient.ofItems(ModBlocks.CHORUS_PLANKS))
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);
        createFenceRecipe(ModBlocks.CHORUS_FENCE, Ingredient.ofItems(ModBlocks.CHORUS_PLANKS))
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);
        createFenceGateRecipe(ModBlocks.CHORUS_FENCE_GATE, Ingredient.ofItems(ModBlocks.CHORUS_PLANKS))
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHORUS_BUTTON, 1)
                .input(ModBlocks.CHORUS_PLANKS, 1)
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);
        createDoorRecipe(ModBlocks.CHORUS_DOOR, Ingredient.ofItems(ModBlocks.CHORUS_PLANKS))
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);
        offerPressurePlateRecipe(exporter, ModBlocks.CHORUS_PRESSURE_PLATE, ModBlocks.CHORUS_PLANKS);
        createTrapdoorRecipe(ModBlocks.CHORUS_TRAPDOOR, Ingredient.ofItems(ModBlocks.CHORUS_PLANKS))
                .criterion(hasItem(ModBlocks.CHORUS_PLANKS), conditionsFromItem(ModBlocks.CHORUS_PLANKS))
                .offerTo(exporter);

        //Daggers
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.WOODEN_DAGGER)
                .pattern("W")
                .pattern("#")
                .input('W', ItemTags.PLANKS)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.STONE_DAGGER)
                .pattern("W")
                .pattern("#")
                .input('W', ItemTags.STONE_TOOL_MATERIALS)
                .input('#', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createDaggerRecipe(ModItems.IRON_DAGGER, Ingredient.ofItems(Items.IRON_INGOT))
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createDaggerRecipe(ModItems.DIAMOND_DAGGER, Ingredient.ofItems(Items.DIAMOND))
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        createDaggerRecipe(ModItems.GOLD_DAGGER, Ingredient.ofItems(Items.GOLD_INGOT))
                .criterion(hasItem(Items.GOLD_INGOT), conditionsFromItem(Items.GOLD_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
        offerNetheriteUpgradeRecipe(exporter, ModItems.DIAMOND_DAGGER, RecipeCategory.COMBAT, ModItems.NETHERITE_DAGGER);


        //SoW Trims
        offerSmithingTrimRecipe(exporter, ModItems.CONFLUENCE_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "confluence"));
        offerSmithingTrimRecipe(exporter, ModItems.EXTREMISM_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "extremism"));
        offerSmithingTrimRecipe(exporter, ModItems.FORESIGHT_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "foresight"));
        offerSmithingTrimRecipe(exporter, ModItems.INTERNECION_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "internecion"));
        offerSmithingTrimRecipe(exporter, ModItems.NAIVETY_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "naivety"));
        offerSmithingTrimRecipe(exporter, ModItems.REBELLION_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "rebellion"));
        offerSmithingTrimRecipe(exporter, ModItems.UNITY_SMITHING_TEMPLATE, Identifier.of(Durtleminer.MOD_ID, "unity"));

        offerSmithingTemplateCopyingRecipe(exporter, ModItems.CONFLUENCE_SMITHING_TEMPLATE, Blocks.PURPUR_BLOCK);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.EXTREMISM_SMITHING_TEMPLATE, Blocks.END_STONE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.FORESIGHT_SMITHING_TEMPLATE, Items.HEART_OF_THE_SEA);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.INTERNECION_SMITHING_TEMPLATE, Blocks.COBBLED_DEEPSLATE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.NAIVETY_SMITHING_TEMPLATE, Items.SLIME_BALL);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.REBELLION_SMITHING_TEMPLATE, Blocks.BLUE_ICE);
        offerSmithingTemplateCopyingRecipe(exporter, ModItems.UNITY_SMITHING_TEMPLATE, Items.BREEZE_ROD);

    }




    //Template for upgrade via Lesser Firmament Template
    public static void offerLesserFirmamentUpgradeRecipe(RecipeExporter exporter, Item input, RecipeCategory category, Item result) {
        SmithingTransformRecipeJsonBuilder.create(
                        Ingredient.ofItems(ModItems.LESSER_FIRMAMENT_TEMPLATE), Ingredient.ofItems(input), Ingredient.ofItems(ModItems.LESSER_FIRMAMENT_AMALGAM), category, result
                )
                .criterion(hasItem(ModItems.LESSER_FIRMAMENT_AMALGAM), conditionsFromItem(ModItems.LESSER_FIRMAMENT_AMALGAM))
                .offerTo(exporter, getItemPath(result) + "_smithing");
    }

    //Template for dagger recipes
    public static CraftingRecipeJsonBuilder createDaggerRecipe(ItemConvertible output, Ingredient input) {
        Item item = Items.STICK;
        return ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output)
                .pattern("W")
                .pattern("#")
                .input('W', input)
                .input('#', item);
    }
}
