package net.alphakun.plugin.quicksleep

import net.alphakun.plugin.quicksleep.events.PlayerBedEnter
import org.bukkit.plugin.java.JavaPlugin

class QuickSleep : JavaPlugin() {
    override fun onEnable() {
        loadConfig()
        generateEvents()
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }

    fun loadConfig() {
        saveDefaultConfig()
        PREFIX_NORMAL = getConfig().getString("prefix.normal")!!
    }

    fun generateEvents() {
        server.pluginManager.registerEvents(PlayerBedEnter(), this)
    }

    companion object {
        lateinit var PREFIX_NORMAL: String
    }
}