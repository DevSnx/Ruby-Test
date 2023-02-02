package de.devsnv.ruby.utils;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.reflect.StructureModifier;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class BelowName {

    private static void sendBelowName(Player player, String text) throws Exception{
        PacketContainer BelowNamePacket = new PacketContainer(PacketType.Play.Server.SCOREBOARD_DISPLAY_OBJECTIVE);






        for(Player all : Bukkit.getServer().getOnlinePlayers()){
            ProtocolLibrary.getProtocolManager().sendServerPacket(all, BelowNamePacket, false);
        }
    }

    private static void changeBelowName(Player player, String text){

    }

    private static void removeBelowName(Player player){

    }
}