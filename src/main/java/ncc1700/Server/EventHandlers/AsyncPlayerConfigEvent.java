package ncc1700.Server.EventHandlers;

import ncc1700.Logger;
import ncc1700.Server.Entities.CursedAllay;
import ncc1700.Server.Server;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.GameMode;
import net.minestom.server.entity.Player;
import net.minestom.server.event.player.AsyncPlayerConfigurationEvent;

public class AsyncPlayerConfigEvent {
    public AsyncPlayerConfigEvent(AsyncPlayerConfigurationEvent event){
        Player player = event.getPlayer();
        player.setGameMode(GameMode.CREATIVE);
        Logger.Log(Logger.PASS, player.getUsername() + " Joined the game");
        event.setSpawningInstance(Server.getInstanceContainer());
        player.setRespawnPoint(new Pos(0, 42, 0));
        CursedAllay boat = new CursedAllay();
        boat.setInstance(Server.getInstanceContainer(), new Pos(0, 42, 0));
    }
}
