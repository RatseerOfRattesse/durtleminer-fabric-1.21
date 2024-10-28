package net.ratseerofrattesse.durtleminer.block.jukebox;

import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.block.jukebox.JukeboxSongs;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.ratseerofrattesse.durtleminer.Durtleminer;
import net.ratseerofrattesse.durtleminer.sound.ModSoundEvents;

public interface ModJukeboxSongs extends JukeboxSongs {

    RegistryKey<JukeboxSong> HEZ_HAPPY_MUSIC = of("durtleminer:hez_happy_music");

    private static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID));
    }


    private static void register(
            Registerable<JukeboxSong> registry, RegistryKey<JukeboxSong> key, SoundEvent soundEvent, int lengthInSeconds, int comparatorOutput
    ) {
        registry.register(
                key, new JukeboxSong((RegistryEntry<SoundEvent>) soundEvent, Text.translatable(Util.createTranslationKey("jukebox_song", key.getValue())), (float)lengthInSeconds, comparatorOutput)
        );
    }

    static void bootstrap(Registerable<JukeboxSong> registry) {
        register(registry, HEZ_HAPPY_MUSIC, ModSoundEvents.HEZ_HAPPY_MUSIC, 47, 1);
    }


}
