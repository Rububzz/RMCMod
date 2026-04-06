package net.raebu.raebumod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.raebu.raebumod.entity.ModEntities;
import net.raebu.raebumod.entity.custom.HachiwareEntity;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;
import net.raebu.raebumod.entity.custom.MausholdThreeEntity;
import net.raebu.raebumod.entity.custom.SylveonEntity;
import net.raebu.raebumod.entity.custom.TandemausEntity;
import net.raebu.raebumod.item.ModItemgroups;
import net.raebu.raebumod.item.ModItems;

// Very important comment
public class RaebuMod implements ModInitializer {
	public static final String MOD_ID = "raebumod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final Collection<QueuedWork> WORK_QUEUE = new ConcurrentLinkedQueue<>();

	@Override
	public void onInitialize() {
		ModItemgroups.registerItemGroups();
		ModItems.registerModItems();
		ModEntities.registerModEntities();
		registerServerTickWorkQueue();
		FabricDefaultAttributeRegistry.register(ModEntities.TANDEMAUS, TandemausEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.MAUSHOLD_3, MausholdThreeEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.MAUSHOLD_4, MausholdFourEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SYLVEON, SylveonEntity.createAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.HACHIWARE, HachiwareEntity.createAttributes());
	}

	public static void queueServerWork(int ticks, Runnable action) {
		WORK_QUEUE.add(new QueuedWork(action, ticks));
	}

	@Nullable
	public static PlayerEntity clientPlayer() {
		if (FabricLoader.getInstance().getEnvironmentType() != EnvType.CLIENT) {
			return null;
		}

		MinecraftClient client = MinecraftClient.getInstance();
		return client == null ? null : client.player;
	}

	private void registerServerTickWorkQueue() {
		ServerTickEvents.END_SERVER_TICK.register(server -> {
			List<QueuedWork> readyWork = new ArrayList<>();
			WORK_QUEUE.forEach(work -> {
				work.ticksRemaining--;
				if (work.ticksRemaining <= 0) {
					readyWork.add(work);
				}
			});
			readyWork.forEach(work -> work.action.run());
			WORK_QUEUE.removeAll(readyWork);
		});
	}

	private static final class QueuedWork {
		private final Runnable action;
		private int ticksRemaining;

		private QueuedWork(Runnable action, int ticksRemaining) {
			this.action = action;
			this.ticksRemaining = ticksRemaining;
		}
	}

}