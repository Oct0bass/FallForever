package rrajagopal.fallforever;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("fallforever")
public class FallForever {
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public FallForever() {
        LOGGER.info("Initialized");
    }
}
