package net.patys.txtmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.patys.txtmod.TomorrowXTogetherTXTMod;

public class ModBlocks {

    public static final Block LIGHTSTICK1_BLOCK = registerBlock("moabong1_block",
            new Block(FabricBlockSettings.copyOf(Blocks.TORCH)));

    private static Block registerBlock(String name, Block block){
        registerBlockItems(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TomorrowXTogetherTXTMod.MOD_ID, name), block);
    }

    private static Item registerBlockItems(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(TomorrowXTogetherTXTMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks(){
        TomorrowXTogetherTXTMod.LOGGER.info("Registering ModBlocks for: " + TomorrowXTogetherTXTMod.MOD_ID);
    }

}
