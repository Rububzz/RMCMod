package net.raebu.raebumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.raebu.raebumod.RaebuMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.entity.ModEntities;

public class ModItems {
        public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
        public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));
        public static final Item PINK_GARNET_HELMET = registerItem("pink_garnet_helmet",
                        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                                        new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
        public static final Item PINK_GARNET_CHESTPLATE = registerItem("pink_garnet_chestplate",
                        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                                        new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
        public static final Item PINK_GARNET_LEGGINGS = registerItem("pink_garnet_leggings",
                        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
        public static final Item PINK_GARNET_BOOTS = registerItem("pink_garnet_boots",
                        new ArmorItem(ModArmorMaterials.PINK_GARNET_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
        public static final Item CINNA_HELMET = registerItem("cinna_helmet",
                        new ArmorItem(ModArmorMaterials.CINNA_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                                        new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
        public static final Item CINNA_CHESTPLATE = registerItem("cinna_chestplate",
                        new ArmorItem(ModArmorMaterials.CINNA_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                                        new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
        public static final Item CINNA_LEGGINGS = registerItem("cinna_leggings",
                        new ArmorItem(ModArmorMaterials.CINNA_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
        public static final Item CINNA_BOOTS = registerItem("cinna_boots",
                        new ArmorItem(ModArmorMaterials.CINNA_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
        public static final Item HACHIWARE_HELMET = registerItem("hachiware_helmet",
                        new ArmorItem(ModArmorMaterials.HACHIWARE_ARMOR_MATERIAL, ArmorItem.Type.HELMET,
                                        new Item.Settings().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(15))));
        public static final Item HACHIWARE_CHESTPLATE = registerItem("hachiware_chestplate",
                        new ArmorItem(ModArmorMaterials.HACHIWARE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                                        new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(15))));
        public static final Item HACHIWARE_LEGGINGS = registerItem("hachiware_leggings",
                        new ArmorItem(ModArmorMaterials.HACHIWARE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
        public static final Item HACHIWARE_BOOTS = registerItem("hachiware_boots",
                        new ArmorItem(ModArmorMaterials.HACHIWARE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS,
                                        new Item.Settings().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(15))));
        public static final Item TANDEMAUS_SPAWN_EGG = registerItem("tandemaus_spawn_egg",
                        new SpawnEggItem(ModEntities.TANDEMAUS, 0xE8DED3, 0x6F6258, new Item.Settings()));
        public static final Item MAUSHOLD_THREE_SPAWN_EGG = registerItem("maushold_3_spawn_egg",
                        new SpawnEggItem(ModEntities.MAUSHOLD_3, 0xF2E4D7, 0xB79A84, new Item.Settings()));
        public static final Item MAUSHOLD_FOUR_SPAWN_EGG = registerItem("maushold_4_spawn_egg",
                        new SpawnEggItem(ModEntities.MAUSHOLD_4, 0xEFE0CF, 0xA88772, new Item.Settings()));
        public static final Item SYLVEON_SPAWN_EGG = registerItem("sylveon_spawn_egg",
                        new SpawnEggItem(ModEntities.SYLVEON, 0xF8D6E3, 0x7EB7E6, new Item.Settings()));
        public static final Item HACHIWARE_SPAWN_EGG = registerItem("hachiware_spawn_egg",
                        new SpawnEggItem(ModEntities.HACHIWARE, 0x5f6f9c, 0xf7f7f7, new Item.Settings()));

        public static final Item CINNAMONROLL_SWORD = registerItem("cinnamonroll_sword",
                        new SwordItem(ModToolMaterials.PINK_GARNETT, new Item.Settings().attributeModifiers(
                                        SwordItem.createAttributeModifiers(ModToolMaterials.PINK_GARNETT, 3, -2.4f))));
        public static final Item KUROMI_PICKAXE = registerItem("kuromi_pickaxe", new PickaxeItem(
                        ModToolMaterials.PINK_GARNETT, new Item.Settings().attributeModifiers(PickaxeItem
                                        .createAttributeModifiers(ModToolMaterials.PINK_GARNETT, 1, -2.8f))));
        public static final Item MYMELO_AXE = registerItem("mymelo_axe",
                        new AxeItem(ModToolMaterials.PINK_GARNETT, new Item.Settings().attributeModifiers(
                                        AxeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNETT, 6, -3.2f))));
        public static final Item POMPOM_SHOVEL = registerItem("pomppom_shovel",
                        new ShovelItem(ModToolMaterials.PINK_GARNETT, new Item.Settings().attributeModifiers(ShovelItem
                                        .createAttributeModifiers(ModToolMaterials.PINK_GARNETT, 1.5f, -3.0f))));
        public static final Item HELLO_KITTIE_HOE = registerItem("hello_kittie_hoe",
                        new HoeItem(ModToolMaterials.PINK_GARNETT, new Item.Settings().attributeModifiers(
                                        HoeItem.createAttributeModifiers(ModToolMaterials.PINK_GARNETT, 0, -3f))));

        private static Item registerItem(String name, Item item) {
                return Registry.register(Registries.ITEM, Identifier.of(RaebuMod.MOD_ID, name), item);
        }

        public static void registerModItems() {
                RaebuMod.LOGGER.info("Registering Mod Items for " + RaebuMod.MOD_ID);

                ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
                        entries.add(PINK_GARNET);
                        entries.add(RAW_PINK_GARNET);
                });
        }
}