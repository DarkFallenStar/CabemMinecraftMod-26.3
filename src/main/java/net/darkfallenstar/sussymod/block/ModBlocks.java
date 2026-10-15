package net.darkfallenstar.sussymod.block;

import net.darkfallenstar.sussymod.SussyMod;
import net.darkfallenstar.sussymod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import static net.darkfallenstar.sussymod.item.ModItems.ITEMS;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(SussyMod.MODID);

    public static final DeferredBlock<Block> TOMATO_BLOCK = registerSimpleBlock(
            "tomato_block",
            () -> BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.WET_SPONGE)
    );

    public static final DeferredBlock<Block> BLUE_ROCKS_BLOCK = registerSimpleBlock(
            "blue_rocks_block",
            () -> BlockBehaviour.Properties.of()
                    .strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)
    );

    private static DeferredBlock<Block>
    registerSimpleBlock(String name, Supplier<BlockBehaviour.Properties> properties)
    {
        DeferredBlock<Block> block = BLOCKS.registerSimpleBlock(name, properties);
        ModItems.ITEMS.registerSimpleBlockItem(block);
        return block;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
