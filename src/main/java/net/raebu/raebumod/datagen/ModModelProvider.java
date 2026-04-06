package net.raebu.raebumod.datagen;

import java.util.Optional;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {

        public ModModelProvider(FabricDataOutput output) {
                super(output);
        }

        @Override
        public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
                // blockStateModelGenerator.registerSimpleCubeAll();
        }

        @Override
        public void generateItemModels(ItemModelGenerator itemModelGenerator) {
                itemModelGenerator.register(ModItems.PINK_GARNET, Models.GENERATED);
                itemModelGenerator.register(ModItems.RAW_PINK_GARNET, Models.GENERATED);
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_HELMET));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_CHESTPLATE));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_LEGGINGS));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.PINK_GARNET_BOOTS));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNA_HELMET));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNA_CHESTPLATE));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNA_LEGGINGS));
                itemModelGenerator.registerArmor(((ArmorItem) ModItems.CINNA_BOOTS));
                itemModelGenerator.register(ModItems.TANDEMAUS_SPAWN_EGG,
                                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
                itemModelGenerator.register(ModItems.MAUSHOLD_THREE_SPAWN_EGG,
                                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
                itemModelGenerator.register(ModItems.MAUSHOLD_FOUR_SPAWN_EGG,
                                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
                itemModelGenerator.register(ModItems.SYLVEON_SPAWN_EGG,
                                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
                itemModelGenerator.register(ModItems.HACHIWARE_SPAWN_EGG,
                                new Model(Optional.of(Identifier.of("item/template_spawn_egg")), Optional.empty()));
        }
}
