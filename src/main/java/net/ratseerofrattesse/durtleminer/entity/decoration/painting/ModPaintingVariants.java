package net.ratseerofrattesse.durtleminer.entity.decoration.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;

public class ModPaintingVariants {

    public static final RegistryKey<PaintingVariant> DURTLE_REALISTIC = of("durtle_realistic");
    public static final RegistryKey<PaintingVariant> CAMPFIRE_CUDDLES = of("campfire_cuddles");
    public static final RegistryKey<PaintingVariant> DURTLE_SUNSET = of("durtle_sunset");
    public static final RegistryKey<PaintingVariant> DURTLE_CARTOON = of("durtle_cartoon");


    public static void bootstrap(Registerable<PaintingVariant> registry) {
        register(registry, DURTLE_REALISTIC, 1, 1);
        register(registry, CAMPFIRE_CUDDLES, 4, 3);
        register(registry, DURTLE_SUNSET, 4, 4);
        register(registry, DURTLE_CARTOON, 2, 2);
    }


    private static void register(Registerable<PaintingVariant> registry, RegistryKey<PaintingVariant> key, int width, int height) {
        registry.register(key, new PaintingVariant(width, height, key.getValue()));
    }

    private static RegistryKey<PaintingVariant> of(String id) {
        return RegistryKey.of(RegistryKeys.PAINTING_VARIANT, Identifier.of(Durtleminer.MOD_ID));
    }

    public static void registerPaintings() {
        Durtleminer.LOGGER.debug("Registering Paintings for " + Durtleminer.MOD_ID);
    }

}
