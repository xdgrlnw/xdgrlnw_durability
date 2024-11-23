package me.xdgrlnw;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class xdgrlnwSimpleDurability implements ModInitializer {
	public static final String MOD_ID = "xdgrlnw_durability";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[xdgrlnw] Simple Durability Loaded!");
	}
}