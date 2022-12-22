package dev.krysztal.advagri.block;

import dev.krysztal.advagri.block.impls.NetherSulphurOreBlock;
import dev.krysztal.advagri.block.impls.SulphurOreBlock;
import dev.krysztal.advagri.block.impls.crops.*;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.annotation.GenType;
import dev.krysztal.advagri.foundation.annotation.GenTypes;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriBlocks {

  @GenTypes(
    types = {
      GenType.SimpleBlockModel, GenType.SimpleBlockLoot, GenType.MineShovel,
    }
  )
  public static Block ACIDIFIED_SOIL;

  @GenTypes(
    types = {
      GenType.SimpleBlockModel, GenType.SimpleBlockLoot, GenType.MineShovel,
    }
  )
  public static Block HARDENED_SOIL;

  @GenTypes(
    types = {
      GenType.SimpleBlockModel, GenType.MinePickaxe, GenType.MineLevel1,
    }
  )
  public static Block PHOS_ORE;

  @GenTypes(
    types = {
      GenType.SimpleBlockModel, GenType.MinePickaxe, GenType.MineLevel1,
    }
  )
  public static Block SULPHUR_ORE;

  @GenTypes(
    types = {
      GenType.SimpleBlockModel, GenType.MinePickaxe, GenType.MineLevel1,
    }
  )
  public static Block NETHER_SULPHUR_ORE;

  @GenTypes(types = { GenType.SimpleBlockModel, GenType.MineShovel })
  public static Block VERMICULITE_ORE;

  //====================== Log ===================//
  @GenTypes(
    types = {
      GenType.SimpleBlockLoot, GenType.MineAxe, GenType.SimpleItemModel,
    }
  )
  public static Block GINKGO_LOG;

  //====================== Wood ====================//
  @GenTypes(
    types = {
      GenType.SimpleBlockLoot, GenType.MineAxe, GenType.SimpleItemModel,
    }
  )
  public static Block GINKGO_WOOD;

  //====================== Stripped log ==========//
  @GenTypes(
    types = {
      GenType.SimpleBlockLoot, GenType.MineAxe, GenType.SimpleItemModel,
    }
  )
  public static Block STRIPPED_GINKGO_LOG;

  //====================== Stripped wood ==========//
  @GenTypes(
    types = {
      GenType.SimpleBlockLoot, GenType.MineAxe, GenType.SimpleItemModel,
    }
  )
  public static Block STRIPPED_GINKGO_WOOD;

  //====================== Planks =================//
  @GenTypes(
    types = {
      GenType.SimpleBlockLoot,
      GenType.MineAxe,
      GenType.SimpleBlockState,
      GenType.SimpleItemModel,
    }
  )
  public static Block GINKGO_PLANKS;

  //====================== Leaves =================//
  @GenTypes(types = { GenType.MineAxe, GenType.SimpleBlockModel })
  public static Block GINKGO_LEAVES;

  //================= Plants Blocks ===============//
  @GenTypes(types = { GenType.CropBlockState })
  public static CornBlock CORN_BLOCK;

  @GenTypes(types = { GenType.CropBlockState })
  public static GarlicBlock GARLIC_BLOCK;

  @GenTypes(types = { GenType.CropBlockState })
  public static LettuceBlock LETTUCE_BLOCK;

  public static SolarBerryBushBlock SOLAR_BERRY_BUSH_BLOCK;

  public static StrawBerryBlock STRAW_BERRY_BLOCK;

  @GenTypes(types = { GenType.CropBlockState })
  public static SweetPotatoBlock SWEET_POTATO_BLOCK;

  @GenTypes(types = { GenType.CropBlockState })
  public static WaterChestnutBlock WATER_CHESTNUT_BLOCK;

  public static void init() {
    ACIDIFIED_SOIL = registry(defaultBlock(Blocks.DIRT), "acidified_soil");
    HARDENED_SOIL = registry(defaultBlock(Blocks.DIRT), "hardened_soil");
    PHOS_ORE =
      registry(
        new Block(
          FabricBlockSettings
            .copyOf(Blocks.COAL_ORE)
            .luminance(8)
            .requiresTool()
        ),
        "phos_ore"
      );
    SULPHUR_ORE =
      registry(
        new SulphurOreBlock(
          FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
        ),
        "sulphur_ore"
      );
    NETHER_SULPHUR_ORE =
      registry(
        new NetherSulphurOreBlock(
          FabricBlockSettings.copyOf(Blocks.COAL_ORE).requiresTool()
        ),
        "nether_sulphur_ore"
      );
    VERMICULITE_ORE = registry(defaultBlock(Blocks.DIRT), "vermiculite_ore");

    //====================== Log =====================//
    GINKGO_LOG =
      registry(
        new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)
        ),
        "ginkgo_log"
      );
    //====================== Wood ====================//
    GINKGO_WOOD =
      registry(
        new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)
        ),
        "ginkgo_wood"
      );

    //====================== Stripped log ==========//
    STRIPPED_GINKGO_LOG =
      registry(
        new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)
        ),
        "stripped_ginkgo_log"
      );
    //====================== Stripped log ==========//
    STRIPPED_GINKGO_WOOD =
      registry(
        new PillarBlock(
          FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)
        ),
        "stripped_ginkgo_wood"
      );

    //====================== Planks =================//
    GINKGO_PLANKS =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).luminance(4)),
        "ginkgo_planks"
      );

    //====================== Leaves =================//
    GINKGO_LEAVES =
      registry(
        new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).luminance(4)),
        "ginkgo_leaves"
      );

    //================= Plants Blocks ===============//
    CORN_BLOCK =
      registryPlant(
        new CornBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "corn_block"
      );

    GARLIC_BLOCK =
      registryPlant(
        new GarlicBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "garlic_block"
      );

    LETTUCE_BLOCK =
      registryPlant(
        new LettuceBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "lettuce_block"
      );

    SOLAR_BERRY_BUSH_BLOCK =
      registryPlant(
        new SolarBerryBushBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "solar_berry_bush_block"
      );

    STRAW_BERRY_BLOCK =
      registryPlant(
        new StrawBerryBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "strawberry_block"
      );

    SWEET_POTATO_BLOCK =
      registryPlant(
        new SweetPotatoBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "sweet_potato_block"
      );

    WATER_CHESTNUT_BLOCK =
      registryPlant(
        new WaterChestnutBlock(FabricBlockSettings.copyOf(Blocks.CARROTS)),
        "water_chestnut_block"
      );
  }

  private static <T extends Block> T registry(T block, String path) {
    Registry.register(
      Registry.BLOCK,
      new Identifier(AdvAgriConstants.MODID, path),
      block
    );
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.MODID, path),
      new BlockItem(
        block,
        new FabricItemSettings()
          .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      )
    );
    return block;
  }

  private static <T extends Block> T registryPlant(T block, String path) {
    Registry.register(
      Registry.BLOCK,
      new Identifier(AdvAgriConstants.MODID, path),
      block
    );
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.MODID, path),
      new BlockItem(block, new FabricItemSettings())
    );
    return block;
  }

  private static Block defaultBlock(Block block) {
    return defaultBlock(block, true);
  }

  private static Block defaultBlock(Block block, boolean requiresTool) {
    return requiresTool
      ? new Block(FabricBlockSettings.copyOf(block).requiresTool())
      : new Block(FabricBlockSettings.copyOf(block));
  }
}
