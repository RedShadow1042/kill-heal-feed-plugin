package me.shadow.gui;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.AQUA + "Test")) {
            if (e.getCurrentItem().getType().equals(Material.TNT)) {

                p.setHealth(0);
                p.closeInventory();
                p.sendMessage(ChatColor.RED + "You suicided");

            }

        if (e.getCurrentItem().getType().equals(Material.ENCHANTED_GOLDEN_APPLE)) {

            p.setHealth(20);
            p.closeInventory();
            p.sendMessage(ChatColor.GREEN + "You got Healed");

        }

        if (e.getCurrentItem().getType().equals(Material.BREAD)) {

            p.setFoodLevel(20);
            p.closeInventory();
            p.sendMessage(ChatColor.YELLOW + "Your hunger bar is now max");

        }


        }

    }
}
