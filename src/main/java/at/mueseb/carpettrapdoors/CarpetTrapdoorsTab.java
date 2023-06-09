package at.mueseb.carpettrapdoors;

import at.mueseb.carpettrapdoors.block.ModBlocks;
import net.minecraft.world.item.*;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid= CarpetTrapdoorsMain.MOD_ID, bus= Mod.EventBusSubscriber.Bus.MOD)
public class CarpetTrapdoorsTab {
    @SubscribeEvent
    public static void addItemsToTabs(BuildCreativeModeTabContentsEvent event) {

        if (event.getTabKey() == CreativeModeTabs.COLORED_BLOCKS) {
            for (RegistryObject item : ModBlocks.BLOCK_ITEMS.getEntries()) {
                event.accept((Item) item.get());
            }
        }
    }
}
