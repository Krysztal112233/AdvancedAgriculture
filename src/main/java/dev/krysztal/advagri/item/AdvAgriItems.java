package dev.krysztal.advagri.item;

import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriConstants;
import dev.krysztal.advagri.foundation.AdvAgriFoodComponents;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.annotation.GenTypes;
import dev.krysztal.advagri.item.impls.BambooChopper;
import dev.krysztal.advagri.item.impls.BambooDrillRod;
import dev.krysztal.advagri.item.impls.Fertilizer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class AdvAgriItems {

  @GenTypes
  public static Item FERTILIZER;

  @GenTypes
  public static Item POTASSIUM_SALT_POWDER;

  @GenTypes
  public static Item PLANT_ASH;

  @GenTypes
  public static Item BOTTLE_SMALL;

  @GenTypes
  public static Item BOTTLE_MEDIUM;

  @GenTypes
  public static Item BOTTLE_LARGE;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_LARGE;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_MEDIUM;

  @GenTypes
  public static Item SOLARIUM_BOTTLE_SMALL;

  @GenTypes
  public static Item BAMBOO_LEAVES;

  @GenTypes
  public static Item BAMBOO_SILK;

  @GenTypes
  public static Item BAMBOO_SILK_BOARD;

  @GenTypes
  public static Item BAMBOO_CHARCOAL;

  @GenTypes
  public static Item BAMBOO_CHARCOAL_BALL;

  public static Item BAMBOO_SAPLING;

  @GenTypes
  public static Item PHOS;

  @GenTypes
  public static Item VERMICULITE;

  @GenTypes
  public static Item SULFUR;

  @GenTypes
  public static BambooChopper BAMBOO_CHOPPER;

  //===================== Tools ===================//
  @GenTypes
  public static BambooDrillRod BAMBOO_DRILL_ROD;

  //================== "Seed" ====================//
  @GenTypes
  public static Item SEED_BAG_RICE;

  @GenTypes
  public static Item SEED_BAG_CHILI;

  @GenTypes
  public static Item SEED_BAG_CELERY;

  @GenTypes
  public static Item SEED_BAG_LETTUCE;

  @GenTypes
  public static Item SEED_BAG_STRAWBERRY;

  @GenTypes
  public static Item SEED_BAG_CORN;

  @GenTypes
  public static Item SEED_BAG_SWEET_POTATO_BEAN;

  //========= Agricultural Products =============//
  @GenTypes
  public static Item RICE_UNHUSKED;

  @GenTypes
  public static Item RICE;

  @GenTypes
  public static Item PLANT_STRAW;

  @GenTypes
  public static Item CHILI;

  @GenTypes
  public static Item CELERY;

  @GenTypes
  public static Item LETTUCE;

  @GenTypes
  public static Item STRAWBERRY;

  @GenTypes
  public static Item GARLIC;

  @GenTypes
  public static Item WATER_CHESTNUT;

  @GenTypes
  public static Item CORN;

  //================ Food =====================//
  @GenTypes
  public static Item ASPARAGUS;

  @GenTypes
  public static Item PEELED_BAMBOO_SAPLING;

  @GenTypes
  public static Item SOLAR_BERRY;

  @GenTypes
  public static Item SWEET_POTATO;

  @GenTypes
  public static Item ACORNS;

  @GenTypes
  public static Item ROASTED_ACORNS;

  @GenTypes
  public static Item GINKGO_NUTS;

  public static void init() {}

  static {
    FERTILIZER =
      registry(
        new Fertilizer(
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "fertilizer"
      );
    POTASSIUM_SALT_POWDER = registry("potassium_salt_powder");
    PLANT_ASH = registry("plant_ash");
    BOTTLE_SMALL = registry("bottle_small");
    BOTTLE_MEDIUM = registry("bottle_medium");
    BOTTLE_LARGE = registry("bottle_large");
    SOLARIUM_BOTTLE_SMALL = registry("solarium_bottle_small");
    SOLARIUM_BOTTLE_MEDIUM = registry("solarium_bottle_medium");
    SOLARIUM_BOTTLE_LARGE = registry("solarium_bottle_large");
    BAMBOO_LEAVES = registry("bamboo_leaves");
    BAMBOO_SILK = registry("bamboo_silk");
    BAMBOO_SILK_BOARD = registry("bamboo_silk_board");
    BAMBOO_CHARCOAL = registry("bamboo_charcoal");
    BAMBOO_CHARCOAL_BALL = registry("bamboo_charcoal_ball");
    BAMBOO_SAPLING = registry("bamboo_sapling");
    PHOS = registry("phos");
    VERMICULITE = registry("vermiculite");
    SULFUR = registry("sulfur");
  }

  static {
    SEED_BAG_RICE = registry("rice_seed_bag");
    SEED_BAG_CHILI = registry("chili_seed_bag");
    SEED_BAG_CELERY = registry("celery_seed_bag");
    SEED_BAG_LETTUCE = registry("lettuce_seed_bag");
    SEED_BAG_STRAWBERRY = registry("strawberry_seed_bag");
    SEED_BAG_CORN = registryAliased("corn_seed_bag", AdvAgriBlocks.CORN_BLOCK);
    SEED_BAG_SWEET_POTATO_BEAN = registry("sweet_potato_bean_seed_bag");
    RICE_UNHUSKED = registry("rice_unhusked");
    RICE = registry("rice");
    PLANT_STRAW = registry("plant_straw");
    CHILI = registry("chili");
    CELERY = registry("celery");
    LETTUCE = registry("lettuce");
    STRAWBERRY = registry("strawberry");
    GARLIC = registry("garlic");
    CORN = registry("corn");
    WATER_CHESTNUT =
      registryAliased("water_chestnut", AdvAgriBlocks.WATER_CHESTNUT_BLOCK);

    BAMBOO_CHOPPER =
      registry(
        new BambooChopper(
          ToolMaterials.IRON,
          1,
          0F,
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "bamboo_chopper"
      );
    BAMBOO_DRILL_ROD =
      registry(
        new BambooDrillRod(
          new FabricItemSettings()
            .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        ),
        "bamboo_drill_rod"
      );
  }

  static {
    ASPARAGUS =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.ASPARAGUS)
        ),
        "asparagus"
      );

    PEELED_BAMBOO_SAPLING =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.PEELED_BAMBOO_SAPLING)
        ),
        "peeled_bamboo_shoot"
      );

    SWEET_POTATO =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.SWEET_POTATO)
        ),
        "sweet_potato"
      );

    SOLAR_BERRY =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.SOLAR_BERRY)
        ),
        "solar_berry"
      );

    ACORNS =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(FoodComponents.DRIED_KELP)
        ),
        "acorns"
      );

    ROASTED_ACORNS =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.ROASTED_ACORNS)
        ),
        "roasted_acorns"
      );

    GINKGO_NUTS =
      registry(
        new Item(
          new FabricItemSettings()
            .group(ItemGroup.FOOD)
            .food(AdvAgriFoodComponents.GINKGO_NUTS)
        ),
        "ginkgo_nuts"
      );
  }

  static {
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL, 80 * 20); //80s
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL, 20 * 20); //20s
    FuelRegistry.INSTANCE.add(BAMBOO_LEAVES, 2 * 20); //2s
  }

  private static <T extends Item> T registry(T item, String path) {
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.MODID, path),
      item
    );
    return item;
  }

  private static Item registryAliased(String path, Block aliasedBlock) {
    var aliased = new AliasedBlockItem(
      aliasedBlock,
      new FabricItemSettings().group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
    );
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.MODID, path),
      aliased
    );
    return aliased;
  }

  private static Item registry(String path) {
    var di = defaultItem();
    Registry.register(
      Registry.ITEM,
      new Identifier(AdvAgriConstants.MODID, path),
      di
    );
    return di;
  }

  private static Item defaultItem() {
    return new Item(
      new FabricItemSettings().group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
    );
  }
}
