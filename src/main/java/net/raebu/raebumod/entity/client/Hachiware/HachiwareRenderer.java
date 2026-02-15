package net.raebu.raebumod.entity.client.Hachiware;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.raebu.raebumod.entity.custom.HachiwareEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class HachiwareRenderer extends GeoEntityRenderer<HachiwareEntity> {
    public HachiwareRenderer(EntityRendererFactory.Context context) {
        super(context, new HachiwareModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public void render(HachiwareEntity entity, float entityYaw, float partialTick, MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumerProvider, int packedLight) {
        if (entity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(entity, entityYaw, partialTick, matrixStack, vertexConsumerProvider, packedLight);
    }
}
