package net.ratseerofrattesse.durtleminer.item.custom;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Items;

public class ModFoodComponents {
    public static final FoodComponent COOKED_AXOLOTL_BUCKET = new FoodComponent.Builder().nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, 3600), 1.00f).usingConvertsTo(Items.BUCKET).build();
}
