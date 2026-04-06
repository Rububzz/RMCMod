package net.raebu.raebumod.entity.client.cinna;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;

/**
 * Geometry for Cinna helmet, chestplate, and arm pieces.
 * UV coordinates are normalised to a 64x64 texture space.
 * Ported from MCreator ModelCustomModel (Mojang mappings -> Yarn 1.21).
 */
public class CinnaBodyModel {

    public static TexturedModelData create() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("CHelmet",
                ModelPartBuilder.create()
                        .uv(0, 10).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 5.0F, 8.0F, Dilation.NONE)
                        .uv(18, 10).cuboid(-5.0F, -9.0F, -4.0F, 1.0F, 5.0F, 8.0F, Dilation.NONE)
                        .uv(46, 55).cuboid(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, Dilation.NONE)
                        .uv(0, 0).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 9.0F, Dilation.NONE)
                        .uv(36, 15).cuboid(-11.0F, -12.0F, -1.0F, 7.0F, 3.0F, 2.0F, Dilation.NONE)
                        .uv(36, 20).cuboid(4.0F, -12.0F, -1.0F, 7.0F, 3.0F, 2.0F, Dilation.NONE),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        root.addChild("CBody",
                ModelPartBuilder.create()
                        .uv(0, 23).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, Dilation.NONE)
                        .uv(46, 51).cuboid(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, Dilation.NONE)
                        .uv(12, 43).cuboid(-2.0F, 8.0F, 3.0F, 4.0F, 4.0F, 1.0F, Dilation.NONE)
                        .uv(22, 43).cuboid(-1.0F, 9.0F, 4.0F, 3.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(30, 44).cuboid(0.0F, 10.0F, 5.0F, 2.0F, 2.0F, 1.0F, Dilation.NONE),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        root.addChild("LeftA",
                ModelPartBuilder.create()
                        .uv(34, 0).cuboid(-1.0F, -3.0F, -3.0F, 5.0F, 1.0F, 6.0F, Dilation.NONE)
                        .uv(32, 36).cuboid(-1.0F, -2.0F, -3.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(36, 32).cuboid(-1.0F, -2.0F, 2.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(22, 36).cuboid(3.0F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, Dilation.NONE),
                ModelTransform.pivot(5.0F, 2.0F, 0.0F));

        root.addChild("RightA",
                ModelPartBuilder.create()
                        .uv(0, 36).cuboid(-4.0F, -3.0F, -3.0F, 5.0F, 1.0F, 6.0F, Dilation.NONE)
                        .uv(19, 59).cuboid(-4.0F, -2.0F, -3.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(0, 43).cuboid(-4.0F, -2.0F, 2.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(36, 25).cuboid(-4.0F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, Dilation.NONE),
                ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

        return TexturedModelData.of(modelData, 64, 64);
    }
}
