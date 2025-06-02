package com.github.mahmudindev.mcmod.morecatvariants;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class MoreCatVariantsExpectPlatform {
    @ExpectPlatform
    public static <T, V extends T> void registerRegistry(
            ResourceKey<? extends Registry<T>> resourceKey,
            ResourceLocation resourceLocation,
            Supplier<? extends V> supplier
    ) {
        return;
    }
}
