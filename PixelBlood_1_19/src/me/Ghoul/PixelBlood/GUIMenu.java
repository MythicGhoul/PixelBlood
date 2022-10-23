package me.Ghoul.PixelBlood;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class GUIMenu implements Listener {

	public static Inventory gui;
	public static Inventory gui2;

	static Main plugin;

	public GUIMenu(Main plugin) {
		GUIMenu.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	private String prefix = ChatColor.WHITE + "[" + ChatColor.AQUA + "Pb" + ChatColor.WHITE + "]";

	public static void openGUI(Player p) {
		gui = Bukkit.createInventory(null, 27,
				ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "PixelBlood" + " " + ChatColor.GOLD + "Admin Pannel");

		ItemStack is = new ItemStack(Material.DIAMOND);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.AQUA + ChatColor.BOLD + "Player");
		ArrayList<String> Lore = new ArrayList<String>();
		Lore.add(ChatColor.AQUA + "Click To Toggle");
		im.setLore(Lore);
		im.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is.setItemMeta(im);

		gui.setItem(0, is);

		ItemStack is8 = new ItemStack(Material.REDSTONE);
		ItemMeta im8 = is8.getItemMeta();
		im8.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.AQUA + ChatColor.BOLD + "Spray");
		ArrayList<String> Lore8 = new ArrayList<String>();
		Lore8.add(ChatColor.AQUA + "Click To Toggle");
		im8.setLore(Lore8);
		im8.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im8.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im8.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is8.setItemMeta(im8);

		gui.setItem(11, is8);

		ItemStack is7 = new ItemStack(Material.ENDER_PEARL);
		ItemMeta im7 = is7.getItemMeta();
		im7.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Boss");
		ArrayList<String> Lore7 = new ArrayList<String>();
		Lore7.add(ChatColor.AQUA + "Click To Toggle");
		im7.setLore(Lore7);
		im7.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im7.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im7.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is7.setItemMeta(im7);

		gui.setItem(1, is7);

		ItemStack is2 = new ItemStack(Material.PORKCHOP);
		ItemMeta im2 = is2.getItemMeta();
		im2.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.GREEN + ChatColor.BOLD + "Passive");
		ArrayList<String> Lore2 = new ArrayList<String>();
		Lore2.add(ChatColor.AQUA + "Click To Toggle");
		im2.setLore(Lore2);
		im2.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is2.setItemMeta(im2);

		gui.setItem(2, is2);

		ItemStack is3 = new ItemStack(Material.POPPY);
		ItemMeta im3 = is3.getItemMeta();
		im3.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.YELLOW + ChatColor.BOLD + "Neutral");
		ArrayList<String> Lore3 = new ArrayList<String>();
		Lore3.add(ChatColor.AQUA + "Click To Toggle");
		im3.setLore(Lore3);
		im3.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im3.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is3.setItemMeta(im3);

		gui.setItem(9, is3);

		ItemStack is4 = new ItemStack(Material.BONE);
		ItemMeta im4 = is4.getItemMeta();
		im4.setDisplayName(ChatColor.GOLD + "Blood Effect:" + " " + ChatColor.RED + ChatColor.BOLD + "Hostile");
		ArrayList<String> Lore4 = new ArrayList<String>();
		Lore4.add(ChatColor.AQUA + "Click To Toggle");
		im4.setLore(Lore4);
		im4.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im4.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is4.setItemMeta(im4);

		gui.setItem(10, is4);

		ItemStack is5 = new ItemStack(Material.PAPER);
		ItemMeta im5 = is5.getItemMeta();
		im5.setDisplayName(ChatColor.GOLD + "Admin Button:" + " " + ChatColor.AQUA + ChatColor.BOLD + "Reload");
		ArrayList<String> Lore5 = new ArrayList<String>();
		Lore5.add(ChatColor.AQUA + "Click To Reload The Config");
		im5.setLore(Lore5);
		im5.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im5.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is5.setItemMeta(im5);

		gui.setItem(25, is5);

		ItemStack is6 = new ItemStack(Material.NETHER_STAR);
		ItemMeta im6 = is6.getItemMeta();
		im6.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Plugin Info:");
		ArrayList<String> Lore6 = new ArrayList<String>();
		Lore6.add(ChatColor.AQUA + "Created By" + " " + ChatColor.GOLD + "MythicGhoul");
		Lore6.add(ChatColor.AQUA + "Plugin Version:" + " " + ChatColor.GOLD + "2.2");
		im6.setLore(Lore6);
		im6.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im6.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		is6.setItemMeta(im6);

		gui.setItem(26, is6);

		ItemStack is9 = new ItemStack(Material.REDSTONE);
		ItemMeta im9 = is9.getItemMeta();
		im9.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Blood Sack");
		ArrayList<String> Lore9 = new ArrayList<String>();
		Lore9.add(ChatColor.AQUA + "Right Click To Rejuvenate");
		Lore9.add(ChatColor.AQUA + "Your Health By 5");
		im9.setLore(Lore9);
		im9.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im9.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im9.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is9.setItemMeta(im9);

		gui.setItem(7, is9);

		ItemStack is10 = new ItemStack(Material.GLOWSTONE_DUST);
		ItemMeta im10 = is10.getItemMeta();
		im10.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack");
		ArrayList<String> Lore10 = new ArrayList<String>();
		Lore10.add(ChatColor.AQUA + "Right Click To Rejuvenate");
		Lore10.add(ChatColor.AQUA + "Your Health And Give You Strength!");
		im10.setLore(Lore10);
		im10.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im10.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im10.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is10.setItemMeta(im10);

		gui.setItem(8, is10);

		ItemStack is11 = new ItemStack(Material.EMERALD);
		ItemMeta im11 = is11.getItemMeta();
		im11.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Trade Menu");
		ArrayList<String> Lore11 = new ArrayList<String>();
		Lore11.add(ChatColor.AQUA + "Opens The Blood Trade Menu");
		im11.setLore(Lore11);
		im11.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im11.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im11.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is11.setItemMeta(im11);

		gui.setItem(17, is11);

		p.openInventory(gui);

	}

	@EventHandler
	public void onClick(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();

		if (!e.getInventory().equals(gui))
			return;
		if (e.getCurrentItem() == null)
			return;
		if (e.getCurrentItem().getItemMeta() == null)
			return;
		if (e.getCurrentItem().getItemMeta().getDisplayName() == null)
			return;

		e.setCancelled(true);

		if (e.getSlot() == 0 && e.getCurrentItem().getType() == Material.DIAMOND) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("Player.Enabled") == false) {
					GUIMenu.plugin.getConfig().set("Player.Enabled", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Player Blood" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("Player.Enabled") == true) {
					GUIMenu.plugin.getConfig().set("Player.Enabled", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Player Blood" + ChatColor.RED + " " + "Disabled");
				}
			}

		}
		if (e.getSlot() == 1 && e.getCurrentItem().getType() == Material.ENDER_PEARL) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("Boss-Mobs.Enabled") == false) {
					GUIMenu.plugin.getConfig().set("Boss-Mobs.Enabled", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Boss Blood" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("Boss-Mobs.Enabled") == true) {
					GUIMenu.plugin.getConfig().set("Boss-Mobs.Enabled", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Boss Blood" + ChatColor.RED + " " + "Disabled");
				}
			}
		}
		if (e.getSlot() == 2 && e.getCurrentItem().getType() == Material.PORKCHOP) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == false) {
					GUIMenu.plugin.getConfig().set("Passive-Mobs.Enabled", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Passive Blood" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
					GUIMenu.plugin.getConfig().set("Passive-Mobs.Enabled", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "passive Blood" + ChatColor.RED + " " + "Disabled");

				}
			}
		}
		if (e.getSlot() == 9 && e.getCurrentItem().getType() == Material.POPPY) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == false) {
					GUIMenu.plugin.getConfig().set("Neutral-Mobs.Enabled", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Neutral Blood" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
					GUIMenu.plugin.getConfig().set("Neutral-Mobs.Enabled", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Neutral Blood" + ChatColor.RED + " " + "Disabled");

				}
			}
		}
		if (e.getSlot() == 10 && e.getCurrentItem().getType() == Material.BONE) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == false) {
					GUIMenu.plugin.getConfig().set("Hostile-Mobs.Enabled", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Hostile Blood" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
					GUIMenu.plugin.getConfig().set("Hostile-Mobs.Enabled", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "Hostile Blood" + ChatColor.RED + " " + "Disabled");

				}
			}
		}
		if (e.getSlot() == 11 && e.getCurrentItem().getType() == Material.REDSTONE) {
			if (p.hasPermission("pb.toggle")) {
				if (GUIMenu.plugin.getConfig().getBoolean("BloodSpray") == false) {
					GUIMenu.plugin.getConfig().set("BloodSpray", true);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "BloodSpray" + ChatColor.AQUA + " " + "Enabled");

				} else if (GUIMenu.plugin.getConfig().getBoolean("BloodSpray") == true) {
					GUIMenu.plugin.getConfig().set("BloodSpray", false);
					GUIMenu.plugin.saveConfig();
					p.sendMessage(prefix + " " + ChatColor.GREEN + "BloodSpray" + ChatColor.RED + " " + "Disabled");

				}
			}

		}

		if (e.getSlot() == 25 && e.getCurrentItem().getType() == Material.PAPER) {
			if (p.hasPermission("pb.admin")) {
				p.sendMessage(prefix + " " + ChatColor.AQUA + "Config Reload" + " " + ChatColor.WHITE + "["
						+ ChatColor.GREEN + "SUCESS" + ChatColor.WHITE + "]");
				GUIMenu.plugin.reloadConfig();
			}
		}

		if (e.getSlot() == 7 && e.getCurrentItem().getType() == Material.REDSTONE) {
			if (p.hasPermission("pb.blood")) {
				ItemStack is9 = new ItemStack(Material.REDSTONE);
				ItemMeta im9 = is9.getItemMeta();
				im9.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Blood Sack");
				ArrayList<String> Lore9 = new ArrayList<String>();
				Lore9.add(ChatColor.AQUA + "Right Click To Rejuvenate");
				Lore9.add(ChatColor.AQUA + "Your Health By 5");
				im9.setLore(Lore9);
				im9.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
				im9.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				im9.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				is9.setItemMeta(im9);
				p.getInventory().addItem(is9);
			}
		}
		if (e.getSlot() == 8 && e.getCurrentItem().getType() == Material.GLOWSTONE_DUST) {
			if (p.hasPermission("pb.super")) {
				ItemStack is10 = new ItemStack(Material.GLOWSTONE_DUST);
				ItemMeta im10 = is10.getItemMeta();
				im10.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack");
				ArrayList<String> Lore10 = new ArrayList<String>();
				Lore10.add(ChatColor.AQUA + "Right Click To Rejuvenate");
				Lore10.add(ChatColor.AQUA + "Your Health And Give You Strength!");
				im10.setLore(Lore10);
				im10.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
				im10.addItemFlags(ItemFlag.HIDE_ENCHANTS);
				im10.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
				is10.setItemMeta(im10);
				p.getInventory().addItem(is10);
			}

		}

		if (e.getSlot() == 17 && e.getCurrentItem().getType() == Material.EMERALD) {
			GUIMenu.openGUI2(p);
		}
	}

	public static void openGUI2(Player p) {
		gui2 = Bukkit.createInventory(null, 9, ChatColor.DARK_PURPLE + "" + ChatColor.BOLD + "Blood Trade");

		ItemStack is = new ItemStack(Material.BARRIER);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Close");
		im.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is.setItemMeta(im);

		gui2.setItem(0, is);

		ItemStack is2 = new ItemStack(Material.GLOWSTONE_DUST);
		ItemMeta im2 = is2.getItemMeta();
		im2.setDisplayName("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack");
		ArrayList<String> Lore2 = new ArrayList<String>();
		Lore2.add("" + ChatColor.GOLD + "Cost:" + " " + ChatColor.AQUA + "10" + " " + ChatColor.RED + "Blood Sacks");
		im2.setLore(Lore2);
		im2.addEnchant(Enchantment.DAMAGE_ALL, 1, true);
		im2.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is2.setItemMeta(im2);

		gui2.setItem(2, is2);

		ItemStack is4 = new ItemStack(Material.NETHERITE_SWORD);
		ItemMeta im4 = is4.getItemMeta();
		im4.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Deaths Wake");
		ArrayList<String> Lore4 = new ArrayList<String>();
		Lore4.add("" + ChatColor.GOLD + "Cost:" + " " + ChatColor.AQUA + "64" + " " + ChatColor.RED
				+ " Golden Blood Sacks");
		im4.setLore(Lore4);
		im4.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		im4.addEnchant(Enchantment.DAMAGE_UNDEAD, 2, true);
		im4.addEnchant(Enchantment.FIRE_ASPECT, 1, true);
		im4.addEnchant(Enchantment.KNOCKBACK, 2, true);
		im4.addEnchant(Enchantment.MENDING, 50, true);
		im4.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		im4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		is4.setItemMeta(im4);

		gui2.setItem(6, is4);

		p.openInventory(gui2);

	}

	@EventHandler
	public void onClick2(InventoryClickEvent e) {
		Player p = (Player) e.getWhoClicked();

		if (!e.getInventory().equals(gui2))
			return;
		if (e.getCurrentItem() == null)
			return;
		if (e.getCurrentItem().getItemMeta() == null)
			return;
		if (e.getCurrentItem().getItemMeta().getDisplayName() == null)
			return;

		e.setCancelled(true);

		if (e.getSlot() == 0 && e.getCurrentItem().getType() == Material.BARRIER) {
			p.closeInventory();

		}
		if (e.getSlot() == 2 && e.getCurrentItem().getType() == Material.GLOWSTONE_DUST) {

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

			if ((p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
					.contains("" + ChatColor.DARK_RED + ChatColor.BOLD + "Blood Sack"))) {
				if (p.getInventory().getItemInMainHand().getAmount() < 10) {
					p.sendMessage(prefix + " " + ChatColor.RED + "You Need 10 Blood Sacks For That!");
					return;
				}
				if ((p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.contains("" + ChatColor.DARK_RED + ChatColor.BOLD + "Blood Sack"))) {
					if (p.getInventory().getItemInMainHand().getAmount() > 10) {
						p.getInventory().addItem(is2);
						p.getInventory().getItemInMainHand()
								.setAmount(p.getInventory().getItemInMainHand().getAmount() - 10);
						p.spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 200, 1.0D, 1.0D, 1.0D, 0.5D);
						p.sendMessage(prefix + " " + ChatColor.GREEN + "The Blood Sacks Merge Together!");

					}
				}
			}
		}
		if (e.getSlot() == 6 && e.getCurrentItem().getType() == Material.NETHERITE_SWORD) {

			ItemStack is4 = new ItemStack(Material.NETHERITE_SWORD);
			ItemMeta im4 = is4.getItemMeta();
			im4.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Deaths Wake");
			ArrayList<String> Lore4 = new ArrayList<String>();
			Lore4.add(ChatColor.AQUA + "A Sword Infused With Golden Blood");
			Lore4.add(ChatColor.AQUA + "Its Power Is Said To Rival The Dragon");
			im4.setLore(Lore4);
			im4.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE,
					new AttributeModifier("generic.attackDamage", 2, Operation.ADD_NUMBER));
			im4.addEnchant(Enchantment.DAMAGE_ALL, 5, true);
			im4.addEnchant(Enchantment.DAMAGE_UNDEAD, 5, true);
			im4.addEnchant(Enchantment.FIRE_ASPECT, 5, true);
			im4.addEnchant(Enchantment.KNOCKBACK, 5, true);
			im4.addEnchant(Enchantment.MENDING, 30, true);
			im4.addItemFlags(ItemFlag.HIDE_ENCHANTS);
			im4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
			is4.setItemMeta(im4);

			if ((p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
					.contains("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack"))) {
				if (p.getInventory().getItemInMainHand().getAmount() < 64) {
					p.sendMessage(prefix + " " + ChatColor.RED + "You Need 64 Golden Blood Sacks For That!");
					return;
				}
				if ((p.getInventory().getItemInMainHand().getItemMeta().getDisplayName()
						.contains("" + ChatColor.GOLD + ChatColor.BOLD + "Golden Blood Sack"))) {
					if (p.getInventory().getItemInMainHand().getAmount() == 64) {
						p.getInventory().addItem(is4);
						p.getInventory().getItemInMainHand()
								.setAmount(p.getInventory().getItemInMainHand().getAmount() - 64);
						p.spawnParticle(Particle.SPELL_WITCH, p.getLocation(), 200, 1.0D, 1.0D, 1.0D, 0.5D);
						p.sendMessage(prefix + " " + ChatColor.GREEN + "The Golden Blood Transforms In Your Hand!");

					}
				}
			}
		}
	}
}
