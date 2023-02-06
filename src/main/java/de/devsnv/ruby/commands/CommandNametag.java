package de.devsnv.ruby.commands;

import de.devsnv.ruby.utils.BelowName;
import de.devsnv.ruby.utils.NameTag;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandNametag implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            try {
                NameTag.sendNameTag(player, "&aTEST");
                sender.sendMessage("§7set");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }



        return true;
    }
}
