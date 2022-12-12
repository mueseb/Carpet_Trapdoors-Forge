package com.mueseb.carpettrapdoors;

import com.mueseb.carpettrapdoors.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("carpettrapdoors")
public class CarpetTrapdoorsMain
{
    public static final String MOD_ID = "carpettrapdoors";

    public static final ItemGroup CarpetTrapdoorsTab = new ItemGroup("carpet_trapdoorsTab") {
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
