package net.ratseerofrattesse.durtleminer;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Items;
import net.ratseerofrattesse.durtleminer.block.ModBlocks;
import net.ratseerofrattesse.durtleminer.item.ModItems;
import net.ratseerofrattesse.durtleminer.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Durtleminer implements ModInitializer {
	public static final String MOD_ID = "durtleminer";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Durtlefication begins :::::::)");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerModItems();

		FuelRegistry.INSTANCE.add(Items.AXOLOTL_BUCKET, 16000);
	}
}