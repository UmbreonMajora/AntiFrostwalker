package me.umbreon.antifrostwalker.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class AntiFrostwalkerCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        commandSender.sendMessage(ChatColor.GREEN + "AntiFrostwalker enabled.\nVersion 1.0.0 by Umbreon.");
        return true;
    }
}
