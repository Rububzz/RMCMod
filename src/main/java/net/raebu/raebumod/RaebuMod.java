package net.raebu.raebumod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.raebu.raebumod.entity.ModEntities;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;
import net.raebu.raebumod.entity.custom.MausholdThreeEntity;
import net.raebu.raebumod.entity.custom.SylveonEntity;
import net.raebu.raebumod.entity.custom.TandemausEntity;
import net.raebu.raebumod.item.ModItemgroups;
import net.raebu.raebumod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class RaebuMod implements ModInitializer {
	public static final String MOD_ID = "raebumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemgroups.registerItemGroups();
		ModItems.registerModItems();
		ModEntities.registerModEntities();
		FabricDefaultAttributeRegistry.register(ModEntities.TANDEMAUS, TandemausEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.MAUSHOLD_3, MausholdThreeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.MAUSHOLD_4, MausholdFourEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SYLVEON, SylveonEntity.createAttributes());
	}

}