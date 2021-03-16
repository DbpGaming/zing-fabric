package dbp.zing;

import net.minecraft.block.Block;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Blocks {
	public enum BlocksEnum{
		ore_copper(new Block(FabricBlockSettings.of(Material.STONE)));

		public final Block block;
		BlocksEnum(Block block) {
			this.block = block;
		}
	}
	
	public static void RegisterBlocks(){
		for (BlocksEnum block : BlocksEnum.values()) Registry.register(Registry.BLOCK, new Identifier("zing", block.toString()), block.block);
	}
}