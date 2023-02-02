package de.devsnv.ruby.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class NameTag {

    private static void sendNameTag(Player player, String text) throws Exception{
        PacketContainer NameTagPacket = new PacketContainer(PacketType.Play.Server.SCOREBOARD_OBJECTIVE);








        for(Player all : Bukkit.getServer().getOnlinePlayers()){
            ProtocolLibrary.getProtocolManager().sendServerPacket(all, NameTagPacket, false);
        }
    }

    private static void changeNameTag(Player player, String text){

    }

    private static void removeNameTag(Player player){

    }
}
