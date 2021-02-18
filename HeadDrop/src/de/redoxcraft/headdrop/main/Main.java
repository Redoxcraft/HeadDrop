package de.redoxcraft.headdrop.main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import de.redoxcraft.headdrop.listener.HeadDropListener;

public class Main extends JavaPlugin {

	public void onEnable() {
		System.out.println(this.getDescription().getName() + " " + this.getDescription().getVersion() + " geladen.");
		
		PluginManager PluginManager = Bukkit.getPluginManager();
		PluginManager.registerEvents(new HeadDropListener(), this);
	}
	
}
