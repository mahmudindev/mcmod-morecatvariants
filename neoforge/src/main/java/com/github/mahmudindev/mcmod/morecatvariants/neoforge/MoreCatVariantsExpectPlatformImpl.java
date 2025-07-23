package com.github.mahmudindev.mcmod.morecatvariants.neoforge;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class MoreCatVariantsExpectPlatformImpl {
    public static <T, V extends T> Supplier<V> registerRegistryEntry(
            ResourceKey<? extends Registry<T>> resourceKey,
            ResourceLocation resourceLocation,
            Supplier<? extends V> supplier
    ) {
        DeferredRegister<T> deferredRegister = DeferredRegister.create(
                resourceKey,
                resourceLocation.getNamespace()
        );

        deferredRegister.register(MoreCatVariantsNeoForge.EVENT_BUS);

        return deferredRegister.register(resourceLocation.getPath(), supplier);
    }
}
