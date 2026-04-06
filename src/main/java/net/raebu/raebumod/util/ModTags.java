package net.raebu.raebumod.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;

public class ModTags {
    public static class Blocks {
        public final TagKey<Block> NEEDS_SANRIO_TOOL = createTag("needs_sanrio_tool");
        public static final TagKey<Block> INCORRECT_FOR_SANRIO_TOOL = createTag("incorrect_for_sanrio_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(RaebuMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> TRANSFORMABLE_ITEMS = createTag("transformable_items");
        public static final TagKey<Item> CINNA_REPAIR_ITEMS = createTag("cinna_repair_items");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(RaebuMod.MOD_ID, name));
        }
    }
}
