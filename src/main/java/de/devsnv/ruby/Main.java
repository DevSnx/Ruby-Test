package de.devsnv.ruby;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import de.devsnv.ruby.commands.CommandBelowname;
import de.devsnv.ruby.commands.CommandNametag;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;
    private ProtocolManager protocolManager;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        onLoad();
        getCommand("nametag").setExecutor(new CommandNametag());
        getCommand("belowname").setExecutor(new CommandBelowname());}

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
