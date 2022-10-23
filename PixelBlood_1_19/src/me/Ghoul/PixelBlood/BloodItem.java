package me.Ghoul.PixelBlood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class BloodItem implements Listener {

	Main plugin;

	public BloodItem(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	private HashMap<UUID, Long> cooldown = new HashMap<UUID, Long>();
	public String prefix = ChatColor.WHITE + "[" + ChatColor.AQUA + "Pb" + ChatColor.WHITE + "]";

	@EventHandler
	public void onDeathDrop(EntityDeathEvent e) {
		double r = Math.random();

		if (r <= plugin.getConfig().getDouble("BloodDrop.Chance")) {

			ItemStack is = new ItemStack(Material.REDSTONE);
			ItemMeta im = is.getItemMeta();
			im.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Blood Sack");
			ArrayList<String> Lore = new ArrayList<String>();
			Lore.add(ChatColor.AQUA + "Right Click To Rejuvenate");
			Lore.add(ChatColor.AQUA + "Your Health By 5");
			im.setLore(Lore);
			im.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			is.setItemMeta(im);
			e.getDrops().add(is);
			return;
		}
	}

	@EventHandler
	public void onDeathDrop2(EntityDeathEvent e) {
		double r2 = Math.random();

		if (r2 <= 0.010) {
			ItemStack is2 = new ItemStack(Material.GLOWSTONE_DUST);
			ItemMeta im2 = is2.getItemMeta();
			im2.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack");
			ArrayList<String> Lore2 = new ArrayList<String>();
			Lore2.add(ChatColor.AQUA + "Right Click To Rejuvenate");
			Lore2.add(ChatColor.AQUA + "Your Health And Give You Strength!");
			im2.setLore(Lore2);
			im2.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
			im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			is2.setItemMeta(im2);
			e.getDrops().add(is2);
			return;
		}
	}

	@EventHandler
	public void onBloodTouch(PlayerInteractEvent e) {
		Action a = e.getAction();
		Player p = e.getPlayer();

		if (a.equals(Action.RIGHT_CLICK_AIR)) {
			if (p.getInventory().getItemInMainHand().getType().equals(Material.REDSTONE)) {
				if ((p.getInventory().getItemInMainHand().getItemMeta().getLore()
						.contains(ChatColor.AQUA + "Right Click To Rejuvenate") && (p.hasPermission("pb.heal")))) {
					if (p.getHealth() == p.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()) {
						p.spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 100, 1.0D, 1.0D, 1.0D, 0.5D);
						p.sendMessage(prefix + " " + ChatColor.GREEN + "Your Health Is Full!");
						return;
					}
					p.spawnParticle(Particle.VILLAGER_HAPPY, p.getLocation(), 100, 1.0D, 1.0D, 1.0D, 5.0D);
					p.setHealth(Math.min(20.0D, p.getHealth() + 5.0D));
					p.getInventory().getItemInMainHand()
							.setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
					p.sendMessage(prefix + " " + ChatColor.GREEN + "You Drank The Blood And Felt Like New!");
					return;
				}
			}
		}

		if (a.equals(Action.RIGHT_CLICK_AIR)) {
			if (p.getInventory().getItemInMainHand().getType().equals(Material.GLOWSTONE_DUST)) {
				if ((this.cooldown.containsKey(p.getUniqueId()))
						&& (((Long) this.cooldown.get(p.getUniqueId())).longValue() > System.currentTimeMillis())) {
					e.setCancelled(true);
					Long remainingTime = Long.valueOf(
							((Long) this.cooldown.get(p.getUniqueId())).longValue() - System.currentTimeMillis());

					p.sendMessage(prefix + " " + ChatColor.GOLD + "You Must Wait" + " " + ChatColor.AQUA
							+ remainingTime.longValue() / 1000L + " " + ChatColor.GOLD + "Seconds");
					p.spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 100, 1.0D, 1.0D, 1.0D, 0.5D);
					return;
				}
				this.cooldown.put(p.getUniqueId(), Long.valueOf(
						System.currentTimeMillis() + this.plugin.getConfig().getInt("Mob-Blood.CoolDown", 15) * 1000));
				p.spawnParticle(Particle.VILLAGER_HAPPY, p.getLocation(), 100, 1.0D, 1.0D, 1.0D, 5.0D);
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 500, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 500, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 500, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.DAMAGE_RESISTANCE, 500, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 500, 2));
				p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 500, 2));
				p.getInventory().getItemInMainHand().setAmount(p.getInventory().getItemInMainHand().getAmount() - 1);
				p.sendMessage(prefix + " " + ChatColor.GREEN + "For" + " " + ChatColor.GOLD + "25s" + " "
						+ ChatColor.GREEN + "Your As Strong As An Ender Dragon!");
				return;
			}

		}
	}
}
