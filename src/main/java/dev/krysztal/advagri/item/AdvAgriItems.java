package dev.krysztal.advagri.item;

import dev.krysztal.advagri.AdvAgriConstants;
import dev.krysztal.advagri.AdvAgriItemGroup;
import dev.krysztal.advagri.item.impls.BambooChopper;
import dev.krysztal.advagri.item.impls.BambooDrillRod;
import dev.krysztal.advagri.item.impls.Fertilizer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class AdvAgriItems {


    public static Item FERTILIZER;
    public static Item POTASSIUM_SALT_POWDER;
    public static Item PLANT_ASH;
    public static Item BOTTLE_SMALL;
    public static Item BOTTLE_MEDIUM;
    public static Item BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_LARGE;
    public static Item SOLARIUM_BOTTLE_MEDIUM;
    public static Item SOLARIUM_BOTTLE_SMALL;
    public static Item BAMBOO_LEAVES;
    public static Item BAMBOO_SILK;
    public static Item BAMBOO_SILK_BOARD;
    public static Item BAMBOO_CHARCOAL;
    public static Item BAMBOO_CHARCOAL_BALL;
    public static Item BAMBOO_SHOOT;
    public static Item PHOS;
    public static Item VERMICULITE;
    public static Item SULFUR;

    public static BambooChopper BAMBOO_CHOPPER;

    // Tools
    public static BambooDrillRod BAMBOO_DRILL_ROD;

    // Plant "Seed"
    public static Item SEED_BAG_RICE;
    public static Item SEED_BAG_CHILI;
    public static Item SEED_BAG_CELERY;
    public static Item SEED_BAG_LETTUCE;
    public static Item SEED_BAG_STRAWBERRY;
    public static Item SEED_BAG_CORN;
    public static Item SWEET_POTATO_VINE;

    // Crops
    public static Item RICE_UNHUSKED;
    public static Item RICE;
    public static Item PLANT_STRAW;
    public static Item SWEET_POTATO;
    public static Item CHILI;
    public static Item CELERY;
    public static Item LETTUCE;
    public static Item STRAWBERRY;
    public static Item GARLIC;
    public static Item WATER_CHESTNUT;

    // Bushes
    public static Item SOLAR_BERRY;


    static {
        FERTILIZER = registry(new Fertilizer(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "fertilizer");
        POTASSIUM_SALT_POWDER = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "potassium_salt_powder");
        PLANT_ASH = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "plant_ash");
        BOTTLE_SMALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_small");
        BOTTLE_MEDIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_medium");
        BOTTLE_LARGE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bottle_large");
        SOLARIUM_BOTTLE_SMALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_small");
        SOLARIUM_BOTTLE_MEDIUM = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_medium");
        SOLARIUM_BOTTLE_LARGE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solarium_bottle_large");
        BAMBOO_LEAVES = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_leaves");
        BAMBOO_SILK = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_silk");
        BAMBOO_SILK_BOARD = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_silk_board");
        BAMBOO_CHARCOAL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_charcoal");
        BAMBOO_CHARCOAL_BALL = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_charcoal_ball");
        BAMBOO_SHOOT = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_shoot");
        PHOS = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "phos");
        VERMICULITE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "vermiculite");
        SULFUR = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sulfur");

        SEED_BAG_RICE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice_seed_bag");
        SEED_BAG_CHILI = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "chili_seed_bag");
        SEED_BAG_CELERY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "celery_seed_bag");
        SEED_BAG_LETTUCE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lettuce_seed_bag");
        SEED_BAG_STRAWBERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "strawberry_seed_bag");
        SEED_BAG_CORN = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "corn_seed_bag");
        SWEET_POTATO_VINE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sweet_potato_vine");
        RICE_UNHUSKED = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice_unhusked");
        RICE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "rice");
        PLANT_STRAW = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "plant_straw");
        SWEET_POTATO = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "sweet_potato");
        CHILI = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "chili");
        CELERY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "celery");
        LETTUCE = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "lettuce");
        STRAWBERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "strawberry");
        GARLIC = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "garlic");
        WATER_CHESTNUT = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "water_chestnut");

        SOLAR_BERRY = registry(new Item(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "solar_berry");

        BAMBOO_CHOPPER = registry(new BambooChopper(ToolMaterials.IRON, 1, 0F, new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_chopper");
        BAMBOO_DRILL_ROD = registry(new BambooDrillRod(new FabricItemSettings().group(AdvAgriItemGroup.ADV_AGRI_CORE_ITEM_GROUP)), "bamboo_drill_rod");
    }

    static {
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL_BALL, 80 * 20);   //80s
        FuelRegistry.INSTANCE.add(BAMBOO_CHARCOAL, 20 * 20);        //20s
        FuelRegistry.INSTANCE.add(BAMBOO_LEAVES, 2 * 20);           //2s
    }

    private static <T extends Item> T registry(T item, String path) {
        Registry.register(Registry.ITEM, new Identifier(AdvAgriConstants.ADV_AGRI_NAMESPACE, path), item);
        return item;
    }
}
