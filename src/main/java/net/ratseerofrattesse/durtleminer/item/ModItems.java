package net.ratseerofrattesse.durtleminer.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.ratseerofrattesse.durtleminer.Durtleminer;
import net.ratseerofrattesse.durtleminer.item.custom.MrFinchsHoeItem;
import net.ratseerofrattesse.durtleminer.sound.ModSounds;

import java.util.List;

public class ModItems {

    //Lesser Firmament
    public static final Item LESSER_FIRMAMENT_TEMPLATE = registerItem("lesser_firmament_template", new Item(new Item.Settings().rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleminer.lesser_firmament_template"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item LESSER_FIRMAMENT_AMALGAM = registerItem("lesser_firmament_amalgam", new Item(new Item.Settings().rarity(Rarity.EPIC)){
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleminer.lesser_firmament_amalgam"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });
    public static final Item LESSER_FIRMAMENT_PICKAXE = registerItem("lesser_firmament_pickaxe",
            new PickaxeItem(ModToolMaterials.LESSER_FIRMAMENT, new Item.Settings()
                .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.LESSER_FIRMAMENT, 3, -2.8f)).fireproof().rarity(Rarity.EPIC)){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.durtleminer.lesser_firmament_pickaxe.shift_down"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.durtleminer.lesser_firmament_pickaxe"));
                    }
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });



    //Mysterious Keys
    public static final Item MYSTERIOUS_ENDER_KEY = registerItem("mysterious_ender_key", new Item(new Item.Settings().rarity(Rarity.RARE)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleminer.mysterious_ender_key"));
            tooltip.add(Text.translatable("tooltip.durtleminer.mysterious_ender_key2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item MYSTERIOUS_FARM_KEY = registerItem("mysterious_farm_key", new Item(new Item.Settings().rarity(Rarity.RARE)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.durtleminer.mysterious_farm_key"));
            tooltip.add(Text.translatable("tooltip.durtleminer.mysterious_farm_key2"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    //Trial Keys
    public static final Item ENDER_TRIAL_KEY = registerItem("ender_trial_key", new Item(new Item.Settings()));
    public static final Item OMINOUS_ENDER_TRIAL_KEY = registerItem("ominous_ender_trial_key", new Item(new Item.Settings()));


    //Daggers
    public static final Item WOODEN_DAGGER = registerItem("wooden_dagger",
            new SwordItem(ToolMaterials.WOOD,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.WOOD, 1, -0.0F))));
    public static final Item STONE_DAGGER = registerItem("stone_dagger",
            new SwordItem(ToolMaterials.STONE,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.STONE, 1, -0.0F))));
    public static final Item IRON_DAGGER = registerItem("iron_dagger",
            new SwordItem(ToolMaterials.IRON,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.IRON, 1, -0.0F))));
    public static final Item DIAMOND_DAGGER = registerItem("diamond_dagger",
            new SwordItem(ToolMaterials.DIAMOND,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.DIAMOND, 1, -0.0F))));
    public static final Item GOLD_DAGGER = registerItem("gold_dagger",
            new SwordItem(ToolMaterials.GOLD,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.GOLD, 1, -0.0F))));
    public static final Item NETHERITE_DAGGER = registerItem("netherite_dagger",
            new SwordItem(ToolMaterials.NETHERITE,
                    new Item.Settings().attributeModifiers(SwordItem.createAttributeModifiers(ToolMaterials.NETHERITE, 1, -0.0F))));

    //Hez Happy Music !!!!! 0::::
    public static final Item MUSIC_DISC_HEZ_HAPPY_MUSIC = registerItem(
            "music_disc_hez_happy_music", new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(ModSounds.HEZ_HAPPY_MUSIC_KEY).maxCount(1)));

    //SoW Trims
    public static final Item INTERNECION_SMITHING_TEMPLATE = registerItem("internecion_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "internecion"), FeatureFlags.VANILLA));
    public static final Item CONFLUENCE_SMITHING_TEMPLATE = registerItem("confluence_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "confluence"), FeatureFlags.VANILLA));
    public static final Item UNITY_SMITHING_TEMPLATE = registerItem("unity_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "unity"), FeatureFlags.VANILLA));
    public static final Item EXTREMISM_SMITHING_TEMPLATE = registerItem("extremism_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "extremism"), FeatureFlags.VANILLA));
    public static final Item REBELLION_SMITHING_TEMPLATE = registerItem("rebellion_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "rebellion"), FeatureFlags.VANILLA));
    public static final Item NAIVETY_SMITHING_TEMPLATE = registerItem("naivety_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "naivety"), FeatureFlags.VANILLA));
    public static final Item FORESIGHT_SMITHING_TEMPLATE = registerItem("foresight_armor_trim_smithing_template",
            SmithingTemplateItem.of(Identifier.of(Durtleminer.MOD_ID, "foresight"), FeatureFlags.VANILLA));

    //Mr. Finch's Hoe
    public static final Item MRFINCHS_HOE = registerItem("mrfinchs_hoe",
            new MrFinchsHoeItem(ToolMaterials.IRON,
                    new Item.Settings().attributeModifiers(MrFinchsHoeItem.createAttributeModifiers(ToolMaterials.IRON, 0, -0.0F))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    if (Screen.hasShiftDown()) {
                        tooltip.add(Text.translatable("tooltip.durtleminer.mrfinchs_hoe.shift_down"));
                    } else {
                        tooltip.add(Text.translatable("tooltip.durtleminer.mrfinchs_hoe"));
                    }
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    //Shattered Gear
    public static final Item SHATTERED_SWORD = registerItem("shattered_sword",
            new SwordItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_DAGGER = registerItem("shattered_dagger",
            new SwordItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_PICKAXE = registerItem("shattered_pickaxe",
            new PickaxeItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_AXE = registerItem("shattered_axe",
            new AxeItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_SHOVEL = registerItem("shattered_shovel",
            new ShovelItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_HOE = registerItem("shattered_hoe",
            new HoeItem(ModToolMaterials.SHATTERED, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.SHATTERED, 0, -1.6f))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_HELMET = registerItem("shattered_helmet",
            new ArmorItem(ModArmorMaterials.SHATTERED_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_CHESTPLATE = registerItem("shattered_chestplate",
            new ArmorItem(ModArmorMaterials.SHATTERED_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_LEGGINGS = registerItem("shattered_leggings",
            new ArmorItem(ModArmorMaterials.SHATTERED_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });
    public static final Item SHATTERED_BOOTS = registerItem("shattered_boots",
            new ArmorItem(ModArmorMaterials.SHATTERED_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))){
                @Override
                public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered"));
                    tooltip.add(Text.translatable("tooltip.durtleminer.shattered2"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Durtleminer.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Durtleminer.LOGGER.info("[" + Durtleminer.MOD_ID + "]:" + Durtleminer.MOD_ID + "'s items are existing 0:::::");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(LESSER_FIRMAMENT_PICKAXE);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(LESSER_FIRMAMENT_AMALGAM);
            entries.add(LESSER_FIRMAMENT_TEMPLATE);
            entries.add(INTERNECION_SMITHING_TEMPLATE);
            entries.add(CONFLUENCE_SMITHING_TEMPLATE);
            entries.add(UNITY_SMITHING_TEMPLATE);
            entries.add(EXTREMISM_SMITHING_TEMPLATE);
            entries.add(REBELLION_SMITHING_TEMPLATE);
            entries.add(NAIVETY_SMITHING_TEMPLATE);
            entries.add(FORESIGHT_SMITHING_TEMPLATE);
            entries.add(ENDER_TRIAL_KEY);
            entries.add(OMINOUS_ENDER_TRIAL_KEY);
            entries.add(MYSTERIOUS_ENDER_KEY);
            entries.add(MYSTERIOUS_FARM_KEY);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(WOODEN_DAGGER);
            entries.add(STONE_DAGGER);
            entries.add(IRON_DAGGER);
            entries.add(DIAMOND_DAGGER);
            entries.add(GOLD_DAGGER);
            entries.add(NETHERITE_DAGGER);
            entries.add(SHATTERED_SWORD);
            entries.add(SHATTERED_DAGGER);
            entries.add(SHATTERED_PICKAXE);
            entries.add(SHATTERED_AXE);
            entries.add(SHATTERED_SHOVEL);
            entries.add(SHATTERED_HOE);
            entries.add(SHATTERED_HELMET);
            entries.add(SHATTERED_CHESTPLATE);
            entries.add(SHATTERED_LEGGINGS);
            entries.add(SHATTERED_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(MUSIC_DISC_HEZ_HAPPY_MUSIC);
            entries.add(MRFINCHS_HOE);
        });
    }
}
