package com.github.mahmudindev.mcmod.morecatvariants.neoforge;

import com.github.mahmudindev.mcmod.morecatvariants.MoreCatVariants;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(MoreCatVariants.MOD_ID)
public final class MoreCatVariantsNeoForge {
    public static IEventBus EVENT_BUS;

    public MoreCatVariantsNeoForge(IEventBus eventBus) {
        EVENT_BUS = eventBus;

        // Run our common setup.
        MoreCatVariants.init();
    }
}
