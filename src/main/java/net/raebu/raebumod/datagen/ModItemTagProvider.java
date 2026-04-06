package net.raebu.raebumod.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.raebu.raebumod.item.ModItems;
import net.raebu.raebumod.util.ModTags;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.TRANSFORMABLE_ITEMS).add(ModItems.PINK_GARNET)
                .add(ModItems.RAW_PINK_GARNET);
        getOrCreateTagBuilder(ModTags.Items.CINNA_REPAIR_ITEMS).add(ModItems.PINK_GARNET);
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.PINK_GARNET_HELMET)
                .add(ModItems.PINK_GARNET_CHESTPLATE)
                .add(ModItems.PINK_GARNET_LEGGINGS)
                .add(ModItems.PINK_GARNET_BOOTS)
                .add(ModItems.CINNA_HELMET)
                .add(ModItems.CINNA_CHESTPLATE)
                .add(ModItems.CINNA_LEGGINGS)
                .add(ModItems.CINNA_BOOTS);
    }
}
