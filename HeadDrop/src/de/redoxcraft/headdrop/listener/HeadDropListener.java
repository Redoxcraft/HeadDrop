package de.redoxcraft.headdrop.listener;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class HeadDropListener implements Listener {

	@EventHandler
	public void onHeadDrop(PlayerDeathEvent e) {
		Player p = e.getEntity();
		if(p.getKiller() == null) {
			return;
		}else {
			int randomHead = (int) (Math.random()*(100));
			if(randomHead == 13) {
				ItemStack head = new ItemStack(Material.PLAYER_HEAD);
				SkullMeta headmeta = (SkullMeta) head.getItemMeta();
				headmeta.setDisplayName(ChatColor.RESET + p.getName() + "'s Kopf");
				headmeta.setOwningPlayer(p);
				head.setItemMeta(headmeta);
				e.getDrops().add(head);
				p.getKiller().sendMessage("Der Spieler " + p.getName() + " hat seinen Kopf fallen gelassen." + ChatColor.LIGHT_PURPLE + "" + ChatColor.ITALIC + " *Ein sauberer Schnitt trennt den Kopf vom Körper!*");
				return;
			}return;
		}
	}
	
}
