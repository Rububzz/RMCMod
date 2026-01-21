package net.raebu.raebumod.entity.client.Tandemaus;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.custom.TandemausEntity;

public class TandemausModel<T extends TandemausEntity> extends SinglePartEntityModel<T> {
   public static final EntityModelLayer TANDEMAUS = new EntityModelLayer(Identifier.of(RaebuMod.MOD_ID, "tandemaus"), "main");
   private final ModelPart Tandemaus;
   private final ModelPart Controller;
   private final ModelPart Controller2;
   private final ModelPart Body;
   private final ModelPart Body4;
   private final ModelPart Head;
   private final ModelPart Head4;

   public TandemausModel(ModelPart root) {
      this.Tandemaus = root.getChild("Tandemaus");
      this.Controller = this.Tandemaus.getChild("Controller");
      this.Controller2 = this.Tandemaus.getChild("Controller2");
      this.Body = this.Controller.getChild("Body");
      this.Body4 = this.Controller2.getChild("Body4");
      this.Head = this.Body.getChild("Head");
      this.Head4 = this.Body4.getChild("Head4");
   }

   public static TexturedModelData getTexturedModelData() {
      ModelData modelData = new ModelData();
      ModelPartData modelPartData = modelData.getRoot();
      ModelPartData Tandemaus = modelPartData.addChild("Tandemaus", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

      ModelPartData Controller = Tandemaus.addChild("Controller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

      ModelPartData Body = Controller.addChild("Body", ModelPartBuilder.create().uv(1, 18).cuboid(-2.0F, -1.0F, -2.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -2.0F, 2.0F));

      ModelPartData Head = Body.addChild("Head", ModelPartBuilder.create().uv(4, 2).cuboid(-3.0F, -6.0F, -3.0F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

      ModelPartData Right_Ear = Head.addChild("Right_Ear", ModelPartBuilder.create().uv(1, 26).cuboid(3.0F, 6.0F, 0.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -13.0F, -2.0F));

      ModelPartData Left_Ear = Head.addChild("Left_Ear", ModelPartBuilder.create().uv(24, 19).cuboid(11.0F, 6.0F, 0.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -13.0F, -2.0F));

      ModelPartData Left_Arm = Body.addChild("Left_Arm", ModelPartBuilder.create().uv(22, 28).cuboid(0.0F, -0.0019F, -3.0872F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, 1.0F));

      ModelPartData Right_Arm = Body.addChild("Right_Arm", ModelPartBuilder.create().uv(0, 36).cuboid(-1.0474F, -0.0019F, -1.0872F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, -1.0F));

      ModelPartData left_leg = Controller.addChild("left_leg", ModelPartBuilder.create().uv(17, 38).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, 2.0F));

      ModelPartData right_leg = Controller.addChild("right_leg", ModelPartBuilder.create().uv(33, 38).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -1.0F, 2.0F));

      ModelPartData Controller2 = Tandemaus.addChild("Controller2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

      ModelPartData left_leg4 = Controller2.addChild("left_leg4", ModelPartBuilder.create().uv(55, 9).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -1.0F, 2.0F));

      ModelPartData right_leg4 = Controller2.addChild("right_leg4", ModelPartBuilder.create().uv(48, 1).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -1.0F, 2.0F));

      ModelPartData Body4 = Controller2.addChild("Body4", ModelPartBuilder.create().uv(30, 0).cuboid(-2.0F, 0.0F, 0.0F, 4.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -3.0F, 0.0F));

      ModelPartData right_arm4 = Body4.addChild("right_arm4", ModelPartBuilder.create().uv(54, 40).cuboid(-1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 1.0F));

      ModelPartData left_arm4 = Body4.addChild("left_arm4", ModelPartBuilder.create().uv(53, 27).cuboid(1.0F, 0.0F, -3.0F, 1.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 3.0F));

      ModelPartData Head4 = Body4.addChild("Head4", ModelPartBuilder.create().uv(40, 53).cuboid(2.0F, -8.0F, 0.0F, 6.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 3.0F, -1.0F));

      ModelPartData LeftEar = Head4.addChild("LeftEar", ModelPartBuilder.create().uv(0, 57).cuboid(-1.0F, -9.0F, 1.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

      ModelPartData RightEar = Head4.addChild("RightEar", ModelPartBuilder.create().uv(22, 56).cuboid(7.0F, -9.0F, 1.0F, 4.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));
      return TexturedModelData.of(modelData, 64, 64);
   }
   @Override
   public void setAngles(TandemausEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
      this.getPart().traverse().forEach(ModelPart::resetTransform);
      this.setHeadAngles(netHeadYaw, headPitch);

      this.animateMovement(TandemausAnimations.ANIM_TANDEMAUS_RUN, limbSwing, limbSwingAmount, 2f, 2.5f);
      this.updateAnimation(entity.idleAnimationState, TandemausAnimations.ANIM_TANDEMAUS_IDLE, ageInTicks, 1f);
   }

   private void setHeadAngles(float headYaw, float headPitch) {
      headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
      headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

      this.Head.yaw = headYaw * 0.017453292F;
      this.Head.pitch = headPitch * 0.017453292F;

      this.Head4.yaw = headYaw * 0.017453292F;
      this.Head4.pitch = headPitch * 0.017453292F;
   }

   @Override
   public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
      Tandemaus.render(matrices, vertexConsumer, light, overlay, color);
   }

   @Override
   public ModelPart getPart() {
      return Tandemaus;
   }
}
