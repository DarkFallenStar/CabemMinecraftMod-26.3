package net.darkfallenstar.sussymod.item;

import net.darkfallenstar.sussymod.SussyMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems  {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SussyMod.MODID);

    public static final DeferredItem<Item> BLUE_ROCKS = ITEMS.registerSimpleItem(
            "blue_rocks"
    );

    public static final DeferredItem<Item> TOMATO = ITEMS.registerSimpleItem(
            "tomato"
    );

    public static final DeferredItem<Item> COOKED_TOMATO = ITEMS.registerSimpleItem(
            "cooked_tomato"
    );

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
