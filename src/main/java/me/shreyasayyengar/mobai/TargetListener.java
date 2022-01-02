package me.shreyasayyengar.mobai;

import org.bukkit.GameMode;
import org.bukkit.entity.Monster;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

public class TargetListener implements Listener {

    @EventHandler
    private void onTarget(EntityTargetEvent e) {
        if (e.getEntity() instanceof Monster) {
            if (e.getTarget() instanceof Player player) {
                if (player.getGameMode() == GameMode.ADVENTURE) {
                    e.setCancelled(true);
                }
            }
        }
    }
}
