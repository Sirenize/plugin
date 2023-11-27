package plugin.plugin.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class DeathEvents implements Listener {

    @EventHandler
    public void entityDeathEvent(EntityDeathEvent event) {
        if (event.getEntityType().equals(EntityType.ENDER_DRAGON)) {
            EnderDragon enderDragon = (EnderDragon) event.getEntity();
            
            if (isDragonPreviouslyKilled(enderDragon)) {
                Bukkit.broadcastMessage("Dragon is dead!");
            } else {
                //
            }
        }
    }

    private boolean isDragonPreviouslyKilled(EnderDragon enderDragon) {
        // Use DragonBattle interface's hasBeenPreviouslyKilled method
        return enderDragon.getDragonBattle() != null && enderDragon.getDragonBattle().hasBeenPreviouslyKilled();
    }
}
