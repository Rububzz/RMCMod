package net.raebu.raebumod.entity.client.Tandemaus;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.custom.TandemausEntity;

public class TandemausRenderer extends MobEntityRenderer<TandemausEntity, TandemausModel<TandemausEntity>> {

    public TandemausRenderer(EntityRendererFactory.Context context) {
        super(context, new TandemausModel<>(context.getPart(TandemausModel.TANDEMAUS)), 0.75f);
    }

    @Override
    public Identifier getTexture(TandemausEntity entity) {
        return Identifier.of(RaebuMod.MOD_ID, "textures/entity/tandemaus/tandemaus.png");
    }

    @Override
    public void render(TandemausEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
