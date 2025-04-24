package furiouswhqle;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoCropTrample implements ModInitializer {
	public static final String MOD_ID = "no-crop-trample";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	@Override
	public void onInitialize() {
		LOGGER.info("No Crop Trample Loaded!");
	}
}
