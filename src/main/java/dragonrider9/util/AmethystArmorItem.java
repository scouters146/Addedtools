package dragonrider9.util;

import dragonrider9.init.ItemInit;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AmethystArmorItem extends ArmorItem {
    public AmethystArmorItem(ArmorMaterial p_40386_, EquipmentSlot p_40387_, Properties p_40388_) {
        super(p_40386_, p_40387_, p_40388_);
    }
    @Override
    public void onArmorTick(ItemStack stack, Level world, Player player){
        if (player.getInventory().getArmor(0) != null && player.getInventory().getArmor(0).getItem().equals(ItemInit.PURE_AMETHYST_BOOTS.get())
                && player.getInventory().getArmor(1) != null && player.getInventory().getArmor(1).getItem().equals(ItemInit.PURE_AMETHYST_LEGGINGS.get()) &&
                player.getInventory().getArmor(2) != null && player.getInventory().getArmor(2).getItem().equals(ItemInit.PURE_AMETHYST_CHESTPLATE.get()) &&
                player.getInventory().getArmor(3) != null && player.getInventory().getArmor(3).getItem().equals(ItemInit.PURE_AMETHYST_HELMET.get())) {
            player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED,60,0,false,false));
        }
    }
}
