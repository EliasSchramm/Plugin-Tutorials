package de.epsdev.plugins.tutorials.realtime.schedulers;

import org.bukkit.Bukkit;
import org.bukkit.GameRule;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

import java.util.Calendar;
import java.util.Locale;

public class RT_Scheduler {

    private static final float ticksPerMinute = 16.66666666666666666f;

    public static void run(JavaPlugin plugin) {
        BukkitScheduler scheduler = plugin.getServer().getScheduler();
        scheduler.scheduleSyncRepeatingTask(plugin, () -> {
            Calendar now = Calendar.getInstance(Locale.CANADA);
            now.add(Calendar.HOUR_OF_DAY, -6);
            int hour = now.get(Calendar.HOUR_OF_DAY);
            int minute = now.get(Calendar.MINUTE);

            float currentMinuteOfDay = ((hour * 60) + minute);

            Bukkit.getServer().getWorlds().get(0).setTime((long) (currentMinuteOfDay * ticksPerMinute));

            System.out.println("CURR MIN: " + currentMinuteOfDay);
            System.out.println("CALC: " + ((long) (currentMinuteOfDay * ticksPerMinute)));

            System.out.println("18 " + (long) (18*60*ticksPerMinute));



        }, 0L, 20L);
    }
}
