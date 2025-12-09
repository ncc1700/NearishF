package ncc1700.Server.EventHandlers;

import net.minestom.server.entity.PlayerSkin;
import net.minestom.server.event.player.PlayerSkinInitEvent;

public class PlayerSkinSetupEvent {
    public PlayerSkinSetupEvent(PlayerSkinInitEvent event){
        PlayerSkin skin = PlayerSkin.fromUsername("KiSystemService");
        event.setSkin(skin);
    }
}
