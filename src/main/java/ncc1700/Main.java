package ncc1700;

import ncc1700.Server.Server;
import net.minestom.server.MinecraftServer;



public class Main {
    static void main(String[] args) {
        //Logger.Log(Logger.FAIL, "h");
        Server.serverInit();;
        Server.startServer("0.0.0.0", 25565);
    }
}
