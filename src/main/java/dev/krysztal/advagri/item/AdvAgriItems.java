package dev.krysztal.advagri.item;

import com.tterrag.registrate.util.entry.RegistryEntry;
import dev.krysztal.advagri.block.AdvAgriBlocks;
import dev.krysztal.advagri.foundation.AdvAgriFoodComponents;
import dev.krysztal.advagri.foundation.AdvAgriItemGroups;
import dev.krysztal.advagri.foundation.AdvAgriRegistrates;
import dev.krysztal.advagri.foundation.AdvAgriTags;
import dev.krysztal.advagri.item.impls.BambooChopper;
import dev.krysztal.advagri.item.impls.BambooDrillRod;
import dev.krysztal.advagri.item.impls.Fertilizer;
import javax.annotation.Nonnull;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.tag.ItemTags;
import net.minecraft.tag.TagKey;

public class AdvAgriItems {

  public static RegistryEntry<Fertilizer> FERTILIZER;
  public static RegistryEntry<Item> POTASSIUM_SALT_POWDER;
  public static RegistryEntry<Item> PLANT_ASH;
  public static RegistryEntry<Item> BOTTLE_SMALL;
  public static RegistryEntry<Item> BOTTLE_MEDIUM;
  public static RegistryEntry<Item> BOTTLE_LARGE;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_LARGE;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_MEDIUM;
  public static RegistryEntry<Item> SOLARIUM_BOTTLE_SMALL;
  public static RegistryEntry<Item> BAMBOO_LEAVES;
  public static RegistryEntry<Item> BAMBOO_SILK;
  public static RegistryEntry<Item> BAMBOO_SILK_BOARD;
  public static RegistryEntry<Item> BAMBOO_CHARCOAL;
  public static RegistryEntry<Item> BAMBOO_CHARCOAL_BALL;

  public static RegistryEntry<Item> BAMBOO_SAPLING;
  public static RegistryEntry<Item> PHOS;
  public static RegistryEntry<Item> VERMICULITE;
  public static RegistryEntry<Item> SULFUR;
  public static RegistryEntry<BambooChopper> BAMBOO_CHOPPER;

  //===================== Tools ===================/
  public static RegistryEntry<BambooDrillRod> BAMBOO_DRILL_ROD;

  //================== "Seed" ====================/
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_RICE;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CHILI;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CELERY;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_LETTUCE;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_STRAWBERRY;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_CORN;
  public static RegistryEntry<AliasedBlockItem> SEED_BAG_SWEET_POTATO_BEAN;

  //========= Agricultural Products =============/
  public static RegistryEntry<Item> RICE_UNHUSKED;
  public static RegistryEntry<Item> RICE;
  public static RegistryEntry<Item> CHILI;
  public static RegistryEntry<Item> CELERY;
  public static RegistryEntry<Item> LETTUCE;
  public static RegistryEntry<Item> STRAWBERRY;
  public static RegistryEntry<Item> GARLIC;
  public static RegistryEntry<AliasedBlockItem> WATER_CHESTNUT;
  public static RegistryEntry<Item> STRAW;

  //================ Food =====================/
  public static RegistryEntry<Item> ASPARAGUS;
  public static RegistryEntry<Item> PEELED_BAMBOO_SAPLING;
  public static RegistryEntry<Item> SOLAR_BERRY;
  public static RegistryEntry<Item> SWEET_POTATO;
  public static RegistryEntry<Item> ACORNS;
  public static RegistryEntry<Item> ROASTED_ACORNS;

