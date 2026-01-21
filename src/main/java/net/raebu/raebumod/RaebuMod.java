package net.raebu.raebumod;

import net.fabricmc.api.ModInitializer;

import net.raebu.raebumod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Very important comment
public class RaebuMod implements ModInitializer {
	public static final String MOD_ID = "raebumod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}