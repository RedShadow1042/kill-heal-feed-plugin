package me.shadow.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GuiCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        Player p = (Player) commandSender;
        Inventory gui = Bukkit.createInventory(p, 9, ChatColor.AQUA + "Test");

        ItemStack Die = new ItemStack(Material.TNT);
        ItemStack Heal = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
        ItemStack Feed = new ItemStack(Material.BREAD);

        ItemMeta Die_meta = Die.getItemMeta();
        Die_meta.setDisplayName(ChatColor.RED + "!!!DIE!!!");
        ArrayList<String> Die_lore = new ArrayList<>();
        Die_lore.add("This item let you kill yourself");
        Die_lore.add("Click on it to suicide");
        Die_meta.setLore(Die_lore);
        Die.setItemMeta(Die_meta);

        ItemMeta Heal_meta = Heal.getItemMeta();
        Heal_meta.setDisplayName(ChatColor.GREEN + "+Heal+");
        ArrayList<String> Heal_lore = new ArrayList<>();
        Heal_lore.add("This item heals you at full HP");
        Heal_lore.add("Click on it to heal");
        Heal_meta.setLore(Heal_lore);
        Heal.setItemMeta(Heal_meta);

        ItemMeta Feed_meta = Feed.getItemMeta();
        Feed_meta.setDisplayName(ChatColor.YELLOW + "--Feed--");
        ArrayList<String> Feed_lore = new ArrayList<>();
        Feed_lore.add("This item feeds you");
        Feed_lore.add("Click on it to feed yourself");
        Feed_meta.setLore(Feed_lore);
        Feed.setItemMeta(Feed_meta);


        ItemStack[] item_menu = {Die, Heal, Feed};
        p.openInventory(gui);
        gui.setContents(item_menu);
        return true;
    }
}
