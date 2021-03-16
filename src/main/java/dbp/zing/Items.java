package dbp.zing;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.BlockItem;
import static dbp.zing.Setting.settingsEnum.*;

public class Items {
	public enum ItemsEnum{
		circuit_basic(new Item(basic.setting)),
		circuit_advanced(new Item(basic.setting)),
		circuit_elite(new Item(basic.setting)),
		circuit_data(new Item(basic.setting)),
		circuit_master(new Item(basic.setting)),
		circuit_ultimate(new Item(basic.setting)),
		superconductor(new Item(basic.setting)),
		overclocker_upgrade(new Item(basic.setting)),
		transformer_upgrade(new Item(basic.setting)),
		energy_upgrade(new Item(basic.setting)),
		mj_upgrade(new Item(basic.setting)),
		advanced_energy_upgrade(new Item(basic.setting)),
		advanced_transformer_upgrade(new Item(basic.setting)),
		mj_energy_upgrade(new Item(basic.setting)),
		diamond_sawblade(new Item(basic.setting)),
		diamond_grinding_head(new Item(basic.setting)),
		tungsten_grinding_head(new Item(basic.setting)),
		kanthal_coil(new Item(basic.setting)),
		cupronickel_coil(new Item(basic.setting)),
		nichrome_coil(new Item(basic.setting)),
		machine_parts(new Item(basic.setting)),
		circuit_parts(new Item(basic.setting)),
		circuit_advanced_parts(new Item(basic.setting)),
		circuit_elite_parts(new Item(basic.setting)),
		circuit_board(new Item(basic.setting)),
		circuit_advanced_board(new Item(basic.setting)),
		circuit_elite_board(new Item(basic.setting)),
		heating_element(new Item(basic.setting)),
		copper_coil(new Item(basic.setting)),
		scrap(new Item(basic.setting)),
		uu_matter(new Item(basic.setting)),
		resin(new Item(basic.setting)),
		rubber(new Item(basic.setting)),
		mixed_metal_ingot(new Item(basic.setting)),
		advanced_alloy_plate(new Item(basic.setting)),
		iridium_alloy_ingot(new Item(basic.setting)),
		iridium_plate(new Item(basic.setting)),
		coal_ball(new Item(basic.setting)),
		compressed_coal_ball(new Item(basic.setting)),
		coal_chunk(new Item(basic.setting)),
		industrial_diamond(new Item(basic.setting)),
		copper_credit(new Item(basic.setting)),
		silver_credit(new Item(basic.setting)),
		ore_copper(new BlockItem(Blocks.BlocksEnum.ore_copper.block, basic.setting));

		public final Item item;
		ItemsEnum(Item item) {
			this.item = item;
		}
	}

	public static void RegisterItems(){
		for (ItemsEnum item : ItemsEnum.values()) Registry.register(Registry.ITEM, new Identifier("zing", item.toString()), item.item);
	}
}