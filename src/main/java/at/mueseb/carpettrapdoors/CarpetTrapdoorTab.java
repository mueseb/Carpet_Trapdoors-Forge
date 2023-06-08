package at.mueseb.carpettrapdoors;

import at.mueseb.carpettrapdoors.block.ModBlocks;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid=CarpetTrapdoorsMain.MOD_ID, bus=Mod.EventBusSubscriber.Bus.MOD)
public class CarpetTrapdoorTab {
    public static CreativeModeTab carpetTAB;

    @SubscribeEvent
    public static void register(BuildCreativeModeTabContentsEvent event) {
//        event.accept(new ItemStack(Items.RED_CARPET));
        carpetTAB = event.getTab();
//        carpetTAB = event.registerCreativeModeTab(
//                new ResourceLocation("elevators_tab", CarpetTrapdoorsMain.MOD_ID), builder -> builder
//                        .icon(() -> new ItemStack(Items.RED_CARPET))
//                        .displayItems((featureFlags, output, hasOp) -> ModBlocks.BLOCK_ITEMS.getEntries().forEach(o -> output.accept(o.get())))
//                        .title(Component.translatable("itemGroup.carpet_trapdoorsTab"))
//        );
    }
}
