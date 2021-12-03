package net.alphakun.plugin.quicksleep.events

import net.alphakun.plugin.quicksleep.QuickSleep.Companion.PREFIX_NORMAL
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerBedEnterEvent

class PlayerBedEnter: Listener {

    @EventHandler
    fun playerBedEnter(e: PlayerBedEnterEvent){
        val onlinePlayers : MutableCollection<out Player> = Bukkit.getOnlinePlayers()
        Bukkit.getWorld("world")!!.time = 0
        onlinePlayers.forEach {
            it.sendMessage(PREFIX_NORMAL + "§b" + e.player.name + "§aが就寝したため時刻を朝に変更しました")
        }

    }
}