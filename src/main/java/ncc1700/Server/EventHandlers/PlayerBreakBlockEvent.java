package ncc1700.Server.EventHandlers;

import net.kyori.adventure.text.Component;
import net.minestom.server.dialog.Dialog;
import net.minestom.server.dialog.DialogActionButton;
import net.minestom.server.dialog.DialogAfterAction;
import net.minestom.server.dialog.DialogMetadata;
import net.minestom.server.event.player.PlayerBlockBreakEvent;
import net.minestom.server.inventory.Inventory;
import net.minestom.server.inventory.InventoryType;
import net.minestom.server.item.ItemStack;

import java.util.List;

public class PlayerBreakBlockEvent {
    public PlayerBreakBlockEvent(PlayerBlockBreakEvent event){
        //event.getPlayer().openInventory(new Inventory(InventoryType.CHEST_1_ROW, "TEST"));
    }
}
