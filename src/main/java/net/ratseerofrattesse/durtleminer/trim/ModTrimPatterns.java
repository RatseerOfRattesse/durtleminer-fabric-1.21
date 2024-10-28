package net.ratseerofrattesse.durtleminer.trim;

import net.minecraft.item.Item;
import net.minecraft.item.trim.ArmorTrimPattern;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import net.ratseerofrattesse.durtleminer.Durtleminer;
import net.ratseerofrattesse.durtleminer.item.ModItems;

public class ModTrimPatterns {
    public static final RegistryKey<ArmorTrimPattern> INTERNECION = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "internecion"));
    public static final RegistryKey<ArmorTrimPattern> CONFLUENCE = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "confluence"));
    public static final RegistryKey<ArmorTrimPattern> UNITY = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "unity"));
    public static final RegistryKey<ArmorTrimPattern> EXTREMISM = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "extremism"));
    public static final RegistryKey<ArmorTrimPattern> REBELLION = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "rebellion"));
    public static final RegistryKey<ArmorTrimPattern> NAIVETY = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "naivety"));
    public static final RegistryKey<ArmorTrimPattern> FORESIGHT = RegistryKey.of(RegistryKeys.TRIM_PATTERN,
            Identifier.of(Durtleminer.MOD_ID, "foresight"));

    public static void bootstrap(Registerable<ArmorTrimPattern> context) {
        register(context, ModItems.INTERNECION_SMITHING_TEMPLATE, INTERNECION);
        register(context, ModItems.CONFLUENCE_SMITHING_TEMPLATE, CONFLUENCE);
        register(context, ModItems.UNITY_SMITHING_TEMPLATE, UNITY);
        register(context, ModItems.EXTREMISM_SMITHING_TEMPLATE, EXTREMISM);
        register(context, ModItems.REBELLION_SMITHING_TEMPLATE, REBELLION);
        register(context, ModItems.NAIVETY_SMITHING_TEMPLATE, NAIVETY);
        register(context, ModItems.FORESIGHT_SMITHING_TEMPLATE, FORESIGHT);

    }

    private static void register(Registerable<ArmorTrimPattern> context, Item item, RegistryKey<ArmorTrimPattern> key) {
        ArmorTrimPattern trimPattern = new ArmorTrimPattern(key.getValue(), Registries.ITEM.getEntry(item),
                Text.translatable(Util.createTranslationKey("trim_pattern", key.getValue())), false);

        context.register(key, trimPattern);
    }
}
