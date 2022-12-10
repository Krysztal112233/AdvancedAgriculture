package dev.krysztal.advagri.block;

import com.tterrag.registrate.util.entry.RegistryEntry;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import dev.krysztal.advagri.block.impls.NetherSulphurOreBlock;
import dev.krysztal.advagri.block.impls.SulphurOreBlock;
import dev.krysztal.advagri.block.impls.crops.CeleryBlock;
import dev.krysztal.advagri.block.impls.crops.ChiliBlock;
import dev.krysztal.advagri.block.impls.crops.CornBlock;
import dev.krysztal.advagri.block.impls.crops.GarlicBlock;
import dev.krysztal.advagri.block.impls.crops.LettuceBlock;
import dev.krysztal.advagri.block.impls.crops.RiceBlock;
import dev.krysztal.advagri.block.impls.crops.SolarBerryBushBlock;
import dev.krysztal.advagri.block.impls.crops.StrawBerryBlock;
import dev.krysztal.advagri.block.impls.crops.SweetPotatoBlock;
import dev.krysztal.advagri.block.impls.crops.WaterChestnutBlock;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.AdvAgriRegistrates;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;

public class AdvAgriBlocks {

  //============== Functional Block ==============//
  public static RegistryEntry<Block> ACIDIFIED_SOIL;
  public static RegistryEntry<Block> HARDENED_SOIL;

  //====================== Ore ===================//
  public static RegistryEntry<Block> VERMICULITE_ORE;
  public static RegistryEntry<Block> PHOS_ORE;
  public static RegistryEntry<SulphurOreBlock> SULPHUR_ORE;
  public static RegistryEntry<NetherSulphurOreBlock> NETHER_SULPHUR_ORE;

  //====================== Log ====================//
  public static RegistryEntry<PillarBlock> GINKGO_LOGS;

  //====================== Wood ===================//
  public static RegistryEntry<PillarBlock> GINKGO_WOOD;

  //====================== Stripped log ===========//
  public static RegistryEntry<PillarBlock> STRIPPED_GINKGO_LOGS;

  //====================== Stripped wood ==========//
  public static RegistryEntry<PillarBlock> STRIPPED_GINKGO_WOOD;

  //====================== Planks =================//
  public static RegistryEntry<Block> GINKGO_PLANKS;

  //====================== Leaves =================//
  public static RegistryEntry<Block> GINKGO_LEAVES;

  //================= Plants Blocks ===============//
  // Crop type
  public static RegistryEntry<CornBlock> CRON_BLOCK;
  public static RegistryEntry<GarlicBlock> GARLIC_BLOCK;
  public static RegistryEntry<LettuceBlock> LETTUCE_BLOCK;
  public static RegistryEntry<SweetPotatoBlock> SWEET_POTATO_BLOCK;
  public static RegistryEntry<WaterChestnutBlock> WATER_CHESTNUT_BLOCK;
  public static RegistryEntry<ChiliBlock> CHILI_BLOCK;
  public static RegistryEntry<CeleryBlock> CELERY_BLOCK;
  public static RegistryEntry<RiceBlock> RICE_BLOCK;
  // Bush type
  public static RegistryEntry<SolarBerryBushBlock> SOLAR_BERRY_BUSH_BLOCK;
  public static RegistryEntry<StrawBerryBlock> STRAW_BERRY_BLOCK;

