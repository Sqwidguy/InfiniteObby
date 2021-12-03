package com.setupsafari.infiniteobby.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class PlayerInteractListener implements Listener {

    @EventHandler(ignoreCancelled = true)
    public void onPlayerInteract(@NotNull PlayerInteractEvent event) {
        Player player = event.getPlayer();
        ItemStack itemStack = player.getItemInHand();
        if (itemStack.getType() == Material.WATER_BUCKET) {
            player.sendMessage("duh");
        } else if (itemStack.getType() == Material.BUCKET) {
            player.sendMessage("squid sucks");
        }
    }
}