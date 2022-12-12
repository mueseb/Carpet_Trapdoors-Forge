package com.example.carpettrapdoors;

import com.example.carpettrapdoors.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("carpettrapdoors")
public class CarpetTrapdoorsMain
{
    public static final String MOD_ID = "carpettrapdoors";

    public static final CreativeModeTab CarpetTrapdoorsTab = new CreativeModeTab("carpet_trapdoorsTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Items.RED_CARPET);
        }
    };

    public CarpetTrapdoorsMain() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.registerModBlocks(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
