package me.chelsea1124.battlepass.GUI;

import me.chelsea1124.battlepass.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FreeBattlePassChallanges {

    public Inventory FreeBattlePassChallanges;

    public void build (Player p) {

        FreeBattlePassChallanges = Bukkit.createInventory(null, 54, Main.color("&c&lChallenges"));

        ItemStack Fill1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
        ItemStack Page = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 3);

        ItemStack AmountOfBlocksMind = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta AmountOfBlocksMindMeta = AmountOfBlocksMind.getItemMeta();
        AmountOfBlocksMindMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfBlocksMind.setItemMeta(AmountOfBlocksMindMeta);

        ItemStack AmountOfBlocksShoveld = new ItemStack(Material.DIAMOND_SPADE);
        ItemMeta AmountOfBlocksShoveldMeta = AmountOfBlocksShoveld.getItemMeta();
        AmountOfBlocksShoveldMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfBlocksShoveld.setItemMeta(AmountOfBlocksShoveldMeta);

        ItemStack AmountOfWoodCut = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta AmountOfWoodCutMeta = AmountOfWoodCut.getItemMeta();
        AmountOfWoodCutMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfWoodCut.setItemMeta(AmountOfBlocksShoveldMeta);

        ItemStack AmountOfPlayersKilled = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta AmountOfPlayersKilledMeta = AmountOfPlayersKilled.getItemMeta();
        AmountOfPlayersKilledMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfPlayersKilled.setItemMeta(AmountOfPlayersKilledMeta);

        ItemStack AmountOfCowsKilled = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.CREEPER.ordinal());
        ItemMeta AmountOfCowsKilledMeta = AmountOfCowsKilled.getItemMeta();
        AmountOfCowsKilledMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfCowsKilled.setItemMeta(AmountOfCowsKilledMeta);

        ItemStack AmountOfZombiesKilled = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.ZOMBIE.ordinal());
        ItemMeta AmountOfZombiesKilledMeta = AmountOfZombiesKilled.getItemMeta();
        AmountOfZombiesKilledMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfZombiesKilled.setItemMeta(AmountOfZombiesKilledMeta);

        ItemStack AmountOfSkeletonsKilled = new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.SKELETON.ordinal());
        ItemMeta AmountOfSkeletonsKilledMeta = AmountOfSkeletonsKilled.getItemMeta();
        AmountOfSkeletonsKilledMeta.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        AmountOfSkeletonsKilled.setItemMeta(AmountOfSkeletonsKilledMeta);



        for(int i = 0; i < 54; i++) FreeBattlePassChallanges.setItem(i, Fill1);

        FreeBattlePassChallanges.setItem(1, AmountOfBlocksMind);
        FreeBattlePassChallanges.setItem(2, AmountOfBlocksShoveld);
        FreeBattlePassChallanges.setItem(3, AmountOfWoodCut);
        FreeBattlePassChallanges.setItem(4, AmountOfPlayersKilled);
        FreeBattlePassChallanges.setItem(5, AmountOfCowsKilled);
        FreeBattlePassChallanges.setItem(6, AmountOfZombiesKilled);
        FreeBattlePassChallanges.setItem(7, AmountOfSkeletonsKilled);
        FreeBattlePassChallanges.setItem(45, Page);
        FreeBattlePassChallanges.setItem(53, Page);

    }

    public void show(Player p) {
        Main.instance.FreeChallanges.put(p, FreeBattlePassChallanges);
        p.openInventory(FreeBattlePassChallanges);
    }

}
