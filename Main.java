package me.chelsea1124.battlepass;

import me.chelsea1124.battlepass.commands.battlepass;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main extends JavaPlugin implements Listener {

    public static Main instance;
    public HashMap<Player, Inventory> FreePass = new HashMap<Player, Inventory>();
    public HashMap<Player, Inventory> PaidPass = new HashMap<Player, Inventory>();
    public HashMap<Player, Inventory> FreeChallanges = new HashMap<Player, Inventory>();
    public HashMap<Player, Inventory> PaidChallanges = new HashMap<Player, Inventory>();
    public Inventory menuInventory;
    public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

    public void onEnable() {

        instance = this;

        Bukkit.getConsoleSender().sendMessage(color("&7============================================="));
        Bukkit.getConsoleSender().sendMessage(color("&eBattlePass &7: &a1&7.&a0"));
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(color("&eMade by &7: &eChelsea1124&7/&eHELIX"));
        Bukkit.getConsoleSender().sendMessage("");
        Bukkit.getConsoleSender().sendMessage(color("&eVersion &7: &a1&7.&a8&e+"));
        Bukkit.getConsoleSender().sendMessage(color("&7============================================="));

        battlepass bp = new battlepass();
        getCommand("battlepass").setExecutor(bp);
        Bukkit.getServer().getPluginManager().registerEvents(bp, this);

        Bukkit.getServer().getPluginManager().registerEvents(this, this);

        createMenu();
    }

    public void createMenu() {
        menuInventory = Bukkit.createInventory(null, 27, "Menu");
        ItemStack Fill1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
        ItemStack Fill2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);

        ItemStack FreePass = new ItemStack(Material.CHEST);
        ItemMeta FreePassMeta = FreePass.getItemMeta();
        FreePassMeta.setDisplayName(Main.color("&7&lFree BattlePass"));
        FreePass.setItemMeta(FreePassMeta);

        ItemStack Info = new ItemStack(Material.SIGN);
        ItemMeta InfoMeta = Info.getItemMeta();
        InfoMeta.setDisplayName(Main.color("&b&lBattlePass Info"));
        List InfoLore = new ArrayList();
        InfoMeta.setLore(InfoLore);
        Info.setItemMeta(InfoMeta);

        ItemStack PaidPass = new ItemStack(Material.ENDER_CHEST);
        ItemMeta PaidPassMeta = PaidPass.getItemMeta();
        PaidPassMeta.setDisplayName(Main.color("&c&lPaid BattlePass"));
        PaidPass.setItemMeta(PaidPassMeta);


        for(int i = 0; i < 27; i++) // Fill all with Fill1
            menuInventory.setItem(i, Fill1);

        for(int i = 10; i < 17; i++) // Fill spot 10 - 16 with Fill2
            menuInventory.setItem(i, Fill2);

        menuInventory.setItem(11, FreePass);

        menuInventory.setItem(13, Info);

        menuInventory.setItem(15, PaidPass);
    }
}
