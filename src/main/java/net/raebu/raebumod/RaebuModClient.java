package net.raebu.raebumod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.raebu.raebumod.entity.ModEntities;
import net.raebu.raebumod.entity.client.Hachiware.HachiwareRenderer;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Model;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Renderer;
import net.raebu.raebumod.entity.client.Maushold4.Maushold4Model;
import net.raebu.raebumod.entity.client.Maushold4.Maushold4Renderer;
import net.raebu.raebumod.entity.client.Sylveon.SylveonModel;
import net.raebu.raebumod.entity.client.Sylveon.SylveonRenderer;
import net.raebu.raebumod.entity.client.Tandemaus.TandemausModel;
import net.raebu.raebumod.entity.client.Tandemaus.TandemausRenderer;
import net.raebu.raebumod.entity.client.cinna.CinnaArmorRenderer;

public class RaebuModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CinnaArmorRenderer.register();
        EntityModelLayerRegistry.registerModelLayer(TandemausModel.TANDEMAUS, TandemausModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.TANDEMAUS, TandemausRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(Maushold3Model.MAUSHOLD3, Maushold3Model::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MAUSHOLD_3, Maushold3Renderer::new);
        EntityModelLayerRegistry.registerModelLayer(Maushold4Model.MAUSHOLD4, Maushold4Model::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MAUSHOLD_4, Maushold4Renderer::new);
        EntityModelLayerRegistry.registerModelLayer(SylveonModel.SYLVEON, SylveonModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SYLVEON, SylveonRenderer::new);

        EntityRendererRegistry.register(ModEntities.HACHIWARE, HachiwareRenderer::new);

    }
}
