package me.chelsea1124.battlepass.GUI;

import me.chelsea1124.battlepass.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FreeBattlePass {

    public Inventory freebattlepass;

    public void build (Player p) {
        freebattlepass = Bukkit.createInventory(null, 27, "Free Battlepass");

        ItemStack Fill1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 15);
        ItemStack Fill2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte) 8);

        ItemStack Challenges = new ItemStack(Material.COAL_BLOCK);
        ItemMeta ChallengesMata = Challenges.getItemMeta();
        ChallengesMata.setDisplayName(Main.color("&7&lBattlePass Challenges"));
        Challenges.setItemMeta(ChallengesMata);

        ItemStack Rewards = new ItemStack(Material.GOLD_BLOCK);
        ItemMeta RewardsMata = Rewards.getItemMeta();
        RewardsMata.setDisplayName(Main.color("&a&lBattlePass Rewards"));
        Rewards.setItemMeta(RewardsMata);

        freebattlepass.setItem(0, Fill1);
        freebattlepass.setItem(1, Fill1);
        freebattlepass.setItem(2, Fill1);
        freebattlepass.setItem(3, Fill1);
        freebattlepass.setItem(4, Fill1);
        freebattlepass.setItem(5, Fill1);
        freebattlepass.setItem(6, Fill1);
        freebattlepass.setItem(7, Fill1);
        freebattlepass.setItem(8, Fill1);
        freebattlepass.setItem(9, Fill1);
        freebattlepass.setItem(10, Fill1);
        freebattlepass.setItem(11, Fill2);
        freebattlepass.setItem(12, Challenges);
        freebattlepass.setItem(13, Fill2);
        freebattlepass.setItem(14, Rewards);
        freebattlepass.setItem(15, Fill2);
        freebattlepass.setItem(16, Fill1);
        freebattlepass.setItem(17, Fill1);
        freebattlepass.setItem(18, Fill1);
        freebattlepass.setItem(19, Fill1);
        freebattlepass.setItem(20, Fill1);
        freebattlepass.setItem(21, Fill1);
        freebattlepass.setItem(22, Fill1);
        freebattlepass.setItem(23, Fill1);
        freebattlepass.setItem(24, Fill1);
        freebattlepass.setItem(25, Fill1);
        freebattlepass.setItem(26, Fill1);
    }

    public void show(Player p)
    {
        Main.instance.FreePass.put(p, freebattlepass);
        p.openInventory(freebattlepass);
    }
}
