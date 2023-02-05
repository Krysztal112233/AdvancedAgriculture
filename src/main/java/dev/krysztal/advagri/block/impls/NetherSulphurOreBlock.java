package dev.krysztal.advagri.block.impls;

import net.minecraft.block.BlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;

public class NetherSulphurOreBlock extends SulphurOreBlock {

  public NetherSulphurOreBlock(Settings settings) {
    super(settings);
    super.setExplosionChance(50);
  }
}
