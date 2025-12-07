package ncc1700.Server.EventHandlers;

import ncc1700.Server.ChatColor;
import net.kyori.adventure.text.Component;
import net.minestom.server.event.server.ServerListPingEvent;
import net.minestom.server.ping.Status;

public class ServerListEvent {
    public ServerListEvent(ServerListPingEvent event){
        Status status = new Status(
                    Component.text(ChatColor.BLACK + ChatColor.CURSED + "test server"),
                new byte[10], Status.VersionInfo.DEFAULT,
                null, true);
        event.setStatus(status);
    }
}
