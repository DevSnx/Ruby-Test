package de.devsnv.ruby;

import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import de.devsnv.ruby.commands.CommandBelowname;
import de.devsnv.ruby.commands.CommandNametag;
import de.devsnv.ruby.utils.BelowName;
import de.devsnv.ruby.utils.NameTag;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    public static Main instance;
    public static NameTag nameTag;
    public static BelowName belowName;
    public static ProtocolManager protocolManager;
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

    public static BelowName getBelowName() {
        return belowName;
    }

    public static NameTag getNameTag() {
        return nameTag;
    }

    public static ProtocolManager getProtocolManager() {
        return protocolManager;
    }
}
