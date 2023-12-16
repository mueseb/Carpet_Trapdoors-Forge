package at.mueseb.carpettrapdoors;

import at.mueseb.carpettrapdoors.block.ModBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod("carpettrapdoors")
public class CarpetTrapdoorsMain
{
    public static final String MOD_ID = "carpettrapdoors";

    public CarpetTrapdoorsMain() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModBlocks.registerModBlocks(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

}
