package de.devsnv.ruby;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;
    private ProtocolManager protocolManager;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        onLoad();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
    }

    public void onLoad() {
        protocolManager = ProtocolLibrary.getProtocolManager();
    }

    public static Main getInstance() {
        return instance;
    }
}
