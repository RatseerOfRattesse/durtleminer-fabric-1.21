
package net.ratseerofrattesse.durtleminer.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;

public class ModSoundEvents extends SoundEvents {

    //public static final RegistryEntry.Reference<SoundEvent> HEZ_HAPPY_MUSIC = registerReference("hez_happy_music.json");

    //public static final SoundEvent HEZ_HAPPY_MUSIC = register("hez_happy_music.json");
    //public static final SoundEvent ARJUN_IS_SUS_GOAT_HORN = register("durtleminer:arjun_is_sus_goat_horn");
    /*
    private static SoundEvent register(String id) {
        return register(Identifier.of(Durtleminer.MOD_ID));
    }

    private static SoundEvent register(Identifier id) {
        return register(id, id);
    }

    private static SoundEvent register(Identifier id, Identifier soundId) {
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }


    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.of(Durtleminer.MOD_ID));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }

    public static final Identifier ARJUN_IS_SUS_GOAT_HORN = Identifier.of("durtleminer:arjun_is_sus_goat_horn");
    public static SoundEvent ARJUN_IS_SUS_GOAT_HORN_EVENT = SoundEvent.of(ARJUN_IS_SUS_GOAT_HORN);

    public void onInitialize(){
        Registry.register(Registries.SOUND_EVENT, ModSoundEvents.ARJUN_IS_SUS_GOAT_HORN, ARJUN_IS_SUS_GOAT_HORN_EVENT);
    }

     */

    private ModSoundEvents() {
    }

    public static final SoundEvent ARJUN_IS_SUS_GOAT_HORN = registerSound("arjun_is_sus_goat_horn");
    public static final SoundEvent HEZ_HAPPY_MUSIC = registerSound("hez_happy_music");

    private static SoundEvent registerSound(String id) {
        Identifier identifier = Identifier.of(Durtleminer.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerModSounds() {
        Durtleminer.LOGGER.info("spoopy noises are coming from " + Durtleminer.MOD_ID + "'s direction");
    }


}
