package org.z4te.reverseSword;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.util.Vector;

import java.util.Objects;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();
        Recipes.init();
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        HandlerList.unregisterAll();
    }

    public static Main getInstance() {
        return getPlugin(Main.class);
    }

    @EventHandler
    public void onPlayerAttack (EntityDamageByEntityEvent event) {
        if (event.getDamager() instanceof Player player) {
            PersistentDataContainer itemContainer = Objects.requireNonNull(player.getInventory().getItemInMainHand().getItemMeta()).getPersistentDataContainer();

            if (checkKeys(itemContainer)) {
                event.setCancelled(true);
                player.damage(event.getDamage());

                Vector knockBack = player.getLocation().getDirection().multiply(-1).setY(0.1);
                player.setVelocity(knockBack);
            }
        }
    }

    private boolean checkKeys(PersistentDataContainer container)  {
        return container.has(Keys.REVERSE_DIAMOND_SWORD)
                || container.has(Keys.REVERSE_GOLDEN_SWORD)
                || container.has(Keys.REVERSE_IRON_SWORD)
                || container.has(Keys.REVERSE_NETHERITE_SWORD)
                || container.has(Keys.REVERSE_STONE_SWORD)
                || container.has(Keys.REVERSE_WOODEN_SWORD);
    }

    @EventHandler
    public void onPlayerDeath (PlayerDeathEvent event) {

    }

}
