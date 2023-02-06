package de.devsnv.ruby.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.FieldAccessException;
import com.comphenix.protocol.wrappers.EnumWrappers;
import com.sun.tools.jdi.Packet;
import de.devsnv.ruby.Main;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;

public class NameTag {

    public static void sendNameTag(Player player, String text) throws FieldAccessException, InvocationTargetException {
        PacketContainer packet = new PacketContainer(PacketType.Play.Server.SCOREBOARD_OBJECTIVE);




        player.sendMessage("1");
        packet.getStrings().write(0, text.replace("&", "§"));
        player.sendMessage("2");
        for(Player all : Bukkit.getServer().getOnlinePlayers()){
            player.sendMessage("3");
            Main.getProtocolManager().sendServerPacket(all, packet);
        }
    }
}
