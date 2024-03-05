package com.ashkiano.seedblocker;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class SeedBlocker extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("SeedBlocker has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("SeedBlocker has been disabled.");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("seed")) {
            if (sender instanceof Player) {
                sender.sendMessage(ChatColor.RED + "Access to the world seed is restricted.");
                return true;
            }
        }
        return false;
    }
}