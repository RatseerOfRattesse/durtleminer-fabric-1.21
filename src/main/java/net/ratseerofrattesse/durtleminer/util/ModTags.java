package net.ratseerofrattesse.durtleminer.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.ratseerofrattesse.durtleminer.Durtleminer;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_LESSER_FIRMAMENT_TOOL = createTag("needs_lesser_firmament_tool");
        public static final TagKey<Block> INCORRECT_FOR_LESSER_FIRMAMENT_TOOL = createTag("incorrect_for_lesser_firmament_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Durtleminer.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> LESSER_FIRMAMENT = createTag("lesser_firmament");
        public static final TagKey<Item> TRIAL_KEYS = createTag("trial_keys");
        public static final TagKey<Item> MYSTERIOUS_KEYS = createTag("mysterious_keys");
        public static final TagKey<Item> DAGGERS = createTag("daggers");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(Durtleminer.MOD_ID, name));
        }
    }
}
