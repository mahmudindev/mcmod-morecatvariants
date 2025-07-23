package com.github.mahmudindev.mcmod.morecatvariants.entity;

import com.github.mahmudindev.mcmod.morecatvariants.MoreCatVariants;
import com.github.mahmudindev.mcmod.morecatvariants.MoreCatVariantsExpectPlatform;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.CatVariant;

public class MoreCatVariant {
    public static final ResourceLocation ABYSSINIAN = new ResourceLocation(
            MoreCatVariants.MOD_ID,
            "abyssinian"
    );
    public static final ResourceLocation SOMALI = new ResourceLocation(
            MoreCatVariants.MOD_ID,
            "somali"
    );
    public static final ResourceLocation SPHYNX = new ResourceLocation(
            MoreCatVariants.MOD_ID,
            "sphynx"
    );

    public static void bootstrap() {
        register(ABYSSINIAN, "textures/entity/cat/abyssinian.png");
        register(SOMALI, "textures/entity/cat/somali.png");
        register(SPHYNX, "textures/entity/cat/sphynx.png");
    }

    private static void register(ResourceLocation resourceLocation, String texture) {
        MoreCatVariantsExpectPlatform.registerRegistryEntry(
                Registries.CAT_VARIANT,
                resourceLocation,
                () -> new CatVariant(new ResourceLocation(MoreCatVariants.MOD_ID, texture))
        );
    }
}
