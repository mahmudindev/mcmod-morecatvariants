package com.github.mahmudindev.mcmod.morecatvariants;

import com.github.mahmudindev.mcmod.morecatvariants.platform.Services;
import com.github.mahmudindev.mcmod.morecatvariants.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class MoreCatVariants {
    public static final String MOD_ID = "morecatvariants";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}
