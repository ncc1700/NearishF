package ncc1700.Server.EventHandlers;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.minestom.server.advancements.FrameType;
import net.minestom.server.advancements.Notification;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.PlayerSpawnEvent;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;
import net.minestom.server.scoreboard.Sidebar;

public class PlayerSpawnWorldEvent {
    public PlayerSpawnWorldEvent(PlayerSpawnEvent event){
        Sidebar bar = new Sidebar(Component.text("SENTIENT ARTIFICIAL PLAYER #5739", NamedTextColor.GOLD));
        bar.addViewer(event.getPlayer());
        Notification notif = new Notification(Component.text("SENTIENT ARTIFICIAL PLAYER TEST SERVER"),
                                    FrameType.GOAL, ItemStack.of(Material.PLAYER_HEAD));
        Player player = event.getPlayer();
        player.sendNotification(notif);
    }
}
