package net.ratseerofrattesse.durtleminer.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;
import net.ratseerofrattesse.durtleminer.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishUSLanguageProvider extends FabricLanguageProvider {
    public ModEnglishUSLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        //Dark Purpur
        translationBuilder.add(ModBlocks.DARK_PURPUR_BLOCK, "Dark Purpur Block");
        translationBuilder.add(ModBlocks.DARK_PURPUR_PILLAR, "Dark Purpur Pillar");
        translationBuilder.add(ModBlocks.DARK_PURPUR_STAIRS, "Dark Purpur Stairs");
        translationBuilder.add(ModBlocks.DARK_PURPUR_SLAB, "Dark Purpur Slab");

        //Chorus
        translationBuilder.add(ModBlocks.CHORUS_PLANKS, "Chorus Planks");
        translationBuilder.add(ModBlocks.CHORUS_PRESSURE_PLATE, "Chorus Pressure Plate");
        translationBuilder.add(ModBlocks.CHORUS_STAIRS, "Chorus Stairs");
        translationBuilder.add(ModBlocks.CHORUS_BUTTON, "Chorus Button");
        translationBuilder.add(ModBlocks.CHORUS_DOOR, "Chorus Door");
        translationBuilder.add(ModBlocks.CHORUS_FENCE, "Chorus Fence");
        translationBuilder.add(ModBlocks.CHORUS_FENCE_GATE, "Chorus Fence Gate");
        translationBuilder.add(ModBlocks.CHORUS_SLAB, "Chorus Slab");
        translationBuilder.add(ModBlocks.CHORUS_TRAPDOOR, "Chorus Trapdoor");

        //Lesser Firmament
        translationBuilder.add(ModItems.LESSER_FIRMAMENT_AMALGAM, "Lesser Firmament Amalgam");
        translationBuilder.add(ModItems.LESSER_FIRMAMENT_TEMPLATE, "Lesser Firmament Template");
        translationBuilder.add(ModItems.LESSER_FIRMAMENT_PICKAXE, "Lesser Firmament Pickaxe");

        //Cooked Axolotl
        translationBuilder.add(ModItems.COOKED_AXOLOTL_BUCKET, "Cooked Bucket of Axolotl");

        //Mr. Finch's Hoe
        translationBuilder.add(ModItems.MRFINCHS_HOE, "Mr. Finch's Hoe");

        //Trial Keys
        translationBuilder.add(ModItems.ENDER_TRIAL_KEY, "Ender Trial Key");
        translationBuilder.add(ModItems.OMINOUS_ENDER_TRIAL_KEY, "Ominous Ender Trial Key");

        //Mysterious Keys
        translationBuilder.add(ModItems.MYSTERIOUS_ENDER_KEY, "Mysterious Key");
        translationBuilder.add(ModItems.MYSTERIOUS_FARM_KEY, "Mysterious Key");

        //Daggers
        translationBuilder.add(ModItems.WOODEN_DAGGER, "Wooden Dagger");
        translationBuilder.add(ModItems.STONE_DAGGER, "Stone Dagger");
        translationBuilder.add(ModItems.IRON_DAGGER, "Iron Dagger");
        translationBuilder.add(ModItems.GOLD_DAGGER, "Gold Dagger");
        translationBuilder.add(ModItems.DIAMOND_DAGGER, "Diamond Dagger");
        translationBuilder.add(ModItems.NETHERITE_DAGGER, "Netherite Dagger");

        //Music Discs
        translationBuilder.add(ModItems.MUSIC_DISC_HEZ_HAPPY_MUSIC, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_hez_happy_music.desc", "Smileydude23 - Hez Happy Music");
        translationBuilder.add("jukebox_song.durtleminer.hez_happy_music", "Smileydude23 - Hez Happy Music");
        translationBuilder.add("subtitles.durtleminer.hez_happy_music", "Hez Happy Music");
        translationBuilder.add(ModItems.MUSIC_DISC_DOOR_GUYS_THEME, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_door_guys_theme.desc", "Liam Vickers - Door Guy's Theme");
        translationBuilder.add("jukebox_song.durtleminer.door_guys_theme", "Liam Vickers - Door Guy's Theme");
        translationBuilder.add("subtitles.durtleminer.door_guys_theme", "Door Guy's Theme");
        translationBuilder.add(ModItems.MUSIC_DISC_GAT_RITZYS_CONTINUANCE_CUBE, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_gat_ritzys_continuance_cube.desc", "Liam Vickers - Gat Ritzy's Continuance Cube");
        translationBuilder.add("jukebox_song.durtleminer.gat_ritzys_continuance_cube", "Liam Vickers - Gat Ritzy's Continuance Cube");
        translationBuilder.add("subtitles.durtleminer.gat_ritzys_continuance_cube", "Gat Ritzy's Continuance Cube");
        translationBuilder.add(ModItems.MUSIC_DISC_ELIMINATE, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_eliminate.desc", "Liam Vickers - ELIMINATE!");
        translationBuilder.add("jukebox_song.durtleminer.eliminate", "Liam Vickers - ELIMINATE!");
        translationBuilder.add("subtitles.durtleminer.eliminate", "ELIMINATE!");
        translationBuilder.add(ModItems.MUSIC_DISC_JAZZ_CUBE, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_jazz_cube.desc", "Liam Vickers - JAZZ CUBE");
        translationBuilder.add("jukebox_song.durtleminer.jazz_cube", "Liam Vickers - JAZZ CUBE");
        translationBuilder.add("subtitles.durtleminer.jazz_cube", "JAZZ CUBE");
        translationBuilder.add(ModItems.MUSIC_DISC_HIVE_MINDS_THINK_ALIKE, "Music Disc");
        translationBuilder.add("item.durtleminer.music_disc_hive_minds_think_alike.desc", "Liam Vickers - Hive Minds Think Alike");
        translationBuilder.add("jukebox_song.durtleminer.hive_minds_think_alike", "Liam Vickers - Hive Minds Think Alike");
        translationBuilder.add("subtitles.durtleminer.hive_minds_think_alike", "Hive Minds Think Alike");

        //Armour Trims
        translationBuilder.add(ModItems.INTERNECION_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.CONFLUENCE_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.UNITY_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.EXTREMISM_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.REBELLION_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.NAIVETY_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add(ModItems.FORESIGHT_SMITHING_TEMPLATE, "Smithing Template");
        translationBuilder.add("trim_pattern.durtleminer.internecion", "Internecion Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.confluence", "Confluence Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.unity", "Unity Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.extremism", "Extremism Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.rebellion", "Rebellion Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.naivety", "Naivety Armor Trim");
        translationBuilder.add("trim_pattern.durtleminer.foresight", "Foresight Armor Trim");

        //Shattered Gear
        translationBuilder.add(ModItems.SHATTERED_SWORD, "Shattered Sword");
        translationBuilder.add(ModItems.SHATTERED_DAGGER, "Shattered Dagger");
        translationBuilder.add(ModItems.SHATTERED_PICKAXE, "Shattered Pickaxe");
        translationBuilder.add(ModItems.SHATTERED_AXE, "Shattered Axe");
        translationBuilder.add(ModItems.SHATTERED_SHOVEL, "Shattered Shovel");
        translationBuilder.add(ModItems.SHATTERED_HOE, "Shattered Hoe");
        translationBuilder.add(ModItems.SHATTERED_HELMET, "Shattered Helmet");
        translationBuilder.add(ModItems.SHATTERED_CHESTPLATE, "Shattered Chestplate");
        translationBuilder.add(ModItems.SHATTERED_LEGGINGS, "Shattered Leggings");
        translationBuilder.add(ModItems.SHATTERED_BOOTS, "Shattered Boots");

        //Paintings
        translationBuilder.add("painting.durtleminer.durtle_sunset.author", "Jarnu47");
        translationBuilder.add("painting.durtleminer.durtle_sunset.title", "Durtle Sunset");
        translationBuilder.add("painting.durtleminer.durtle_cartoon.author", "Smileydude23");
        translationBuilder.add("painting.durtleminer.durtle_cartoon.title", "Durtle Cartoon");
        translationBuilder.add("painting.durtleminer.durtle_realistic.author", "Avatar: the Last Airbender");
        translationBuilder.add("painting.durtleminer.durtle_realistic.title", "Durtle Realistic");
        translationBuilder.add("painting.durtleminer.campfire_cuddles.author", "RatseerOfRattesse");
        translationBuilder.add("painting.durtleminer.campfire_cuddles.title", "Campfire Cuddles");

        //Tags
        translationBuilder.add("tag.item.durtleminer.daggers", "Daggers");
        translationBuilder.add("tag.item.durtleminer.lesser_firmament", "Lesser Firmament");
        translationBuilder.add("tag.item.durtleminer.mysterious_keys", "Mysterious Keys");
        translationBuilder.add("tag.item.durtleminer.trial_keys", "Trial Keys");

        //Tooltips
        translationBuilder.add("tooltip.durtleminer.lesser_firmament_pickaxe", "§7Hold Shift");
        translationBuilder.add("tooltip.durtleminer.lesser_firmament_pickaxe.shift_down", "§bThis pickaxe can instamine most stone-based blocks");
        translationBuilder.add("tooltip.durtleminer.lesser_firmament_template", "§7An amalgamation of firmamental energies, contained inside a construct.");
        translationBuilder.add("tooltip.durtleminer.lesser_firmament_amalgam", "§7An amalgamation of firmamental energies. It seems stable... for now.");
        translationBuilder.add("tooltip.durtleminer.mysterious_ender_key", "§7I wonder where this could lead...");
        translationBuilder.add("tooltip.durtleminer.mysterious_ender_key2", "§7Perhaps this has something to do with the vaults in those end ships?");
        translationBuilder.add("tooltip.durtleminer.mysterious_farm_key", "§7I wonder where this could lead...");
        translationBuilder.add("tooltip.durtleminer.mysterious_farm_key2", "§7Perhaps this has something to do with the vaults in those ruined farmhouses?");
        translationBuilder.add("tooltip.durtleminer.mrfinchs_hoe", "§7Hold Shift");
        translationBuilder.add("tooltip.durtleminer.mrfinchs_hoe.shift_down", "§bThis hoe can bonemeal crops and saplings");
        translationBuilder.add("tooltip.durtleminer.shattered", "§7This item was shattered when overpowered material was applied to it.");
        translationBuilder.add("tooltip.durtleminer.shattered2", "§7It can be repaired in a smithing table with a §aNether Star§7.");

    }
}
