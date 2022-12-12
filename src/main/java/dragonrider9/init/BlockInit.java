package dragonrider9.init;

import dragonrider9.Addedtoolsmod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister <Block>BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Addedtoolsmod.MOD_ID);
    public static final DeferredRegister <Item> ITEMS = ItemInit.ITEMS;

    public static final RegistryObject <Block> PURE_AMETHYST_BLOCK = registerBlock("pure_amethyst_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.AMETHYST).strength(5f,5.5f).sound(SoundType.AMETHYST)
                    .requiresCorrectToolForDrops()),CreativeModeTab.TAB_BUILDING_BLOCKS);


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }


}
