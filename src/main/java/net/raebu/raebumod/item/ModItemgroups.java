package net.raebu.raebumod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;

public class ModItemgroups {
    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(RaebuMod.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET)).displayName(Text.translatable("itemgroup.raebumod.pink_garnet_items")).entries((displayContext, entries) ->{
                entries.add(ModItems.PINK_GARNET);
                entries.add(ModItems.RAW_PINK_GARNET);
                entries.add(ModItems.PINK_GARNET_HELMET);
                entries.add(ModItems.PINK_GARNET_BOOTS);
                entries.add(ModItems.PINK_GARNET_CHESTPLATE);
                entries.add(ModItems.PINK_GARNET_LEGGINGS);
            } ).build());

    public static void registerItemGroups() {
        RaebuMod.LOGGER.info("Register Item Groups for " + RaebuMod.MOD_ID);
    }
}
