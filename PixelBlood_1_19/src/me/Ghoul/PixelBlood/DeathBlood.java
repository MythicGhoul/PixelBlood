package me.Ghoul.PixelBlood;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Effect;
import org.bukkit.FireworkEffect;
import org.bukkit.FireworkEffect.Type;
import org.bukkit.Material;
import org.bukkit.entity.ElderGuardian;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class DeathBlood implements Listener {

	Main plugin;

	public DeathBlood(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onDeathEvent(EntityDeathEvent e) {

		LivingEntity p = e.getEntity();

		if (this.plugin.getConfig().getBoolean("BloodSpray") == true) {
			final Firework f = (Firework) p.getWorld().spawn(p.getLocation(), Firework.class);

			FireworkMeta fm = f.getFireworkMeta();

			fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST).withColor(Color.RED)
					.withFade(Color.RED).build());

			fm.setPower(0);

			f.setFireworkMeta(fm);

			Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

				public void run() {

					f.detonate();

				}

			}, 1 * 1);

		}
	}

	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {
		if ((event.getDamager() instanceof Firework)) {
			event.setCancelled(true);
		}
	}

	@EventHandler
	public void onEnderDragonDeath(EntityDeathEvent e) {

		if (this.plugin.getConfig().getBoolean("Boss-Mobs.Enabled") == true) {
			if (e.getEntity() instanceof EnderDragon) {
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.PURPLE_CONCRETE);
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.OBSIDIAN);
				return;

			}
		}
		if (this.plugin.getConfig().getBoolean("BloodSpray") == true) {
			if (e.getEntity() instanceof EnderDragon) {
				final Firework f = (Firework) e.getEntity().getWorld().spawn(e.getEntity().getLocation(),
						Firework.class);

				FireworkMeta fm = f.getFireworkMeta();

				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST)
						.withColor(Color.FUCHSIA).withFade(Color.PURPLE).build());
				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST)
						.withColor(Color.PURPLE).withFade(Color.FUCHSIA).build());

				fm.setPower(0);

				f.setFireworkMeta(fm);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

					public void run() {

						f.detonate();

					}

				}, 1 * 1);

			}
		}
	}

	@EventHandler
	public void onWitherDeath(EntityDeathEvent e) {

		if (this.plugin.getConfig().getBoolean("Boss-Mobs.Enabled") == true) {
			if (e.getEntity() instanceof Wither) {
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.SOUL_SAND);
				return;

			}
		}
		if (this.plugin.getConfig().getBoolean("BloodSpray") == true) {
			if (e.getEntity() instanceof Wither) {
				final Firework f = (Firework) e.getEntity().getWorld().spawn(e.getEntity().getLocation(),
						Firework.class);

				FireworkMeta fm = f.getFireworkMeta();

				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST).withColor(Color.GRAY)
						.withFade(Color.BLACK).build());
				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST).withColor(Color.BLACK)
						.withFade(Color.GRAY).build());

				fm.setPower(0);

				f.setFireworkMeta(fm);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

					public void run() {

						f.detonate();

					}

				}, 1 * 1);

			}
		}

	}

	@EventHandler
	public void onElderGaurdianDeath(EntityDeathEvent e) {

		if (this.plugin.getConfig().getBoolean("Boss-Mobs.Enabled") == true) {
			if (e.getEntity() instanceof ElderGuardian) {
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.REDSTONE_BLOCK);
				return;

			}
		}
		if (this.plugin.getConfig().getBoolean("BloodSpray") == true) {
			if (e.getEntity() instanceof ElderGuardian) {
				final Firework f = (Firework) e.getEntity().getWorld().spawn(e.getEntity().getLocation(),
						Firework.class);

				FireworkMeta fm = f.getFireworkMeta();

				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST).withColor(Color.RED)
						.withFade(Color.RED).build());
				fm.addEffect(FireworkEffect.builder().flicker(false).trail(true).with(Type.BURST).withColor(Color.RED)
						.withFade(Color.RED).build());

				fm.setPower(0);

				f.setFireworkMeta(fm);

				Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

					public void run() {

						f.detonate();

					}

				}, 1 * 1);

			}
		}
	}

}
