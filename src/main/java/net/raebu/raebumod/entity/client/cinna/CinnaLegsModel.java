package net.raebu.raebumod.entity.client.cinna;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;

/**
 * Geometry for Cinna leggings and boot pieces.
 * UV coordinates are normalised to a 128x128 texture space.
 * Ported from MCreator ModelCinnaArmorl (Mojang mappings -> Yarn 1.21).
 */
public class CinnaLegsModel {

    public static TexturedModelData create() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("LeftLeg2",
                ModelPartBuilder.create()
                        .uv(56, 31).cuboid(-2.0F, 0.0F, -3.0F, 4.0F, 8.0F, 1.0F, Dilation.NONE)
                        .uv(36, 61).cuboid(-2.0F, 0.0F, 2.0F, 4.0F, 8.0F, 1.0F, Dilation.NONE)
                        .uv(22, 55).cuboid(2.0F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, Dilation.NONE),
                ModelTransform.pivot(1.9F, 12.0F, 0.0F));

        root.addChild("RightLeg2",
                ModelPartBuilder.create()
                        .uv(54, 55).cuboid(-3.2F, 0.0F, -3.0F, 1.0F, 8.0F, 6.0F, Dilation.NONE)
                        .uv(0, 62).cuboid(-2.2F, 0.0F, -3.0F, 4.0F, 8.0F, 1.0F, Dilation.NONE)
                        .uv(10, 62).cuboid(-2.2F, 0.0F, 2.0F, 4.0F, 8.0F, 1.0F, Dilation.NONE),
                ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

        root.addChild("LeftBoot",
                ModelPartBuilder.create()
                        .uv(56, 40).cuboid(2.0F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, Dilation.NONE)
                        .uv(20, 69).cuboid(-2.0F, 8.0F, -3.0F, 4.0F, 4.0F, 1.0F, Dilation.NONE)
                        .uv(46, 69).cuboid(-2.0F, 8.0F, 2.0F, 4.0F, 4.0F, 1.0F, Dilation.NONE),
                ModelTransform.pivot(1.8F, 12.0F, 0.0F));

        root.addChild("RightBoot",
                ModelPartBuilder.create()
                        .uv(66, 0).cuboid(-3.3F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, Dilation.NONE)
                        .uv(56, 69).cuboid(-2.3F, 8.0F, -3.0F, 4.0F, 4.0F, 1.0F, Dilation.NONE)
                        .uv(30, 70).cuboid(-2.3F, 8.0F, 2.0F, 4.0F, 4.0F, 1.0F, Dilation.NONE),
                ModelTransform.pivot(-1.9F, 12.0F, 0.0F));

        return TexturedModelData.of(modelData, 128, 128);
    }
}
