package me.umbreon.antifrostwalker.event;

import org.bukkit.Material;
import org.bukkit.block.BlockState;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.EntityBlockFormEvent;

public class EntityBlockForm implements Listener {

    @EventHandler
    public void onEntityBlockFormEvent(EntityBlockFormEvent event) {
        BlockState blockState = event.getNewState();

        if (blockState.getType() == Material.FROSTED_ICE) {
            event.setCancelled(true);
        }

    }
}
