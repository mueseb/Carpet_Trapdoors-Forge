package com.example.carpettrapdoors;

import com.example.carpettrapdoors.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("carpettrapdoors")
public class ExampleMod
{
    public static final String MOD_ID = "carpettrapdoors";

    public static final ItemGroup TUTORIAL_GROUP = new ItemGroup("carpetTrapdoorsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.RED_CARPET);
        }
    };

    public ExampleMod() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.registerModBlocks(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
