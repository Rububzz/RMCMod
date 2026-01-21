package net.raebu.raebumod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.raebu.raebumod.entity.ModEntities;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Model;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Renderer;
import net.raebu.raebumod.entity.client.Tandemaus.TandemausModel;
import net.raebu.raebumod.entity.client.Tandemaus.TandemausRenderer;

public class RaebuModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(TandemausModel.TANDEMAUS, TandemausModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.TANDEMAUS, TandemausRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(Maushold3Model.MAUSHOLD3, Maushold3Model::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.MAUSHOLD_3, Maushold3Renderer::new);
    }
}
