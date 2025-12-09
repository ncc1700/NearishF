package ncc1700.Server.EventHandlers;

import ncc1700.Logger;
import ncc1700.Server.Entities.CursedPlayer;
import ncc1700.Server.Server;
import net.kyori.adventure.text.Component;
import net.minestom.server.advancements.FrameType;
import net.minestom.server.advancements.Notification;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.AsyncPlayerConfigurationEvent;
import net.minestom.server.item.ItemStack;
import net.minestom.server.item.Material;


public class AsyncPlayerConfigEvent {
    public AsyncPlayerConfigEvent(AsyncPlayerConfigurationEvent event){
        Player player = event.getPlayer();
        player.setGameMode(GameMode.SURVIVAL);
        Logger.Log(Logger.PASS, player.getUsername() + " Joined the game");
        event.setSpawningInstance(Server.getInstanceContainer());
        player.setRespawnPoint(new Pos(0, 42, 0));

    }
}
