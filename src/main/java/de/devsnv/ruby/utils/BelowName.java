package de.devsnv.ruby.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import com.comphenix.protocol.wrappers.WrappedDataWatcher;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.lang.reflect.Field;

public class BelowName {

    public static void sendBelowName(Player player, String text) throws Exception{
        PacketContainer packet = new PacketContainer(PacketType.Play.Server.SCOREBOARD_DISPLAY_OBJECTIVE);
       // PacketPlayOutScoreboardObjective scoreboardObjective = new PacketPlayOutScoreboardObjective(objective, mode);

        player.sendMessage("1");
        packet.getStrings().write(0, "1");
        packet.getStrings().write(1, "2");
        packet.getStrings().write(2, "TEST");
        player.sendMessage("2");
        for(Player all : Bukkit.getServer().getOnlinePlayers()){
            all.sendMessage("3");
            ProtocolLibrary.getProtocolManager().sendServerPacket(all, packet);
        }
    }


    public static void changeBelowName(Player player, String text) {

    }

    public static void removeBelowName(Player player){

    }

}