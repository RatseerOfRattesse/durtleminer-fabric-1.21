package net.ratseerofrattesse.durtleminer.sound;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;

public class ModSounds {

    public static final SoundEvent HEZ_HAPPY_MUSIC = registerSoundEvent("hez_happy_music");
    public static final SoundEvent DOOR_GUYS_THEME = registerSoundEvent("door_guys_theme");
    public static final SoundEvent ELIMINATE = registerSoundEvent("eliminate");
    public static final SoundEvent JAZZ_CUBE = registerSoundEvent("jazz_cube");
    public static final SoundEvent GAT_RITZYS_CONTINUANCE_CUBE = registerSoundEvent("gat_ritzys_continuance_cube");
    public static final SoundEvent HIVE_MINDS_THINK_ALIKE = registerSoundEvent("hive_minds_think_alike");



    public static final RegistryKey<JukeboxSong> HEZ_HAPPY_MUSIC_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "hez_happy_music"));
    public static final RegistryKey<JukeboxSong> DOOR_GUYS_THEME_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "door_guys_theme"));
    public static final RegistryKey<JukeboxSong> ELIMINATE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "eliminate"));
    public static final RegistryKey<JukeboxSong> JAZZ_CUBE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "jazz_cube"));
    public static final RegistryKey<JukeboxSong> GAT_RITZYS_CONTINUANCE_CUBE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "gat_ritzys_continuance_cube"));
    public static final RegistryKey<JukeboxSong> HIVE_MINDS_THINK_ALIKE_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "hive_minds_think_alike"));




    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Durtleminer.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModItems() {
        Durtleminer.LOGGER.info("[" + Durtleminer.MOD_ID + "]:spooky sounds are coming from " + Durtleminer.MOD_ID +"'s direction");
    }
}