  public static void init() {
    // Item registry
    FERTILIZER =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item("fertilizer", Fertilizer::new)
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();

    POTASSIUM_SALT_POWDER = registerDefaultItem("potassium_salt_powder");
    PLANT_ASH = registerDefaultItem("plant_ash");
    BOTTLE_SMALL = registerDefaultItem("bottle_small");
    BOTTLE_MEDIUM = registerDefaultItem("bottle_medium");
    BOTTLE_LARGE = registerDefaultItem("bottle_large");
    SOLARIUM_BOTTLE_SMALL = registerDefaultItem("solarium_bottle_small");
    SOLARIUM_BOTTLE_MEDIUM = registerDefaultItem("solarium_bottle_medium");
    SOLARIUM_BOTTLE_LARGE = registerDefaultItem("solarium_bottle_large");
    BAMBOO_LEAVES =
      registerDefaultItem("bamboo_leaves", AdvAgriTags.ItemTags.PLANT);
    BAMBOO_SILK = registerDefaultItem("bamboo_silk");
    BAMBOO_SILK_BOARD = registerDefaultItem("bamboo_silk_board");
    BAMBOO_CHARCOAL = registerDefaultItem("bamboo_charcoal");
    BAMBOO_CHARCOAL_BALL =
      registerDefaultItem("bamboo_charcoal_ball", ItemTags.LEAVES);
    BAMBOO_SAPLING = registerDefaultItem("bamboo_sapling");
    PHOS = registerDefaultItem("phos");
    VERMICULITE = registerDefaultItem("vermiculite");
    SULFUR = registerDefaultItem("sulfur");

    // Seed bag registry
    SEED_BAG_RICE =
      registerAliasedBlockItem("rice_seed_bag", AdvAgriBlocks.RICE_BLOCK.get());
    SEED_BAG_CHILI =
      registerAliasedBlockItem(
        "chili_seed_bag",
        AdvAgriBlocks.CHILI_BLOCK.get()
      );
    SEED_BAG_CELERY =
      registerAliasedBlockItem(
        "celery_seed_bag",
        AdvAgriBlocks.CELERY_BLOCK.get()
      );
    SEED_BAG_LETTUCE =
      registerAliasedBlockItem(
        "lettuce_seed_bag",
        AdvAgriBlocks.LETTUCE_BLOCK.get()
      );
    SEED_BAG_STRAWBERRY =
      registerAliasedBlockItem(
        "strawberry_seed_bag",
        AdvAgriBlocks.STRAW_BERRY_BLOCK.get()
      );
    SEED_BAG_CORN =
      registerAliasedBlockItem("corn_seed_bag", AdvAgriBlocks.CRON_BLOCK.get());
    SEED_BAG_SWEET_POTATO_BEAN =
      registerAliasedBlockItem(
        "sweet_potato_bean_seed_bag",
        AdvAgriBlocks.SWEET_POTATO_BLOCK.get()
      );

    // Agriculture product registry
    RICE = registerDefaultItem("rice");
    RICE_UNHUSKED = registerDefaultItem("rice_unhusked");
    CHILI = registerDefaultItem("chili");
    CELERY = registerDefaultItem("celery");
    LETTUCE = registerDefaultItem("lettuce");
    STRAWBERRY = registerDefaultItem("strawberry");
    GARLIC = registerDefaultItem("garlic");
    WATER_CHESTNUT =
      registerAliasedBlockItem(
        "water_chestnut",
        AdvAgriBlocks.WATER_CHESTNUT_BLOCK.get()
      );
    STRAW = registerDefaultItem("straw");

    // Util tool registry
    BAMBOO_CHOPPER =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item(
          "bamboo_chopper",
          ctx ->
            new BambooChopper(
              ToolMaterials.IRON,
              1,
              0F,
              new FabricItemSettings()
                .group(AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
            )
        )
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();

    BAMBOO_DRILL_ROD =
      AdvAgriRegistrates.ITEM_REGISTRATE
        .item("bamboo_drill_rod", BambooDrillRod::new)
        .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
        .register();

    // Food registry

    ASPARAGUS =
      registerDefaultFood("asparagus", AdvAgriFoodComponents.ASPARAGUS);

    PEELED_BAMBOO_SAPLING =
      registerDefaultFood(
        "peeled_bamboo_shoot",
        AdvAgriFoodComponents.PEELED_BAMBOO_SAPLING
      );

    SWEET_POTATO =
      registerDefaultFood("sweet_potato", AdvAgriFoodComponents.SWEET_POTATO);

    SOLAR_BERRY =
      registerDefaultFood("solar_berry", AdvAgriFoodComponents.SOLAR_BERRY);

    ACORNS = registerDefaultFood("acorns", FoodComponents.DRIED_KELP);

    ROASTED_ACORNS =
      registerDefaultFood(
        "roasted_acorns",
        AdvAgriFoodComponents.ROASTED_ACORNS
      );

    // Fuel registry
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL.get(), 80 * 20); //80s
    FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL.get(), 20 * 20); //20s
    FuelRegistry.INSTANCE.add(BAMBOO_LEAVES.get(), 2 * 20); //2s
  }

  private static RegistryEntry<AliasedBlockItem> registerAliasedBlockItem(
    String path,
    Block aliasedBlock
  ) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, s -> new AliasedBlockItem(aliasedBlock, s))
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }

  private static RegistryEntry<Item> registerDefaultItem(String path) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, Item::new)
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }

  @SafeVarargs
  private static RegistryEntry<Item> registerDefaultItem(
    String path,
    TagKey<Item>... tag
  ) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, Item::new)
      .tag(tag)
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }

  private static RegistryEntry<Item> registerDefaultFood(
    String path,
    FoodComponent foodComponent
  ) {
    return AdvAgriRegistrates.ITEM_REGISTRATE
      .item(path, s -> new Item(s.food(foodComponent)))
      .tab(() -> AdvAgriItemGroups.ADV_AGRI_CORE_ITEM_GROUP)
      .register();
  }
}
