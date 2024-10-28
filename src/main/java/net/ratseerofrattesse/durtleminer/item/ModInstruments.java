package net.ratseerofrattesse.durtleminer.item;

import net.minecraft.item.Instrument;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;
import net.ratseerofrattesse.durtleminer.sound.ModSoundEvents;

public interface ModInstruments {
    int GOAT_HORN_RANGE = 256;
    int GOAT_HORN_USE_DURATION = 140;
    RegistryKey<Instrument> ARJUN_IS_SUS_GOAT_HORN = of("durtleminer:arjun_is_sus_goat_horn");

    private static RegistryKey<Instrument> of(String id) {
        return RegistryKey.of(RegistryKeys.INSTRUMENT, Identifier.of(Durtleminer.MOD_ID));
    }

    static Instrument registerAndGetDefault(Registry<Instrument> registry) {
        return Registry.register(registry, ARJUN_IS_SUS_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>) ModSoundEvents.ARJUN_IS_SUS_GOAT_HORN, 140, 256.0F));
    }
}
