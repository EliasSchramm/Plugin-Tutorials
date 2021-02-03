package de.epsdev.plugins.tutorials.realtime;

import de.epsdev.plugins.tutorials.realtime.schedulers.RT_Scheduler;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;

public final class RealTime extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getWorld("world").setGameRule(GameRule.DO_DAYLIGHT_CYCLE, false);

        RT_Scheduler.run(this);
    }

    @Override
    public void onDisable() {

    }
}
