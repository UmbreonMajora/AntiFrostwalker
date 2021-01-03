package me.umbreon.antifrostwalker;

import me.umbreon.antifrostwalker.commands.AntiFrostwalkerCommand;
import me.umbreon.antifrostwalker.event.EntityBlockForm;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class AntiFrostwalker extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new EntityBlockForm(), this);
        getCommand("antifrostwalker").setExecutor(new AntiFrostwalkerCommand());
        this.getLogger().info("AntiFrostwalker enabled. Version 1.0.0 by Umbreon.");
    }
}
