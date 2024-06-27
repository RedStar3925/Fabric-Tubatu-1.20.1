package net.patys.txtmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.patys.txtmod.TomorrowXTogetherTXTMod;

public class ModItems {

    public static final Item LIGHTSTICK1 = registerItem("moabong_v1", new Item(new FabricItemSettings()));
    public static final Item LIGHTSTICK2 = registerItem("moabong_v2", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries){
        entries.add(LIGHTSTICK1);
        entries.add(LIGHTSTICK2);
    }

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(TomorrowXTogetherTXTMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        TomorrowXTogetherTXTMod.LOGGER.info("Registering items for: " + TomorrowXTogetherTXTMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(ModItems::addItemsToIngredientItemGroup);
    }
}
