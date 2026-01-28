package net.raebu.raebumod.entity.client.Sylveon;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.client.Maushold4.Maushold4Animations;
import net.raebu.raebumod.entity.custom.MausholdFourEntity;
import net.raebu.raebumod.entity.custom.SylveonEntity;

public class SylveonModel<T extends SylveonEntity> extends SinglePartEntityModel<T> {
    public static EntityModelLayer SYLVEON = new EntityModelLayer(Identifier.of(RaebuMod.MOD_ID, "sylveon"),
            "main");
    private final ModelPart Sylveon;
    private final ModelPart Body;
    private final ModelPart Head;

    public SylveonModel(ModelPart root) {
        this.Sylveon = root.getChild("Sylveon");
        this.Body = this.Sylveon.getChild("body");
        this.Head = this.Body.getChild("head");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData Sylveon = modelPartData.addChild("Sylveon", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData body = Sylveon.addChild("body", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -4.0F, -2.0F, 10.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.0F, -5.0F, -1.0F));

        ModelPartData head = body.addChild("head", ModelPartBuilder.create().uv(0, 10).cuboid(2.0F, -15.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 5.0F, 1.0F));

        ModelPartData leftear = head.addChild("leftear", ModelPartBuilder.create().uv(28, 26).cuboid(5.0F, -20.0F, 1.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData headbow = head.addChild("headbow", ModelPartBuilder.create().uv(0, 22).cuboid(6.0F, -18.0F, 0.0F, 1.0F, 3.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rightear = head.addChild("rightear", ModelPartBuilder.create().uv(0, 30).cuboid(5.0F, -20.0F, -3.0F, 1.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftheadribbons = head.addChild("leftheadribbons", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftheadribbon2 = leftheadribbons.addChild("leftheadribbon2", ModelPartBuilder.create().uv(22, 30).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -16.0F, 3.0F, 0.0F, -0.2618F, 0.0F));

        ModelPartData leftheadribbon3 = leftheadribbons.addChild("leftheadribbon3", ModelPartBuilder.create(), ModelTransform.of(5.0F, -16.0F, 5.0F, 0.0F, -0.48F, 0.0F));

        ModelPartData cube_r1 = leftheadribbon3.addChild("cube_r1", ModelPartBuilder.create().uv(32, 16).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData leftheadribbon4 = leftheadribbons.addChild("leftheadribbon4", ModelPartBuilder.create(), ModelTransform.of(4.0F, -16.0F, 6.0F, 0.0F, -0.6981F, 0.0F));

        ModelPartData cube_r2 = leftheadribbon4.addChild("cube_r2", ModelPartBuilder.create().uv(28, 33).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 1.0F, 0.0F, -0.1745F, 0.0F));

        ModelPartData leftheadribbon5 = leftheadribbons.addChild("leftheadribbon5", ModelPartBuilder.create().uv(6, 34).cuboid(-2.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(3.0F, -16.0F, 8.0F, 0.0F, -1.1345F, 0.0F));

        ModelPartData leftheadribbon6 = leftheadribbons.addChild("leftheadribbon6", ModelPartBuilder.create().uv(12, 34).cuboid(-2.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -16.0F, 9.0F, 0.0F, -1.309F, 0.0F));

        ModelPartData rightheadribbons = head.addChild("rightheadribbons", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData rightheadribbon = rightheadribbons.addChild("rightheadribbon", ModelPartBuilder.create().uv(18, 34).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -16.0F, 0.0F, 0.0F, 1.0908F, 0.0F));

        ModelPartData rightheadribbon2 = rightheadribbons.addChild("rightheadribbon2", ModelPartBuilder.create().uv(34, 26).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -16.0F, -1.0F, 0.0F, 0.48F, 0.0F));

        ModelPartData rightheadribbon3 = rightheadribbons.addChild("rightheadribbon3", ModelPartBuilder.create().uv(34, 30).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -16.0F, -3.0F, 0.0F, -0.0436F, 0.0F));

        ModelPartData rightheadribbon4 = rightheadribbons.addChild("rightheadribbon4", ModelPartBuilder.create().uv(34, 34).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, -16.0F, -4.0F, 0.0F, -0.6109F, 0.0F));

        ModelPartData rightheadribbon5 = rightheadribbons.addChild("rightheadribbon5", ModelPartBuilder.create().uv(36, 8).cuboid(-1.0F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(6.0F, -16.0F, -5.0F, 0.0F, -1.1781F, 0.0F));

        ModelPartData rightheadribbon6 = rightheadribbons.addChild("rightheadribbon6", ModelPartBuilder.create().uv(36, 12).cuboid(-1.0F, -3.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(8.0F, -14.0F, -5.0F, 0.0F, -2.618F, 0.0F));

        ModelPartData rightheadribbon7 = rightheadribbons.addChild("rightheadribbon7", ModelPartBuilder.create().uv(36, 20).cuboid(0.0096F, -1.0F, -1.7402F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(9.0F, -16.0F, -4.0F, 0.0F, -3.0543F, 0.0F));

        ModelPartData tail = body.addChild("tail", ModelPartBuilder.create().uv(12, 22).cuboid(-6.0F, -1.0F, -1.0F, 6.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-6.0F, -2.0F, 1.0F, 0.0F, 0.0F, 0.3491F));

        ModelPartData bow = body.addChild("bow", ModelPartBuilder.create().uv(24, 10).cuboid(6.0F, -1.0F, 1.0F, 2.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-2.0F, -3.0F, -2.0F));

        ModelPartData leftribbon = bow.addChild("leftribbon", ModelPartBuilder.create().uv(0, 37).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(7.0F, 0.0F, 6.0F));

        ModelPartData leftribbon5 = bow.addChild("leftribbon5", ModelPartBuilder.create().uv(38, 16).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 11.0F, 0.0F, -0.9599F, 0.0F));

        ModelPartData leftribbon4 = bow.addChild("leftribbon4", ModelPartBuilder.create().uv(12, 38).cuboid(-1.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, 10.0F, 0.0F, 2.138F, 0.0F));

        ModelPartData leftribbon3 = bow.addChild("leftribbon3", ModelPartBuilder.create(), ModelTransform.pivot(6.0F, 0.0F, 8.0F));

        ModelPartData leftribbon_r1 = leftribbon3.addChild("leftribbon_r1", ModelPartBuilder.create().uv(6, 38).cuboid(0.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-1.0F, 1.0F, 1.0F, 0.0F, -0.829F, 0.0F));

        ModelPartData leftribbon2 = bow.addChild("leftribbon2", ModelPartBuilder.create().uv(24, 37).cuboid(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(7.0F, 0.0F, 7.0F, 0.0F, -0.2618F, 0.0F));

        ModelPartData rightribbon = bow.addChild("rightribbon", ModelPartBuilder.create().uv(18, 38).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(6.0F, 0.0F, 1.0F));

        ModelPartData rightribbon5 = bow.addChild("rightribbon5", ModelPartBuilder.create().uv(40, 4).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(4.0F, 0.0F, -4.0F, 0.0F, 0.7854F, 0.0F));

        ModelPartData rightribbon4 = bow.addChild("rightribbon4", ModelPartBuilder.create().uv(40, 0).cuboid(0.0F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(5.0F, 0.0F, -3.0F, 0.0F, 0.7418F, 0.0F));

        ModelPartData rightribbon2 = bow.addChild("rightribbon2", ModelPartBuilder.create(), ModelTransform.of(6.0F, 0.0F, 0.0F, 0.0F, 0.2618F, 0.0F));

        ModelPartData rightribbon_r1 = rightribbon2.addChild("rightribbon_r1", ModelPartBuilder.create().uv(30, 38).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.1337F, 1.0F, -0.872F, 0.0F, -0.1309F, 0.0F));

        ModelPartData rightribbon3 = bow.addChild("rightribbon3", ModelPartBuilder.create(), ModelTransform.of(6.0F, 0.0F, -1.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData rightribbon_r2 = rightribbon3.addChild("rightribbon_r2", ModelPartBuilder.create().uv(36, 38).cuboid(-1.0F, -2.0F, -1.0F, 1.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.1337F, 1.0F, -0.872F, 0.0F, -0.1309F, 0.0F));

        ModelPartData leftfrontleg = Sylveon.addChild("leftfrontleg", ModelPartBuilder.create().uv(24, 16).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -5.0F, 2.0F));

        ModelPartData leftfrontfeet = leftfrontleg.addChild("leftfrontfeet", ModelPartBuilder.create().uv(14, 30).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, 0.0F));

        ModelPartData rightfrontleg = Sylveon.addChild("rightfrontleg", ModelPartBuilder.create().uv(12, 25).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -5.0F, -2.0F));

        ModelPartData rightfrontfeet = rightfrontleg.addChild("rightfrontfeet", ModelPartBuilder.create().uv(6, 30).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.0F, 0.0F));

        ModelPartData leftbackleg = Sylveon.addChild("leftbackleg", ModelPartBuilder.create().uv(20, 25).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -5.0F, 2.0F));

        ModelPartData leftbackfeet = leftbackleg.addChild("leftbackfeet", ModelPartBuilder.create().uv(32, 4).cuboid(-3.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 5.0F, 0.0F));

        ModelPartData rightbackleg = Sylveon.addChild("rightbackleg", ModelPartBuilder.create().uv(28, 21).cuboid(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(-5.0F, -5.0F, -2.0F));

        ModelPartData rightbackfeet = rightbackleg.addChild("rightbackfeet", ModelPartBuilder.create().uv(32, 0).cuboid(-3.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(1.0F, 5.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.Head.yaw = headYaw * 0.017453292F;
        this.Head.pitch = headPitch * 0.017453292F;

    }

    @Override
    public ModelPart getPart() {
        return this.Sylveon;
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int colours) {
        Sylveon.render(matrices, vertexConsumer, light, overlay, colours);
    }

    @Override
    public void setAngles(SylveonEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
                          float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(SylveonAnimations.SYLVEON_WALK_ANIM, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, Maushold4Animations.ANIM_MAUSHOLD4_IDLE, ageInTicks,
                1f);
    }

}
