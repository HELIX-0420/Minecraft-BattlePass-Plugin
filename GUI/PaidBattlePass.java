package me.chelsea1124.battlepass.GUI;

import me.chelsea1124.battlepass.Main;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PaidBattlePass {

    public Inventory paidbattlepass;

    public void build (Player p) {
        paidbattlepass = Bukkit.createInventory(null, 27, "Paid Battlepass");

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

        paidbattlepass.setItem(0, Fill1);
        paidbattlepass.setItem(1, Fill1);
        paidbattlepass.setItem(2, Fill1);
        paidbattlepass.setItem(3, Fill1);
        paidbattlepass.setItem(4, Fill1);
        paidbattlepass.setItem(5, Fill1);
        paidbattlepass.setItem(6, Fill1);
        paidbattlepass.setItem(7, Fill1);
        paidbattlepass.setItem(8, Fill1);
        paidbattlepass.setItem(9, Fill1);
        paidbattlepass.setItem(10, Fill1);
        paidbattlepass.setItem(11, Fill2);
        paidbattlepass.setItem(12, Challenges);
        paidbattlepass.setItem(13, Fill2);
        paidbattlepass.setItem(14, Rewards);
        paidbattlepass.setItem(15, Fill2);
        paidbattlepass.setItem(16, Fill1);
        paidbattlepass.setItem(17, Fill1);
        paidbattlepass.setItem(18, Fill1);
        paidbattlepass.setItem(19, Fill1);
        paidbattlepass.setItem(20, Fill1);
        paidbattlepass.setItem(21, Fill1);
        paidbattlepass.setItem(22, Fill1);
        paidbattlepass.setItem(23, Fill1);
        paidbattlepass.setItem(24, Fill1);
        paidbattlepass.setItem(25, Fill1);
        paidbattlepass.setItem(26, Fill1);
    }

    public void show(Player p) {
        Main.instance.PaidPass.put(p, paidbattlepass);
        p.openInventory(paidbattlepass);
    }

}
