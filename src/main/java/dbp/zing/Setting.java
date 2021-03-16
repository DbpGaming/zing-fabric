package dbp.zing;

import net.minecraft.item.Item.Settings;

public class Setting {
	public enum settingsEnum{
		basic(new Settings().group(Zing.zing_group));

		public final Settings setting;
		settingsEnum(Settings setting){
			this.setting = setting;
		}
	}
}
