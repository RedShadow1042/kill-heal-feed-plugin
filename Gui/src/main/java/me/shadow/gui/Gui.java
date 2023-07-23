package me.shadow.gui;

import org.bukkit.plugin.java.JavaPlugin;

public final class Gui extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("gui").setExecutor(new GuiCommand());

        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

    }
}
