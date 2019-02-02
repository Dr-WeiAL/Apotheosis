package shadows.potion;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;

public class EnchantmentPotionInfinity extends Enchantment {

	protected EnchantmentPotionInfinity() {
		super(Rarity.VERY_RARE, EnumEnchantmentType.BOW, new EntityEquipmentSlot[] { EntityEquipmentSlot.MAINHAND });
		setName("apotheosis.potion_infinity");
	}

	@Override
	public int getMaxLevel() {
		return 1;
	}

	@Override
	public int getMinEnchantability(int enchantmentLevel) {
		return Enchantments.FORTUNE.getMinEnchantability(enchantmentLevel) + 20;
	}

	@Override
	public int getMaxEnchantability(int enchantmentLevel) {
		return Enchantments.FORTUNE.getMaxEnchantability(enchantmentLevel) + 20;
	}

}
