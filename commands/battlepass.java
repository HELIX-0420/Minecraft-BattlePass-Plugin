package me.chelsea1124.battlepass.commands;

import me.chelsea1124.battlepass.GUI.FreeBattlePass;
import me.chelsea1124.battlepass.GUI.FreeBattlePassChallanges;
import me.chelsea1124.battlepass.GUI.PaidBattlePass;
import me.chelsea1124.battlepass.GUI.PaidBattlePassChallanges;
import me.chelsea1124.battlepass.Main;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class battlepass implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        if(sender instanceof Player) {
            Player p = (Player) sender;

            if (cmd.getName().equalsIgnoreCase("battlepass")) {
                p.openInventory(Main.instance.menuInventory);
            }

            return true;
        }
        return false;
    }

    @EventHandler
    public void onInvClick(InventoryClickEvent e) {
        Player p = (Player)e.getWhoClicked();

        if(e.getClickedInventory() == null) {
            return;
        }

        // If user clicked on Main Menu Inv
        if (e.getClickedInventory().equals(Main.instance.menuInventory)) {

            e.setCancelled(true);

            if (e.getCurrentItem().getType() == (Material.CHEST)){

                if (p.hasPermission("battlepass.free")) {
                    p.sendMessage("You dont have the right perms");
                }

                if (!Main.instance.FreePass.containsKey(p)) {

                    FreeBattlePass freeBattlePass = new FreeBattlePass();
                    freeBattlePass.build(p);
                    freeBattlePass.show(p);

                }

            }

            if (e.getCurrentItem().getType() == (Material.SIGN)){
                p.sendMessage("link");
            }

            if (e.getCurrentItem().getType() == (Material.ENDER_CHEST)){

                if (!Main.instance.PaidPass.containsKey(p)) {

                    PaidBattlePass paidbattlepass = new PaidBattlePass();
                    paidbattlepass.build(p);
                    paidbattlepass.show(p);

                }

            }
        }

        if(Main.instance.FreePass.containsKey(p)) {

            if (e.getClickedInventory().equals(Main.instance.FreePass.get(p))) {
                e.setCancelled(true);

                if (e.getCurrentItem().getType() == (Material.COAL_BLOCK)){

                    if (Main.instance.FreePass.containsKey(p)) {

                        FreeBattlePassChallanges freeBattlePassChallanges = new FreeBattlePassChallanges();
                        freeBattlePassChallanges.build(p);
                        freeBattlePassChallanges.show(p);

                    }
                }

            }

        }

        // If user clicked on paid pass inventory
        if(Main.instance.PaidPass.containsKey(p)) {

            if(e.getClickedInventory().equals(Main.instance.PaidPass.get(p))) {
                e.setCancelled(true);

                if (e.getCurrentItem().getType() == (Material.COAL_BLOCK)){

                    if (Main.instance.PaidPass.containsKey(p)) {

                        PaidBattlePassChallanges paidBattlePassChallanges = new PaidBattlePassChallanges();
                        paidBattlePassChallanges.build(p);
                        paidBattlePassChallanges.show(p);

                    }
                }

            }
        }

        if (Main.instance.FreeChallanges.containsKey(p)) {

            if (e.getClickedInventory().equals(Main.instance.FreeChallanges.get(p))) {
                e.setCancelled(true);
            }

        }

        if (Main.instance.PaidChallanges.containsKey(p)) {

            if (e.getClickedInventory().equals(Main.instance.PaidChallanges.get(p))) {
                e.setCancelled(true);
            }

        }

    }

}
