package net.raebu.raebumod.entity.client.Maushold3;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.raebu.raebumod.entity.custom.MausholdThreeEntity;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.client.Maushold3.Maushold3Animations;

public class Maushold3Model<T extends MausholdThreeEntity> extends SinglePartEntityModel<T> {
        public static EntityModelLayer MAUSHOLD3 = new EntityModelLayer(Identifier.of(RaebuMod.MOD_ID, "maushold3"),
                        "main");
        private final ModelPart Maushold3;
        private final ModelPart Controller;
        private final ModelPart Body;
        private final ModelPart Head;
        private final ModelPart Controller2;
        private final ModelPart Body4;
        private final ModelPart Head4;
        private final ModelPart Controller3;
        private final ModelPart Body2;
        private final ModelPart Head2;

        public Maushold3Model(ModelPart root) {
                this.Maushold3 = root.getChild("Maushold");
                this.Controller = this.Maushold3.getChild("Controller");
                this.Body = this.Controller.getChild("Body");
                this.Head = this.Body.getChild("Head");
                this.Controller2 = this.Maushold3.getChild("Controller2");
                this.Body4 = this.Controller2.getChild("Body4");
                this.Head4 = this.Body4.getChild("Head4");
                this.Controller3 = this.Maushold3.getChild("Controller3");
                this.Body2 = this.Controller3.getChild("Body2");
                this.Head2 = this.Body2.getChild("Head2");
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
                return TexturedModelData.of(modelData, 64, 64);
        }

        @Override
        public void setAngles(MausholdThreeEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
                        float netHeadYaw, float headPitch) {
                this.getPart().traverse().forEach(ModelPart::resetTransform);
                this.setHeadAngles(netHeadYaw, headPitch);

                this.animateMovement(Maushold3Animations.ANIM_MAUSHOLD3_RUN, limbSwing, limbSwingAmount, 2f, 2.5f);
                this.updateAnimation(entity.idleAnimationState, Maushold3Animations.ANIM_MAUSHOLD3_IDLE, ageInTicks,
                                1f);
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
        }

        @Override
        public ModelPart getPart() {
                return this.Maushold3;
        }

        @Override
        public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int colours) {
                Maushold3.render(matrices, vertexConsumer, light, overlay, colours);
        }
}
