package me.shreyasayyengar.mobai;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class MobAIPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "Plugin loaded with no errors!");

        getServer().getPluginManager().registerEvents(new TargetListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info(ChatColor.RED + "Plugin disabled with " + ChatColor.GREEN + "no " + ChatColor.RED + "errors!");
    }
}
