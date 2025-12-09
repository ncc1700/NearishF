package ncc1700.Server.EventHandlers;

import ncc1700.Server.Entities.CursedPlayer;
import ncc1700.Server.Server;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.event.player.PlayerChangeHeldSlotEvent;

public class PlayerChangeSlotEvent {
    public PlayerChangeSlotEvent(PlayerChangeHeldSlotEvent event){
        CursedPlayer cPlayer = new CursedPlayer();
        cPlayer.setInstance(Server.getInstanceContainer(),
                new Pos(event.getPlayer().getPosition().x() + 10,
                        event.getPlayer().getPosition().y() + 10,
                        event.getPlayer().getPosition().z() + 10));
    }
}
