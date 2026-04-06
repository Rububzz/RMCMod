package net.raebu.raebumod.entity.client.Hachiware;

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
public class HachiwareArmorRenderer implements ArmorRenderer {

    private static final Identifier TEXTURE = Identifier.of(RaebuMod.MOD_ID,
            "textures/models/armor/hachiware_armor.png");

    private final ModelPart cHelmet;
    private final ModelPart cBody;
    private final ModelPart leftArm;
    private final ModelPart rightArm;
    private final ModelPart leftLeg;
    private final ModelPart rightLeg;
    private final ModelPart leftBoot;
    private final ModelPart rightBoot;

    private HachiwareArmorRenderer() {
        ModelPart bodyRoot = HachiwareBodyModel.create().createModel();
        cHelmet = bodyRoot.getChild("CHelmet");
        cBody = bodyRoot.getChild("CBody");
        leftArm = bodyRoot.getChild("LeftA");
        rightArm = bodyRoot.getChild("RightA");

        ModelPart legsRoot = HachiwareLegsModel.create().createModel();
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

        if (stack.isOf(ModItems.HACHIWARE_HELMET)) {
            matrices.push();
            contextModel.head.rotate(matrices);
            cHelmet.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
            matrices.pop();
        } else if (stack.isOf(ModItems.HACHIWARE_CHESTPLATE)) {
            matrices.push();
            contextModel.body.rotate(matrices);
            cBody.render(matrices, consumer, light, OverlayTexture.DEFAULT_UV);
            matrices.pop();
            renderAttachedPart(matrices, consumer, light, contextModel.leftArm, leftArm);
            renderAttachedPart(matrices, consumer, light, contextModel.rightArm, rightArm);
        } else if (stack.isOf(ModItems.HACHIWARE_LEGGINGS)) {
            renderAttachedPart(matrices, consumer, light, contextModel.leftLeg, leftLeg);
            renderAttachedPart(matrices, consumer, light, contextModel.rightLeg, rightLeg);
        } else if (stack.isOf(ModItems.HACHIWARE_BOOTS)) {
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
        HachiwareArmorRenderer renderer = new HachiwareArmorRenderer();
        ArmorRenderer.register(renderer,
                ModItems.HACHIWARE_HELMET,
                ModItems.HACHIWARE_CHESTPLATE,
                ModItems.HACHIWARE_LEGGINGS,
                ModItems.HACHIWARE_BOOTS);
    }
}
