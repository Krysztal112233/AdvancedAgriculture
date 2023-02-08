package dev.krysztal.advagri.foundation.mixin;

import dev.krysztal.advagri.effect.AdvAgriEffects;
import lombok.extern.slf4j.Slf4j;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Slf4j
@Mixin(LivingEntity.class)
public abstract class LivingEntityMixin {

  @Shadow
  public abstract ItemStack eatFood(World world, ItemStack stack);

  @Inject(method = "damage", at = @At("HEAD"), cancellable = true)
  public void damage(
    DamageSource source,
    float amount,
    CallbackInfoReturnable<Boolean> cir
  ) {
    LivingEntity livingEntity = (LivingEntity) ((Object) this);

    boolean hasStatusEffect = livingEntity.hasStatusEffect(
      AdvAgriEffects.LUBRICATION
    );

    if (!hasStatusEffect) return;

    var random = livingEntity.getWorld().getRandom();
    var effect = livingEntity.getStatusEffect(AdvAgriEffects.LUBRICATION);

    int amplifier = 0;
    if (effect == null) return;
    amplifier = effect.getAmplifier();

    if (random.nextInt(100) <= 20 + 5 * amplifier) cir.cancel();
  }
}
