package com.fpsboost;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FpsBoostClient implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("fpsboost");

    @Override
    public void onInitializeClient() {
        LOGGER.info("FPS Boost modu yuklendi!");
    }
}
