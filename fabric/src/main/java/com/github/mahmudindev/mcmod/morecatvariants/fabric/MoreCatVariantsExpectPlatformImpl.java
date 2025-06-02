package com.github.mahmudindev.mcmod.morecatvariants.fabric;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

public class MoreCatVariantsExpectPlatformImpl {
    public static <T, V extends T> void registerRegistry(
            ResourceKey<? extends Registry<T>> resourceKey,
            ResourceLocation resourceLocation,
            Supplier<? extends V> supplier
    ) {
        Registry<?> registry = BuiltInRegistries.REGISTRY.get(resourceKey.location());
        if (registry == null) {
            throw new RuntimeException("Registry entry may not exist");
        }

        //noinspection unchecked
        Registry.register((Registry<T>) registry, resourceLocation, supplier.get());
    }
}
