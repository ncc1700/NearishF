package ncc1700.Server;

import ncc1700.Logger;
import ncc1700.Server.EventHandlers.AsyncPlayerConfigEvent;
import ncc1700.Server.EventHandlers.PlayerBreakBlockEvent;
import ncc1700.Server.EventHandlers.ServerListEvent;
import net.minestom.server.MinecraftServer;
import net.minestom.server.event.GlobalEventHandler;
import net.minestom.server.event.player.AsyncPlayerConfigurationEvent;
import net.minestom.server.event.player.PlayerBlockBreakEvent;
import net.minestom.server.event.server.ServerListPingEvent;
import net.minestom.server.instance.InstanceContainer;
import net.minestom.server.instance.InstanceManager;

public class Server {
    private static MinecraftServer server;
    private static InstanceManager instanceMgr;
    private static InstanceContainer instanceCnter;
    private static GlobalEventHandler gEventHandler;

    public static void serverInit(){
        server = MinecraftServer.init();
        instanceMgr = MinecraftServer.getInstanceManager();
        instanceCnter = instanceMgr.createInstanceContainer();
        instanceCnter.setGenerator(new ChunkGen());
        gEventHandler = MinecraftServer.getGlobalEventHandler();
        gEventHandler.addListener(AsyncPlayerConfigurationEvent.class, AsyncPlayerConfigEvent::new);
        gEventHandler.addListener(ServerListPingEvent.class, ServerListEvent::new);
        gEventHandler.addListener(PlayerBlockBreakEvent.class, PlayerBreakBlockEvent::new);
    }
    public static MinecraftServer getMCServer(){
        return server;
    }
    public static InstanceManager getInstanceManager(){
        return instanceMgr;
    }

    public static InstanceContainer getInstanceContainer(){
        return instanceCnter;
    }

    public static GlobalEventHandler getGlobalEventHandler(){
        return gEventHandler;
    }

    public static void startServer(String ip, int port){
        server.start(ip, port);
    }
}
