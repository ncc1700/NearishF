package ncc1700.Server.EventHandlers;

import ncc1700.Server.Entities.CursedBoss;
import ncc1700.Server.Server;
import net.kyori.adventure.text.Component;
import net.minestom.server.advancements.FrameType;
import net.minestom.server.advancements.Notification;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.PlayerEntityInteractEvent;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.inventory.InventoryType;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;
import net.minestom.server.scoreboard.Sidebar;

public class PlayerEntityInterEvent {
    public PlayerEntityInterEvent(PlayerEntityInteractEvent event){
        Notification notif = new Notification(Component.text("BROKE RULE, WATCHDOG SENT"),
                FrameType.CHALLENGE, ItemStack.of(Material.PLAYER_HEAD));
        Player player = event.getPlayer();
        player.sendNotification(notif);
        CursedBoss boss = new CursedBoss();
        boss.setInstance(Server.getInstanceContainer(), player.getPosition().add(10.0));
        //event.getPlayer().openInventory(new Inventory(InventoryType.BEACON, "DO NOT INTERACT WITH ENTITIES"));
        //event.getEntity().kill();
    }
}
