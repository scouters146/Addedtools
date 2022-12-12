package dragonrider9.init;

import dragonrider9.Addedtoolsmod;
import dragonrider9.util.AmethystArmorItem;
import dragonrider9.util.ModArmorMaterials;
import dragonrider9.util.ModTiers;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister <Item>ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Addedtoolsmod.MOD_ID);



    public static final RegistryObject<Item> PURE_AMETHYST = register("pure_amethyst",
            ()-> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS)));
    public static final RegistryObject<Item>PURE_AMETHYST_HELMET = register("pure_amethyst_helmet",
            ()-> new AmethystArmorItem(ModArmorMaterials.PURE_AMETHYST, EquipmentSlot.HEAD,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item>PURE_AMETHYST_CHESTPLATE = register("pure_amethyst_chestplate",
            ()-> new AmethystArmorItem(ModArmorMaterials.PURE_AMETHYST, EquipmentSlot.CHEST,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item>PURE_AMETHYST_LEGGINGS = register("pure_amethyst_leggings",
            ()-> new AmethystArmorItem(ModArmorMaterials.PURE_AMETHYST, EquipmentSlot.LEGS,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item>PURE_AMETHYST_BOOTS = register("pure_amethyst_boots",
            ()-> new AmethystArmorItem(ModArmorMaterials.PURE_AMETHYST, EquipmentSlot.FEET,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item>PURE_AMETHYST_SWORD = register("pure_amethyst_sword",
            ()-> new SwordItem(ModTiers.PURE_AMETHYST, 3,-2.4f,new Item.Properties().tab(CreativeModeTab.TAB_COMBAT)));
    public static final RegistryObject<Item>PURE_AMETHYST_PICKAXE = register("pure_amethyst_pickaxe",
            ()-> new PickaxeItem(ModTiers.PURE_AMETHYST, 1,-2.8f,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item>PURE_AMETHYST_SHOVEL = register("pure_amethyst_shovel",
            ()-> new ShovelItem(ModTiers.PURE_AMETHYST, 1.5f,-3f,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item>PURE_AMETHYST_AXE = register("pure_amethyst_axe",
            ()-> new AxeItem(ModTiers.PURE_AMETHYST, 6,-3.1f,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item>PURE_AMETHYST_HOE = register("pure_amethyst_hoe",
            ()-> new HoeItem(ModTiers.PURE_AMETHYST, -3,0.0f,new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static <T extends Item>RegistryObject<T>register(final String name, final Supplier<T>item){
        return ITEMS.register(name,item);
    }
}
