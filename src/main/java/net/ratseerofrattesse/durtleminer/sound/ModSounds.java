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
    public static final RegistryKey<JukeboxSong> HEZ_HAPPY_MUSIC_KEY =
            RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(Durtleminer.MOD_ID, "hez_happy_music"));

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(Durtleminer.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerModItems() {
        Durtleminer.LOGGER.info("[" + Durtleminer.MOD_ID + "]:spooky sounds are coming from " + Durtleminer.MOD_ID +"'s direction");
    }
}
