package plugin.plugin.events;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import plugin.plugin.items.ItemManager;

public class ItemEvents implements Listener {

    @EventHandler
    public static void onRightClick(PlayerInteractEvent event) {
        if (event.getItem() != null) {
            if (event.getItem().getItemMeta().equals(ItemManager.scythe.getItemMeta())) {
                Player player = event.getPlayer();
                player.getWorld().spawnEntity(player.getLocation(), EntityType.DRAGON_FIREBALL);
            }
        }
    }
}
