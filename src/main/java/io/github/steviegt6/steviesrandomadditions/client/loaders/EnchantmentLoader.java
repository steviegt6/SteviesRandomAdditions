package io.github.steviegt6.steviesrandomadditions.client.loaders;


import io.github.steviegt6.steviesrandomadditions.SteviesRandomAdditions;
import io.github.steviegt6.steviesrandomadditions.enchantment.ProsperousDiggerEnchantment;
import io.github.steviegt6.steviesrandomadditions.enchantment.ProsperousWeaponEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.registry.Registry;

public class EnchantmentLoader {
    public static final Enchantment PROSPEROUS_PICKAXE = Registry.register(
            Registry.ENCHANTMENT,
            SteviesRandomAdditions.GetModIDString("prosperous_pickaxe"),
            new ProsperousDiggerEnchantment(
                    Enchantment.Rarity.RARE,
                    EnchantmentTarget.DIGGER,
                    new EquipmentSlot[] {
                            EquipmentSlot.MAINHAND
                    }
            )
    );
    public static final Enchantment PROSPEROUS_SWORD = Registry.register(
            Registry.ENCHANTMENT,
            SteviesRandomAdditions.GetModIDString("prosperous_sword"),
            new ProsperousWeaponEnchantment(
                    Enchantment.Rarity.RARE,
                    EnchantmentTarget.WEAPON,
                    new EquipmentSlot[] {
                            EquipmentSlot.MAINHAND
                    }
            )
    );

    public static void Load() {
    }
}
