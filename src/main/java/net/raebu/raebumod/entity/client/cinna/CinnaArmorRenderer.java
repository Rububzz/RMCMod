package net.raebu.raebumod.entity.client.cinna;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.ArmorRenderer;
import net.minecraft.client.model.ModelPart;
import net.minecraft.client.render.OverlayTexture;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.render.item.ItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.item.ModItems;

@Environment(EnvType.CLIENT)
public class CinnaArmorRenderer implements ArmorRenderer {

    private static final Identifier TEXTURE = Identifier.of(RaebuMod.MOD_ID, "textures/models/armor/cinna_armor.png");

    // Helmet / chestplate / arm parts (baked from 64×64 UV model)
    private final ModelPart cHelmet;
    private final ModelPart cBody;
    private final ModelPart leftArm;
    private final ModelPart rightArm;

    // Leggings / boot parts (baked from 128×128 UV model)
    private final ModelPart leftLeg;
    private final ModelPart rightLeg;
    private final ModelPart leftBoot;
    private final ModelPart rightBoot;

    private CinnaArmorRenderer() {
        ModelPart bodyRoot = CinnaBodyModel.create().createModel();
        cHelmet = bodyRoot.getChild("CHelmet");
        cBody = bodyRoot.getChild("CBody");
        leftArm = bodyRoot.getChild("LeftA");
        rightArm = bodyRoot.getChild("RightA");

        ModelPart legsRoot = CinnaLegsModel.create().createModel();
        leftLeg = legsRoot.getChild("LeftLeg2");
        rightLeg = legsRoot.getChild("RightLeg2");
        leftBoot = legsRoot.getChild("LeftBoot");
        rightBoot = legsRoot.getChild("RightBoot");
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers,
            ItemStack stack, LivingEntity entity, EquipmentSlot slot,
            int light, BipedEntityModel<LivingEntity> contextModel) {

        VertexConsumer consumer = ItemRenderer.getArmorGlintConsumer(
                vertexConsumers, RenderLayer.getArmorCutoutNoCull(TEXTURE), stack.hasGlint());

        if (stack.isOf(ModItems.CINNA_HELMET)) {
            // Apply head bone rotation so the helmet props track the player's head movement
            matrices.push();
            contextModel.head.rotate(matrices);
            cHelmet.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
            matrices.pop();

        } else if (stack.isOf(ModItems.CINNA_CHESTPLATE)) {
            // Body (tilt applies e.g. when crouching)
            matrices.push();
            contextModel.body.rotate(matrices);
            cBody.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
            matrices.pop();
            renderAttachedPart(matrices, consumer, light, contextModel.leftArm, leftArm);
            renderAttachedPart(matrices, consumer, light, contextModel.rightArm, rightArm);

        } else if (stack.isOf(ModItems.CINNA_LEGGINGS)) {
            renderAttachedPart(matrices, consumer, light, contextModel.leftLeg, leftLeg);
            renderAttachedPart(matrices, consumer, light, contextModel.rightLeg, rightLeg);

        } else if (stack.isOf(ModItems.CINNA_BOOTS)) {
            renderAttachedPart(matrices, consumer, light, contextModel.leftLeg, leftBoot);
            renderAttachedPart(matrices, consumer, light, contextModel.rightLeg, rightBoot);
        }
    }

    private static void renderAttachedPart(MatrixStack matrices, VertexConsumer consumer, int light,
            ModelPart anchor, ModelPart customPart) {
        customPart.copyTransform(anchor);
        matrices.push();
        customPart.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
        matrices.pop();
    }

    public static void register() {
        CinnaArmorRenderer renderer = new CinnaArmorRenderer();
        ArmorRenderer.register(renderer,
                ModItems.CINNA_HELMET,
                ModItems.CINNA_CHESTPLATE,
                ModItems.CINNA_LEGGINGS,
                ModItems.CINNA_BOOTS);
    }
}
