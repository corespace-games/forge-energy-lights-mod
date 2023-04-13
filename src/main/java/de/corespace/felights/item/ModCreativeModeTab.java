package de.corespace.felights.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ModCreativeModeTab {

    public static final CreativeModeTab FELIGHTS_TAB = new CreativeModeTab("felights") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_TUNGSTEN.get());
        }
    };
}
