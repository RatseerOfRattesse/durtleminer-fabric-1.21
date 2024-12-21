package net.ratseerofrattesse.durtleminer.mixin;


import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.boss.WitherEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(WitherEntity.class)
public class WitherEntityMixin {

	private int age;

	@ModifyReturnValue(method = "createWitherAttributes", at = @At("RETURN"))
	private static DefaultAttributeContainer.Builder increaseHealth(DefaultAttributeContainer.Builder original) {
		original.add(EntityAttributes.GENERIC_MAX_HEALTH, 150.0);
		return original;
	}


	@Inject(at = @At("HEAD"), method = "mobTick")
	private void init(CallbackInfo callbackInfo){
		if (this.age % 20 == 0) {
			this.heal(0.0F);
		}
	}

	private void heal(float v) {
	}
}