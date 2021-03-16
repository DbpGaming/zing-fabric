package dbp.zing;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class Zing implements ModInitializer {
	public static final ItemGroup zing_group = FabricItemGroupBuilder.build(new Identifier("zing", "general"), () -> new ItemStack(Items.ItemsEnum.circuit_advanced.item));

	@Override
	public void onInitialize() {
		Blocks.RegisterBlocks();
		Items.RegisterItems();
		Materials.RegisterMaterials();
	}
}