package net.ratseerofrattesse.durtleminer.item;

import net.minecraft.item.Instrument;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public interface ModInstruments {
    RegistryKey<Instrument> ARJUN_IS_SUS_GOAT_HORN = of("arjun_is_sus_goat_horn");
    RegistryKey<Instrument> I_AM_STEVE_GOAT_HORN = of("i_am_steve_goat_horn");

    private static RegistryKey<Instrument> of(String id) {
        return RegistryKey.of(RegistryKeys.INSTRUMENT, Identifier.ofVanilla(id));
    }
}
