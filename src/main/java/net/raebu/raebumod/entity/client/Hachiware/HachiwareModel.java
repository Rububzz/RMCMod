package net.raebu.raebumod.entity.client.Hachiware;

import net.minecraft.util.Identifier;
import net.raebu.raebumod.RaebuMod;
import net.raebu.raebumod.entity.custom.HachiwareEntity;
import software.bernie.geckolib.model.GeoModel;

public class HachiwareModel extends GeoModel<HachiwareEntity> {
    @Override
    public Identifier getModelResource(HachiwareEntity animatable) {
        return Identifier.of(RaebuMod.MOD_ID, "geo/hachiware.geo.json");
    }

    @Override
    public Identifier getTextureResource(HachiwareEntity animatable) {
        return Identifier.of(RaebuMod.MOD_ID, "textures/entity/hachiware.png");
    }

    @Override
    public Identifier getAnimationResource(HachiwareEntity animatable) {
        return Identifier.of(RaebuMod.MOD_ID, "animations/hachiware.animation.json");
    }
}
