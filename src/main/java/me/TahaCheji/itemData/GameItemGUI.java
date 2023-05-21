package me.TahaCheji.itemData;

import dev.triumphteam.gui.builder.item.ItemBuilder;
import dev.triumphteam.gui.guis.Gui;
import dev.triumphteam.gui.guis.GuiItem;
import dev.triumphteam.gui.guis.PaginatedGui;
import me.TahaCheji.Main;
import me.TahaCheji.gameUtil.ItemUtil;
import me.TahaCheji.playerData.GamePlayer;
import net.kyori.adventure.text.Component;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GameItemGUI implements Listener {

    public PaginatedGui getAllItemsGui() {
        PaginatedGui gui = Gui.paginated()
                .title(Component.text(ChatColor.GOLD + "All Game Items"))
                .rows(6)
                .pageSize(54)
                .disableAllInteractions()
                .create();

        List<String> lore = new ArrayList<>();
        ItemStack greystainedglass = new ItemStack(Material.ORANGE_STAINED_GLASS_PANE);
        ItemMeta newmeta = greystainedglass.getItemMeta();
        newmeta.setDisplayName(ChatColor.GRAY + " ");
        newmeta.setLore(lore);
        greystainedglass.setItemMeta(newmeta);

        gui.setItem(0, new GuiItem(greystainedglass));
        gui.setItem(1,new GuiItem(greystainedglass));
        gui.setItem(2,new GuiItem(greystainedglass));
        gui.setItem(3,new GuiItem(greystainedglass));
        gui.setItem(4,new GuiItem(greystainedglass));
        gui.setItem(5,new GuiItem(greystainedglass));
        gui.setItem(6,new GuiItem(greystainedglass));
        gui.setItem(7,new GuiItem(greystainedglass));
        gui.setItem(8,new GuiItem(greystainedglass));
        gui.setItem(17,new GuiItem(greystainedglass));
        gui.setItem(26,new GuiItem(greystainedglass));
        gui.setItem(35,new GuiItem(greystainedglass));
        gui.setItem(45,new GuiItem(greystainedglass));
        gui.setItem(53,new GuiItem(greystainedglass));
        gui.setItem(52,new GuiItem(greystainedglass));
        gui.setItem(51,new GuiItem(greystainedglass));
        gui.setItem(50,new GuiItem(greystainedglass));
        gui.setItem(48,new GuiItem(greystainedglass));
        gui.setItem(47,new GuiItem(greystainedglass));
        gui.setItem(46,new GuiItem(greystainedglass));
        gui.setItem(44,new GuiItem(greystainedglass));
        gui.setItem(36,new GuiItem(greystainedglass));
        gui.setItem(27,new GuiItem(greystainedglass));
        gui.setItem(18,new GuiItem(greystainedglass));
        gui.setItem(9,new GuiItem(greystainedglass));
        gui.setItem(49, new GuiItem(greystainedglass));
        gui.setItem(6, 3, ItemBuilder.from(Material.PAPER).setName(ChatColor.DARK_GRAY + "Previous").asGuiItem(event -> gui.previous()));
        gui.setItem(6, 7, ItemBuilder.from(Material.PAPER).setName(ChatColor.DARK_GRAY + "Next").asGuiItem(event -> gui.next()));
        for(GameWeapons masterItems : Main.getInstance().getGameWeapons()) {
            ItemStack itemStack = masterItems.getGameWeapon();
            ItemMeta itemMeta = itemStack.getItemMeta();
            List<String> itemLore = new ArrayList<>();
            if(itemMeta.getLore() != null) {
                for (String string : itemMeta.getLore()) {
                    itemLore.add(string);
                }
            }
            itemLore.add("");
            itemLore.add(ChatColor.GOLD + "Click To Get This Item");
            itemMeta.setLore(itemLore);
            itemStack.setItemMeta(itemMeta);
            gui.addItem(new GuiItem(itemStack));
        }
        for(GameArmor gameArmor : Main.getInstance().getGameArmors()) {
            ItemStack itemStack = gameArmor.getGameArmor();
            ItemMeta itemMeta = itemStack.getItemMeta();
            List<String> itemLore = new ArrayList<>();
            if(itemMeta.getLore() != null) {
                for (String string : itemMeta.getLore()) {
                    itemLore.add(string);
                }
            }
            itemLore.add("");
            itemLore.add(ChatColor.GOLD + "Click To Get This Item");
            itemMeta.setLore(itemLore);
            itemStack.setItemMeta(itemMeta);
            gui.addItem(new GuiItem(itemStack));
        }
        for(GameSpell gameSpell : Main.getInstance().getGameSpells()) {
            ItemStack itemStack = gameSpell.getGameSpell();
            ItemMeta itemMeta = itemStack.getItemMeta();
            List<String> itemLore = new ArrayList<>();
            if(itemMeta.getLore() != null) {
                for (String string : itemMeta.getLore()) {
                    itemLore.add(string);
                }
            }
            itemLore.add("");
            itemLore.add(ChatColor.GOLD + "Click To Get This Item");
            itemMeta.setLore(itemLore);
            itemStack.setItemMeta(itemMeta);
            gui.addItem(new GuiItem(itemStack));
        }
        for(GameStaff gameStaff : Main.getInstance().getGameStaffs()) {
            ItemStack itemStack = gameStaff.getGameStaff();
            ItemMeta itemMeta = itemStack.getItemMeta();
            List<String> itemLore = new ArrayList<>();
            if(itemMeta.getLore() != null) {
                for (String string : itemMeta.getLore()) {
                    itemLore.add(string);
                }
            }
            itemLore.add("");
            itemLore.add(ChatColor.GOLD + "Click To Get This Item");
            itemMeta.setLore(itemLore);
            itemStack.setItemMeta(itemMeta);
            gui.addItem(new GuiItem(itemStack));
        }
        for(GameBow gameBow : Main.getInstance().getGameBow()) {
            ItemStack itemStack = gameBow.getGameBow();
            ItemMeta itemMeta = itemStack.getItemMeta();
            List<String> itemLore = new ArrayList<>();
            if(itemMeta.getLore() != null) {
                for (String string : itemMeta.getLore()) {
                    itemLore.add(string);
                }
            }
            itemLore.add("");
            itemLore.add(ChatColor.GOLD + "Click To Get This Item");
            itemMeta.setLore(itemLore);
            itemStack.setItemMeta(itemMeta);
            gui.addItem(new GuiItem(itemStack));
        }
        return gui;
    }

    @EventHandler
    public void onItemClick(InventoryClickEvent event) {
        if(!event.getView().getTitle().contains("All Game Items")) {
            return;
        }
        event.setCancelled(true);
        if(event.getCurrentItem() == null) {
            return;
        }
        if(event.getCurrentItem().getItemMeta() == null) {
            return;
        }
        if(event.getCurrentItem().getType() == Material.GRAY_STAINED_GLASS_PANE || event.getCurrentItem().getType() == Material.PAPER) {
            return;
        }
        Player player = (Player) event.getWhoClicked();
        for(GameItem gameItem : Main.getInstance().getGameItems()) {
            if(gameItem.getUUID() == ItemUtil.getIntFromItem(event.getCurrentItem(), "GameItemUUID")) {
                if(gameItem instanceof GameWeapons) {
                    player.getInventory().addItem(((GameWeapons) gameItem).getGameWeapon());
                }
                if(gameItem instanceof GameBow) {
                    player.getInventory().addItem(((GameBow ) gameItem).getGameBow());
                }
                if(gameItem instanceof GameStaff) {
                    player.getInventory().addItem(((GameStaff) gameItem).getGameStaff());
                }
                if(gameItem instanceof GameSpell) {
                    player.getInventory().addItem(((GameSpell) gameItem).getGameSpell());
                }
                if(gameItem instanceof GameArmor) {
                    player.getInventory().addItem(((GameArmor) gameItem).getGameArmor());
                }
            }
        }
    }
}