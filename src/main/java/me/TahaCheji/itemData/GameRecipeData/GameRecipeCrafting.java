package me.TahaCheji.itemData.GameRecipeData;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GameRecipeCrafting {

    public static Inventory getCraftingGui() {
        Inventory GUI;
        GUI = Bukkit.createInventory(null, 27, ChatColor.GRAY + "" + ChatColor.BOLD + "MafanaCraft");
        ArrayList<String> lore = new ArrayList<String>();

        ItemStack newItem = new ItemStack(Material.GRAY_STAINED_GLASS_PANE);
        ItemMeta newmeta = newItem.getItemMeta();
        newmeta.setDisplayName(ChatColor.GRAY + "");
        newmeta.setLore(lore);
        newItem.setItemMeta(newmeta);
        for (int emptySlot = 0; emptySlot < GUI.getSize(); emptySlot++) {
            if (GUI.getItem(emptySlot) == null || GUI.getItem(emptySlot).getType().equals(Material.AIR)) {
                GUI.setItem(emptySlot, newItem);
            }
        }

        GUI.setItem(1, null);
        GUI.setItem(2, null);
        GUI.setItem(3, null);

        GUI.setItem(10, null);
        GUI.setItem(11, null);
        GUI.setItem(12, null);

        GUI.setItem(19, null);
        GUI.setItem(20, null);
        GUI.setItem(21, null);

        GUI.setItem(14, null);

        return GUI;
    }

}
