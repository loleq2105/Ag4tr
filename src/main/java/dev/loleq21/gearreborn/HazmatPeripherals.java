package dev.loleq21.gearreborn;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.DyeableArmorItem;
import net.minecraft.item.ItemStack;

public class HazmatPeripherals extends DyeableArmorItem {

    public HazmatPeripherals(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Settings().group(GearReborn.ITEMGROUP).maxCount(1).fireproof());
    }

    @Override
    public int getColor(ItemStack stack) {
        return super.getColor(stack) + 16777215 - DEFAULT_COLOR;
    }

}
