package de.devsnv.ruby.commands;

import de.devsnv.ruby.Main;
import de.devsnv.ruby.utils.BelowName;
import de.devsnv.ruby.utils.NameTag;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CommandBelowname implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
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