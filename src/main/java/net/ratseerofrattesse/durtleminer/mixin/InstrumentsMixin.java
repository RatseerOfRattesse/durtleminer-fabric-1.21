package net.ratseerofrattesse.durtleminer.mixin;

import net.minecraft.item.Instrument;
import net.minecraft.item.Instruments;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.MinecraftServer;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.minecraft.item.Instruments.*;
import static net.ratseerofrattesse.durtleminer.item.ModInstruments.ARJUN_IS_SUS_GOAT_HORN;
import static net.ratseerofrattesse.durtleminer.item.ModInstruments.I_AM_STEVE_GOAT_HORN;

@Mixin(Instruments.class)
public interface InstrumentsMixin {
    @Overwrite
    static Instrument registerAndGetDefault(Registry<Instrument> registry) {
        Registry.register(registry, PONDER_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(0), 140, 256.0F));
        Registry.register(registry, SING_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(1), 140, 256.0F));
        Registry.register(registry, SEEK_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(2), 140, 256.0F));
        Registry.register(registry, FEEL_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(3), 140, 256.0F));
        Registry.register(registry, ADMIRE_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(4), 140, 256.0F));
        Registry.register(registry, CALL_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(5), 140, 256.0F));
        Registry.register(registry, YEARN_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(6), 140, 256.0F));
        Registry.register(registry, DREAM_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>)SoundEvents.GOAT_HORN_SOUNDS.get(7), 140, 256.0F));
        Registry.register(registry, ARJUN_IS_SUS_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>) SoundEvents.GOAT_HORN_SOUNDS.get(8), 140, 256.0F));
        return Registry.register(registry, I_AM_STEVE_GOAT_HORN, new Instrument((RegistryEntry<SoundEvent>) SoundEvents.GOAT_HORN_SOUNDS.get(9), 140, 256.0F));
    }
}