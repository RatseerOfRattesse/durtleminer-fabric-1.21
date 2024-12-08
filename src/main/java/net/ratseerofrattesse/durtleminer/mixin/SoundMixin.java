package net.ratseerofrattesse.durtleminer.mixin;

import com.google.common.collect.ImmutableList;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

import java.util.stream.IntStream;

@Mixin(SoundEvents.class)
public class SoundMixin {
    @Shadow
    public static final int GOAT_HORN_SOUND_COUNT = 10;

    @Overwrite

    private static ImmutableList<RegistryEntry.Reference<SoundEvent>> registerGoatHornSounds() {
        return (ImmutableList<RegistryEntry.Reference<SoundEvent>>) IntStream.range(0, 10)
                .mapToObj(variant -> registerReference("item.goat_horn.sound." + variant))
                .collect(ImmutableList.toImmutableList());
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(String id) {
        return registerReference(Identifier.ofVanilla(id));
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id) {
        return registerReference(id, id);
    }

    private static RegistryEntry.Reference<SoundEvent> registerReference(Identifier id, Identifier soundId) {
        return Registry.registerReference(Registries.SOUND_EVENT, id, SoundEvent.of(soundId));
    }
}