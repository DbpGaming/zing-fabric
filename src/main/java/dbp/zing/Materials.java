package dbp.zing;

import dbp.tma.api.Constructor;
import dbp.tma.api.Data;
import dbp.tma.api.Register;
import net.minecraft.item.Item.Settings;
import static dbp.zing.Setting.settingsEnum.*;
import static dbp.zing.Materials.PartsEnum.*;

public class Materials {
	public enum PartsEnum{ingot, dust, plate, credit, hull, fibre, mesh, nugget;}

	public enum MaterialsEnum {
		tin(Constructor.Material(ingot, dust, plate), basic.setting),
		gold(Constructor.Material(dust, plate, credit), basic.setting),
		bronze(Constructor.Material(ingot, plate, hull), basic.setting),
		aluminium(Constructor.Material(ingot, dust, plate, hull), basic.setting),
		titanium(Constructor.Material(ingot, dust, plate, hull), basic.setting),
		steel(Constructor.Material(ingot, nugget, plate, hull), basic.setting),
		platinum(Constructor.Material(ingot, dust, plate), basic.setting),
		tungsten(Constructor.Material(ingot, dust, plate), basic.setting),
		tungstensteel(Constructor.Material(ingot, plate, hull), basic.setting),
		lapis(Constructor.Material(dust, plate), basic.setting),
		ender_pearl(Constructor.Material(dust), basic.setting),
		emerald(Constructor.Material(dust), basic.setting),
		diamond(Constructor.Material(dust, credit), basic.setting),
		ash(Constructor.Material(dust), basic.setting),
		dark_ash(Constructor.Material(dust), basic.setting),
		carbon(Constructor.Material(dust, fibre, mesh, plate), basic.setting),
		refined_iron(Constructor.Material(plate, hull, credit), basic.setting),
		iron(Constructor.Material(dust), basic.setting);

		public final Data data;
		public final Settings settings;
		MaterialsEnum(Data data, Settings settings){
			this.data = data.setSetting("name", this.toString());
			this.settings = settings;
		}
	}

	public static void RegisterMaterials() {
		for (MaterialsEnum material : MaterialsEnum.values()) Register.registerMaterial("zing", material.data, material.settings);
	}
}