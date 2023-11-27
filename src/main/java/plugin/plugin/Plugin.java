package plugin.plugin;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.plugin.commands.commands;
import plugin.plugin.events.DeathEvents;
import plugin.plugin.events.ItemEvents;
import plugin.plugin.items.ItemManager;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_GREEN + "[SIRENIZE] Plugin is enabled!");
        ItemManager.init();
        getServer().getPluginManager().registerEvents(new ItemEvents(), this);
        getCommand("givescythe").setExecutor(new commands());
        getServer().getPluginManager().registerEvents(new DeathEvents(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_RED + "[SIRENIZE] Plugin is disabled!");
    }
}
