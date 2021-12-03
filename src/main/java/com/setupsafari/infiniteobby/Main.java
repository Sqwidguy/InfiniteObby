package com.setupsafari.infiniteobby;

import com.setupsafari.infiniteobby.listeners.BlockPlaceListener;
import com.setupsafari.infiniteobby.listeners.PlayerInteractListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new BlockPlaceListener(), this);
        Bukkit.getPluginManager().registerEvents(new PlayerInteractListener(), this);
    }
}
