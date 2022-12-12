package dragonrider9.util;

import dragonrider9.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier PURE_AMETHYST = new ForgeTier(3, 900, 7f,
            3f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemInit.PURE_AMETHYST.get()));

}
