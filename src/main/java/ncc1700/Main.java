package ncc1700;

import ncc1700.Server.Server;
import net.minestom.server.MinecraftServer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Logger.Log(Logger.FAIL, "h");
        Server.serverInit();;
        Server.startServer("0.0.0.0", 25565);
    }
}
