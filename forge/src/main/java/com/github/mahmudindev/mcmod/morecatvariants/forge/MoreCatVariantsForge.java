package com.github.mahmudindev.mcmod.morecatvariants.forge;

import com.github.mahmudindev.mcmod.morecatvariants.MoreCatVariants;
import net.minecraftforge.fml.common.Mod;

@Mod(MoreCatVariants.MOD_ID)
public final class MoreCatVariantsForge {
    public MoreCatVariantsForge() {
        // Run our common setup.
        MoreCatVariants.init();
    }
}
