package com.example.carpettrapdoors.block;

import com.example.carpettrapdoors.CarpetTrapdoorsMain;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CarpetTrapdoorsMain.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CarpetTrapdoorsMain.MOD_ID);
    public static final String[] colors = new String[] {"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"};

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = BLOCKS.register(name, block);
        registerBlockItem(name, registryObject);
        return registryObject;
    }

    private static <T extends Block> void registerBlockItem(String name, Supplier<T> block) {
        BLOCK_ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(CarpetTrapdoorsMain.TUTORIAL_GROUP)));
    }

    public static void registerModBlocks(IEventBus eventBus) {
        registerWoodenTrapdoors();
        registerIronTrapdoors();
        BLOCKS.register(eventBus);
        BLOCK_ITEMS.register(eventBus);
    }

    public static void registerWoodenTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_trapdoor", () -> new CarpetTrapdoor(AbstractBlock.Properties.of(Material.WOOL).strength(3.0f, 3.0f).sound(SoundType.WOOL)));
        }
    }
    public static void registerIronTrapdoors()
    {
        for (String color: colors) {
            registerBlock(color+"_carpet_iron_trapdoor", () -> new CarpetTrapdoor(AbstractBlock.Properties.of(Material.METAL).strength(3.0f, 3.0f).sound(SoundType.WOOL)));
        }
    }

}
