package net.raebu.raebumod.entity.client.Maushold4;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Animations;
import net.raebu.raebumod.entity.client.Tandemaus.TandemausAnimations;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;
import net.raebu.raebumod.entity.custom.MausholdThreeEntity;

public class Maushold4Model<T extends MausholdFourEntity> extends SinglePartEntityModel<T> {
        public static EntityModelLayer MAUSHOLD4 = new EntityModelLayer(Identifier.of(RaebuMod.MOD_ID, "maushold4"),
                        "main");
        private final ModelPart Maushold4;
        private final ModelPart Controller;
        private final ModelPart Body;
        private final ModelPart Head;
        private final ModelPart Controller2;
        private final ModelPart Body4;
        private final ModelPart Head4;
        private final ModelPart Controller3;
        private final ModelPart Body2;
        private final ModelPart Head2;
        private final ModelPart Controller4;
        private final ModelPart Body3;
        private final ModelPart Head3;

        public Maushold4Model(ModelPart root) {
                this.Maushold4 = root.getChild("Maushold");
                this.Controller = this.Maushold4.getChild("Controller");
                this.Body = this.Controller.getChild("Body");
                this.Head = this.Body.getChild("Head");
                this.Controller2 = this.Maushold4.getChild("Controller2");
                this.Body4 = this.Controller2.getChild("Body4");
                this.Head4 = this.Body4.getChild("Head4");
                this.Controller3 = this.Maushold4.getChild("Controller3");
                this.Body2 = this.Controller3.getChild("Body2");
                this.Head2 = this.Body2.getChild("Head2");
                this.Controller4 = this.Maushold4.getChild("Controller4");
                this.Body3 = this.Controller4.getChild("Body3");
                this.Head3 = this.Body3.getChild("Head3");
        }
        public static TexturedModelData getTexturedModelData() {
                ModelData modelData = new ModelData();
                ModelPartData modelPartData = modelData.getRoot();
                ModelPartData Maushold = modelPartData.addChild("Maushold", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

                ModelPartData Controller = Maushold.addChild("Controller", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData Body = Controller.addChild("Body", ModelPartBuilder.create().uv(1, 18).cuboid(-2.0F, -1.0F, -2.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -2.0F, 2.0F));

                ModelPartData Head = Body.addChild("Head", ModelPartBuilder.create().uv(4, 2).cuboid(-3.0F, -6.0F, -3.0F, 7.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData Right_Ear = Head.addChild("Right_Ear", ModelPartBuilder.create().uv(1, 26).cuboid(3.0F, 6.0F, 0.0F, 5.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -13.0F, -2.0F));

                ModelPartData Left_Ear = Head.addChild("Left_Ear", ModelPartBuilder.create().uv(24, 18).cuboid(11.0F, 6.0F, 0.0F, 5.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-9.0F, -13.0F, -2.0F));

                ModelPartData Left_Arm = Body.addChild("Left_Arm", ModelPartBuilder.create().uv(14, 28).cuboid(0.0F, -0.0019F, -3.0872F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -1.0F, 1.0F));

                ModelPartData Right_Arm = Body.addChild("Right_Arm", ModelPartBuilder.create().uv(24, 28).cuboid(-1.0474F, -0.0019F, -1.0872F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -1.0F, -1.0F));

                ModelPartData left_leg = Controller.addChild("left_leg", ModelPartBuilder.create().uv(24, 33).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -1.0F, 2.0F));

                ModelPartData right_leg = Controller.addChild("right_leg", ModelPartBuilder.create().uv(32, 33).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -1.0F, 2.0F));

                ModelPartData Controller2 = Maushold.addChild("Controller2", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData left_leg4 = Controller2.addChild("left_leg4", ModelPartBuilder.create().uv(34, 26).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(5.0F, -1.0F, 2.0F));

                ModelPartData right_leg4 = Controller2.addChild("right_leg4", ModelPartBuilder.create().uv(34, 29).cuboid(-1.0F, 0.0F, -1.0F, 3.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, -1.0F, 2.0F));

                ModelPartData Body4 = Controller2.addChild("Body4", ModelPartBuilder.create().uv(30, 0).cuboid(-2.0F, 0.0F, 0.0F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, -3.0F, 0.0F));

                ModelPartData right_arm4 = Body4.addChild("right_arm4", ModelPartBuilder.create().uv(32, 21).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, 0.0F, 1.0F));

                ModelPartData left_arm4 = Body4.addChild("left_arm4", ModelPartBuilder.create().uv(14, 33).cuboid(1.0F, 0.0F, -3.0F, 2.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 0.0F, 3.0F));

                ModelPartData Head4 = Body4.addChild("Head4", ModelPartBuilder.create().uv(4, 2).cuboid(2.0F, -8.0F, 0.0F, 7.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, 3.0F, -1.0F));

                ModelPartData LeftEar = Head4.addChild("LeftEar", ModelPartBuilder.create().uv(2, 26).cuboid(-1.0F, -9.0F, 1.0F, 5.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData RightEar = Head4.addChild("RightEar", ModelPartBuilder.create().uv(24, 18).cuboid(7.0F, -9.0F, 1.0F, 5.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData Controller3 = Maushold.addChild("Controller3", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 2.0F));

                ModelPartData Body2 = Controller3.addChild("Body2", ModelPartBuilder.create().uv(1, 1).cuboid(14.0F, -3.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

                ModelPartData left_arm2 = Body2.addChild("left_arm2", ModelPartBuilder.create().uv(1, 1).cuboid(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, -3.0F, 2.0F));

                ModelPartData right_arm2 = Body2.addChild("right_arm2", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.0436F));

                ModelPartData Head2 = Body2.addChild("Head2", ModelPartBuilder.create().uv(-2, -1).cuboid(13.0F, -6.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData right_ear2 = Head2.addChild("right_ear2", ModelPartBuilder.create().uv(57, 8).cuboid(14.0F, -7.0F, -1.0F, -2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData left_ear2 = Head2.addChild("left_ear2", ModelPartBuilder.create().uv(58, 20).cuboid(18.0F, -7.0F, -1.0F, -2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData left_leg2 = Controller3.addChild("left_leg2", ModelPartBuilder.create().uv(2, 41).cuboid(3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, -1.0F, 0.0F));

                ModelPartData right_leg2 = Controller3.addChild("right_leg2", ModelPartBuilder.create().uv(2, 41).cuboid(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -1.0F, 1.0F));

                ModelPartData Controller4 = Maushold.addChild("Controller4", ModelPartBuilder.create(), ModelTransform.pivot(-28.0F, 0.0F, 2.0F));

                ModelPartData Body3 = Controller4.addChild("Body3", ModelPartBuilder.create().uv(1, 1).cuboid(14.0F, -3.0F, 0.0F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 1.0F, 0.0F));

                ModelPartData left_arm3 = Body3.addChild("left_arm3", ModelPartBuilder.create().uv(1, 1).cuboid(1.0F, 0.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(15.0F, -3.0F, 2.0F));

                ModelPartData right_arm3 = Body3.addChild("right_arm3", ModelPartBuilder.create().uv(1, 1).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(14.0F, -2.0F, 2.0F, 0.0F, 0.0F, -0.0436F));

                ModelPartData Head3 = Body3.addChild("Head3", ModelPartBuilder.create().uv(-2, -1).cuboid(13.0F, -6.0F, -1.0F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData right_ear3 = Head3.addChild("right_ear3", ModelPartBuilder.create().uv(57, 8).cuboid(14.0F, -7.0F, -1.0F, -2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData left_ear3 = Head3.addChild("left_ear3", ModelPartBuilder.create().uv(58, 20).cuboid(18.0F, -7.0F, -1.0F, -2.0F, 2.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

                ModelPartData left_leg3 = Controller4.addChild("left_leg3", ModelPartBuilder.create().uv(2, 41).cuboid(3.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(12.0F, -1.0F, 0.0F));

                ModelPartData right_leg3 = Controller4.addChild("right_leg3", ModelPartBuilder.create().uv(2, 41).cuboid(1.0F, 0.0F, -1.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(13.0F, -1.0F, 1.0F));
                return TexturedModelData.of(modelData, 64, 64);
        }

        private void setHeadAngles(float headYaw, float headPitch) {
                headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
                headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

                this.Head.yaw = headYaw * 0.017453292F;
                this.Head.pitch = headPitch * 0.017453292F;

                this.Head4.yaw = headYaw * 0.017453292F;
                this.Head4.pitch = headPitch * 0.017453292F;

                this.Head2.yaw = headYaw * 0.017453292F;
                this.Head2.pitch = headPitch * 0.017453292F;

                this.Head3.yaw = headYaw * 0.017453292F;
                this.Head3.pitch = headPitch * 0.017453292F;
        }

        @Override
        public ModelPart getPart() {
                return this.Maushold4;
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int colours) {
                Maushold4.render(matrices, vertexConsumer, light, overlay, colours);
        }

        @Override
        public void setAngles(MausholdFourEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
                              float netHeadYaw, float headPitch) {
                this.getPart().traverse().forEach(ModelPart::resetTransform);
                this.setHeadAngles(netHeadYaw, headPitch);

                this.animateMovement(Maushold4Animations.ANIM_MAUSHOLD4_RUN, limbSwing, limbSwingAmount, 2f, 2.5f);
                this.updateAnimation(entity.idleAnimationState, Maushold4Animations.ANIM_MAUSHOLD4_IDLE, ageInTicks,
                        1f);
        }
}
