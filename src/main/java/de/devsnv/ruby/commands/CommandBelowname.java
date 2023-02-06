package de.devsnv.ruby.commands;

import com.comphenix.protocol.reflect.FieldAccessException;
import de.devsnv.ruby.Main;
import de.devsnv.ruby.utils.BelowName;
import de.devsnv.ruby.utils.NameTag;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandBelowname implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender,Command command, String label, String[] args) {
        if(sender instanceof Player){
            Player player = (Player) sender;
            try {
                BelowName.sendBelowName(player, "&aTEST");
                sender.sendMessage("§7set");
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        }

        return true;
    }
}