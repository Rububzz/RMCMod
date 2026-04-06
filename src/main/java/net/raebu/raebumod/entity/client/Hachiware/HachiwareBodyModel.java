package net.raebu.raebumod.entity.client.Hachiware;

import net.minecraft.client.model.Dilation;
import net.minecraft.client.model.ModelData;
import net.minecraft.client.model.ModelPartBuilder;
import net.minecraft.client.model.ModelPartData;
import net.minecraft.client.model.ModelTransform;
import net.minecraft.client.model.TexturedModelData;

public class HachiwareBodyModel {
    public static TexturedModelData create() {
        ModelData modelData = new ModelData();
        ModelPartData root = modelData.getRoot();

        root.addChild("CHelmet",
                ModelPartBuilder.create()
                        .uv(0, 42).cuboid(4.0F, -9.0F, -4.0F, 1.0F, 5.0F, 8.0F, Dilation.NONE)
                        .uv(18, 42).cuboid(-5.0F, -9.0F, -4.0F, 1.0F, 5.0F, 8.0F, Dilation.NONE)
                        .uv(56, 13).cuboid(-4.0F, -8.0F, 4.0F, 8.0F, 7.0F, 1.0F, Dilation.NONE)
                        .uv(0, 16).cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 1.0F, 9.0F, Dilation.NONE)
                        .uv(60, 21).cuboid(-5.0F, -12.0F, -1.0F, 3.0F, 3.0F, 2.0F, Dilation.NONE)
                        .uv(56, 26).cuboid(2.0F, -12.0F, -1.0F, 3.0F, 3.0F, 2.0F, Dilation.NONE),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        root.addChild("CBody",
                ModelPartBuilder.create()
                        .uv(48, 0).cuboid(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 1.0F, Dilation.NONE)
                        .uv(36, 48).cuboid(-4.0F, 0.0F, 2.0F, 8.0F, 12.0F, 1.0F, Dilation.NONE)
                        .uv(67, 64).cuboid(-1.0F, 10.0F, 3.0F, 2.0F, 2.0F, 4.0F, Dilation.NONE),
                ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        root.addChild("LeftA",
                ModelPartBuilder.create()
                        .uv(54, 48).cuboid(-1.0F, -3.0F, -3.0F, 5.0F, 1.0F, 6.0F, Dilation.NONE)
                        .uv(66, 8).cuboid(-1.0F, -2.0F, -3.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(68, 55).cuboid(-1.0F, -2.0F, 2.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(66, 31).cuboid(3.0F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, Dilation.NONE),
                ModelTransform.pivot(5.0F, 2.0F, 0.0F));

        root.addChild("RightA",
                ModelPartBuilder.create()
                        .uv(0, 55).cuboid(-4.0F, -3.0F, -3.0F, 5.0F, 1.0F, 6.0F, Dilation.NONE)
                        .uv(68, 59).cuboid(-4.0F, -2.0F, -3.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(70, 51).cuboid(-4.0F, -2.0F, 2.0F, 5.0F, 3.0F, 1.0F, Dilation.NONE)
                        .uv(66, 38).cuboid(-4.0F, -2.0F, -2.0F, 1.0F, 3.0F, 4.0F, Dilation.NONE),
                ModelTransform.pivot(-5.0F, 2.0F, 0.0F));

        return TexturedModelData.of(modelData, 128, 128);
    }
}
