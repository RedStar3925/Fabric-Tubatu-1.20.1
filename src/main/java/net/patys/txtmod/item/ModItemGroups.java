package net.patys.txtmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.patys.txtmod.TomorrowXTogetherTXTMod;
import net.patys.txtmod.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup TXT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TomorrowXTogetherTXTMod.MOD_ID, "tomorrow-x-together"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.tomorrow-x-together"))
                    .icon(() -> new ItemStack(ModItems.LIGHTSTICK1)).entries((displayContext, entries) -> {
                        entries.add(ModItems.LIGHTSTICK1);
                        entries.add(ModItems.LIGHTSTICK2);
                        entries.add(ModBlocks.NOAS_BLOCK);

                    }).build());

    public static void registerItemGroups(){
        TomorrowXTogetherTXTMod.LOGGER.info("Registering item groups for: " + TomorrowXTogetherTXTMod.MOD_ID);
    }

}
