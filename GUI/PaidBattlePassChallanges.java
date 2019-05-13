package me.chelsea1124.battlepass.GUI;

import me.chelsea1124.battlepass.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PaidBattlePassChallanges {

    public Inventory PaidBattlePassChallanges;

    public void build (Player p) {

        PaidBattlePassChallanges = Bukkit.createInventory(null, 54, Main.color("&e&lChallenges"));

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



        for(int i = 0; i < 54; i++) PaidBattlePassChallanges.setItem(i, Fill1);

        PaidBattlePassChallanges.setItem(1, AmountOfBlocksMind);
        PaidBattlePassChallanges.setItem(2, AmountOfBlocksShoveld);
        PaidBattlePassChallanges.setItem(3, AmountOfWoodCut);
        PaidBattlePassChallanges.setItem(4, AmountOfPlayersKilled);
        PaidBattlePassChallanges.setItem(5, AmountOfCowsKilled);
        PaidBattlePassChallanges.setItem(6, AmountOfZombiesKilled);
        PaidBattlePassChallanges.setItem(7, AmountOfSkeletonsKilled);
        PaidBattlePassChallanges.setItem(45, Page);
        PaidBattlePassChallanges.setItem(53, Page);

    }

    public void show(Player p) {
        Main.instance.PaidChallanges.put(p, PaidBattlePassChallanges);
        p.openInventory(PaidBattlePassChallanges);
    }


}
