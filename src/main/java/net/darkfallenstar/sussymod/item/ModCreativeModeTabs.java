package net.darkfallenstar.sussymod.item;

import net.darkfallenstar.sussymod.SussyMod;
import net.darkfallenstar.sussymod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.util.filefix.fixes.ResourcePackLocationFileFix;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SussyMod.MODID);

    public static final Supplier<CreativeModeTab> SUSSY_ITEMS_TAB = CREATIVE_MODE_TAB.register(
            "sussy_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.TOMATO.get()))
                    .title(Component.translatable("creativetab.sussymod.sussy_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BLUE_ROCKS);
                        output.accept(ModItems.TOMATO);
                        output.accept(ModItems.COOKED_TOMATO);
                    }).build());

    public static final Supplier<CreativeModeTab> SUSSY_BLOCKS_TAB = CREATIVE_MODE_TAB.register(
            "sussy_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.TOMATO_BLOCK))
                    .withTabsBefore(Identifier.fromNamespaceAndPath(SussyMod.MODID, "sussy_items_tab"))
                    .title(Component.translatable("creativetab.sussymod.sussy_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.BLUE_ROCKS_BLOCK);
                        output.accept(ModBlocks.TOMATO_BLOCK);
                        output.accept(ModBlocks.TOMATO_STONE_ORE);
                    }).build());




    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
