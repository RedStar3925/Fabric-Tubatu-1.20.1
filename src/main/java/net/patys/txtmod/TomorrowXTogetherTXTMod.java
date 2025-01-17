package net.patys.txtmod;

import net.fabricmc.api.ModInitializer;

import net.patys.txtmod.block.ModBlocks;
import net.patys.txtmod.item.ModItemGroups;
import net.patys.txtmod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TomorrowXTogetherTXTMod implements ModInitializer {

	public static final String MOD_ID = "tomorrow-x-together-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}