package net.raebu.raebumod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;
import net.raebu.raebumod.entity.custom.MausholdThreeEntity;
import net.raebu.raebumod.entity.custom.TandemausEntity;

public class ModEntities {
    public static final EntityType<TandemausEntity> TANDEMAUS = Registry.register(Registries.ENTITY_TYPE, Identifier.of(RaebuMod.MOD_ID, "tandemaus"), EntityType.Builder.create(TandemausEntity::new, SpawnGroup.CREATURE).dimensions(1, 2.5f).build());
    public static final EntityType<MausholdThreeEntity> MAUSHOLD_3 = Registry.register(Registries.ENTITY_TYPE, Identifier.of(RaebuMod.MOD_ID, "maushold_3"), EntityType.Builder.create(MausholdThreeEntity::new, SpawnGroup.CREATURE).dimensions(1, 2.5f).build());
    public static final EntityType<MausholdFourEntity> MAUSHOLD_4 = Registry.register(Registries.ENTITY_TYPE, Identifier.of(RaebuMod.MOD_ID, "maushold_4"), EntityType.Builder.create(MausholdFourEntity::new, SpawnGroup.CREATURE).dimensions(1, 2.5f).build());

    public static void registerModEntities() {
        RaebuMod.LOGGER.info("Register Mod Entities for" + RaebuMod.MOD_ID);
    }
}