  public static void init() {
    ACIDIFIED_SOIL = registerBlock("acidified_soil", BlockTags.SHOVEL_MINEABLE);
    HARDENED_SOIL = registerBlock("hardened_soil", BlockTags.SHOVEL_MINEABLE);
    PHOS_ORE =
      registerBlock(
        "phos_ore",
        FabricBlockSettings.copyOf(Blocks.COAL_ORE).luminance(8).requiresTool(),
        BlockTags.PICKAXE_MINEABLE
      );
    SULPHUR_ORE =
      AdvAgriRegistrates.BLOCK_REGISTRATE
        .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .block(
          "sulphur_ore",
          $ ->
            new SulphurOreBlock(
              FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
            )
        )
        .tag(BlockTags.PICKAXE_MINEABLE)
        .register();
    NETHER_SULPHUR_ORE =
      AdvAgriRegistrates.BLOCK_REGISTRATE
        .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .block(
          "nether_sulphur_ore",
          $ ->
            new NetherSulphurOreBlock(
              FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
            )
        )
        .tag(BlockTags.PICKAXE_MINEABLE)
        .register();

    VERMICULITE_ORE =
      registerBlock(
        "vermiculite_ore",
        FabricBlockSettings.copyOf(Blocks.DIRT),
        BlockTags.PICKAXE_MINEABLE
      );

    //====================== Log =====================//
    GINKGO_LOGS =
      registerPillarBlock(
        "ginkgo_logs",
        FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4),
        AdvAgriTags.BlockTags.GINKGO_LOGS
      );
    //====================== Wood ====================//
    GINKGO_WOOD =
      registerPillarBlock(
        "ginkgo_wood",
        FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4),
        AdvAgriTags.BlockTags.GINKGO_LOGS
      );

    //====================== Stripped log ==========//
    STRIPPED_GINKGO_LOGS =
      registerPillarBlock(
        "stripped_ginkgo_logs",
        FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4),
        AdvAgriTags.BlockTags.GINKGO_LOGS
      );

    //====================== Stripped wood ==========//
    STRIPPED_GINKGO_WOOD =
      registerPillarBlock(
        "stripped_ginkgo_wood",
        FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4),
        AdvAgriTags.BlockTags.GINKGO_LOGS
      );

    //====================== Planks =================//
    GINKGO_PLANKS =
      registerBlock(
        "ginkgo_planks",
        FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4),
        BlockTags.PLANKS
      );

    //====================== Leaves =================//
    GINKGO_LEAVES =
      registerBlock(
        "ginkgo_leaves",
        FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).luminance(4),
        BlockTags.LEAVES
      );

    //================= Plants Blocks ===============//
    CRON_BLOCK = registerPlantBlock(CornBlock::new, "corn_block");
    GARLIC_BLOCK = registerPlantBlock(GarlicBlock::new, "garlic_block");
    LETTUCE_BLOCK = registerPlantBlock(LettuceBlock::new, "lettuce_block");
    SOLAR_BERRY_BUSH_BLOCK =
      registerPlantBlock(SolarBerryBushBlock::new, "solar_berry_bush_block");
    STRAW_BERRY_BLOCK =
      registerPlantBlock(StrawBerryBlock::new, "strawberry_block");
    SWEET_POTATO_BLOCK =
      registerPlantBlock(SweetPotatoBlock::new, "sweet_potato_block");
    WATER_CHESTNUT_BLOCK =
      registerPlantBlock(WaterChestnutBlock::new, "water_chestnut_block");
    RICE_BLOCK = registerPlantBlock(RiceBlock::new, "rice_block");
    CHILI_BLOCK = registerPlantBlock(ChiliBlock::new, "chili_block");
    CELERY_BLOCK = registerPlantBlock(CeleryBlock::new, "celery_block");
  }

  @SafeVarargs
  private static RegistryEntry<Block> registerBlock(
    String path,
    TagKey<Block>... tag
  ) {
    return AdvAgriRegistrates.BLOCK_REGISTRATE
      .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .block(path, Block::new)
      .tag(tag)
      .register();
  }

  @SafeVarargs
  private static RegistryEntry<Block> registerBlock(
    String path,
    AbstractBlock.Settings settings,
    TagKey<Block>... tag
  ) {
    return AdvAgriRegistrates.BLOCK_REGISTRATE
      .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .block(path, $ -> new Block(settings))
      .tag(tag)
      .register();
  }

  @SafeVarargs
  private static RegistryEntry<PillarBlock> registerPillarBlock(
    String path,
    AbstractBlock.Settings settings,
    TagKey<Block>... tag
  ) {
    return AdvAgriRegistrates.BLOCK_REGISTRATE
      .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .block(path, $ -> new PillarBlock(settings))
      .tag(tag)
      .register();
  }

  private static <T extends PlantBlock> RegistryEntry<T> registerPlantBlock(
    NonNullFunction<AbstractBlock.Settings, T> block,
    String path
  ) {
    return AdvAgriRegistrates.BLOCK_REGISTRATE
      .creativeModeTab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .block(path, Material.PLANT, block)
      .register();
  }
}
