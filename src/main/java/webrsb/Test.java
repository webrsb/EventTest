package webrsb;

import com.google.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.api.Sponge;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GameInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

@Plugin(id = Test.ID, name = Test.NAME, version = Test.VERSION)
public class Test {
    public static final String ID = "test";
    public static final String NAME = "Test Plugin";
    public static final String VERSION = "0.0.1";

    @Inject
    private static Logger logger;

    @Listener
    public void onServerInit(GameInitializationEvent event) {
        Test.logger = LoggerFactory.getLogger(Test.ID);
        Sponge.getEventManager().registerListeners(this, new UseItemStackListener());
        getLogger().info(String.format("Starting up %s v%s", Test.NAME, Test.VERSION));
    }

    public static Logger getLogger() {
        return logger;
    }
}
