package net.raebu.raebumod.entity.client.Maushold4;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;

public class Maushold4Renderer extends MobEntityRenderer<MausholdFourEntity, Maushold4Model<MausholdFourEntity>> {

    public Maushold4Renderer(EntityRendererFactory.Context context) {
        super(context, new Maushold4Model<>(context.getPart(Maushold4Model.MAUSHOLD4)), 0.75f);
    }

    @Override
    public Identifier getTexture(MausholdFourEntity entity) {
        return Identifier.of(RaebuMod.MOD_ID, "textures/entity/maushold/maushold.png");
    }

    @Override
    public void render(MausholdFourEntity livingEntity, float f, float g, MatrixStack matrixStack,
            VertexConsumerProvider vertexConsumerProvider, int i) {
        if (livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
