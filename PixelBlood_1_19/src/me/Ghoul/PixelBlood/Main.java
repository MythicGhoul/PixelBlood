package me.Ghoul.PixelBlood;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {

		Bukkit.getConsoleSender().sendMessage(this.prefix + ChatColor.RED + "[-------------------------]");
		Bukkit.getConsoleSender()
				.sendMessage(this.prefix + ChatColor.RED + getName() + ":" + " " + ChatColor.AQUA + "Was Enabled!");
		Bukkit.getConsoleSender().sendMessage(this.prefix + ChatColor.RED + "Plugin Version" + ":" + " "
				+ ChatColor.AQUA + getConfig().getDouble("Version"));
		Bukkit.getConsoleSender()
				.sendMessage(this.prefix + ChatColor.RED + "Author:" + " " + ChatColor.AQUA + "MythicGhoul");
		Bukkit.getConsoleSender().sendMessage(this.prefix + ChatColor.RED + "[-------------------------]");

		getConfig().options().copyDefaults(true);
		saveConfig();
		reloadConfig();

		EggCraft i = new EggCraft(this);
		i.OnEggCraft();

		new BloodEffects(this);
		new DeathBlood(this);
		new BloodItem(this);
		new SignEvent(this);
		new GUIMenu(this);

		int pluginId = 12691;
		new Metrics(this, pluginId);

	}

	public String prefix = ChatColor.WHITE + "[" + ChatColor.AQUA + "Pb" + ChatColor.WHITE + "]";

	public List<String> onTabComplete(CommandSender sender, Command cmd, String CommandLable, String[] args) {
		if (args.length == 1) {
			List<String> args1 = new ArrayList<String>();
			args1.add("Help");
			args1.add("Player");
			args1.add("Passive");
			args1.add("Neutral");
			args1.add("Hostile");
			args1.add("Boss");
			args1.add("Gui");
			args1.add("Admin");
			return args1;
		}
		return null;
	}

	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command cmd, String CommandLable, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage("Only Players Can Send This Command!");
			return true;
		}
		Player p = (Player) sender;
		if (args.length == 0) {
			if (cmd.getName().equalsIgnoreCase("pb")) {
				sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb Help For More Info!");
			}
			return true;
		}

		if ((args.length == 1) && (args[0].equalsIgnoreCase("Help"))) {
			sender.sendMessage(this.prefix + " " + ChatColor.WHITE + "[-----------PixelBlood-----------]");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb help -" + ChatColor.WHITE + " "
					+ "See This Message");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb reload -" + ChatColor.WHITE + " "
					+ "Reloads The Config");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb player -" + ChatColor.WHITE + " "
					+ " Toggles Player Blood");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb passive -" + ChatColor.WHITE + " "
					+ " Toggles Passive Blood");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb neutral -" + ChatColor.WHITE + " "
					+ "Toggles Neutral Blood");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb hostile -" + ChatColor.WHITE + " "
					+ " Toggles Hostile Blood");
			sender.sendMessage(this.prefix + " " + ChatColor.GREEN + "Use /pb boss -" + ChatColor.WHITE + " "
					+ " Toggles Boss Blood");
			sender.sendMessage(
					this.prefix + " " + ChatColor.GREEN + "Use /pb gui -" + ChatColor.WHITE + " " + " Opens GUI Menu");
			sender.sendMessage(this.prefix + " " + ChatColor.WHITE + "[----------------------------]");
			return true;
		}

		if ((args.length == 1) && (args[0].equalsIgnoreCase("rl"))) {
			if (p.hasPermission("pb.reload")) {
				this.reloadConfig();

			}
			p.sendMessage(prefix + " " + ChatColor.GREEN + "Config Successfully Reloaded");
			return true;
		}
		if ((args.length == 1) && (args[0].equalsIgnoreCase("player"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("Player.Enabled") == false) {
					this.getConfig().set("Player.Enabled", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Player Blood",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("Player.Enabled") == true) {
					this.getConfig().set("Player.Enabled", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Player Blood",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}
		if ((args.length == 1) && (args[0].equalsIgnoreCase("boss"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("Boss-Mobs.Enabled") == false) {
					this.getConfig().set("Boss-Mobs.Enabled", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Boss Blood",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("Boss-Mobs.Enabled") == true) {
					this.getConfig().set("Boss-Mobs.Enabled", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "Boss Blood",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}
		if ((args.length == 1) && (args[0].equalsIgnoreCase("passive"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("Passive-Mobs.Enabled") == false) {
					this.getConfig().set("Passive-Mobs.Enabled", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GREEN + ChatColor.BOLD + "Passive Blood",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
					this.getConfig().set("Passive-Mobs.Enabled", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GREEN + ChatColor.BOLD + "Passive Blood",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}
		if ((args.length == 1) && (args[0].equalsIgnoreCase("neutral"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("Neutral-Mobs.Enabled") == false) {
					this.getConfig().set("Neutral-Mobs.Enabled", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Neutral Blood",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
					this.getConfig().set("Neutral-Mobs.Enabled", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Neutral Blood",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}
		if ((args.length == 1) && (args[0].equalsIgnoreCase("hostile"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("Hostile-Mobs.Enabled") == false) {
					this.getConfig().set("Hostile-Mobs.Enabled", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Hostile Blood",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
					this.getConfig().set("Hostile-Mobs.Enabled", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Hostile Blood",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}

		if ((args.length == 1) && (args[0].equalsIgnoreCase("spray"))) {
			if (p.hasPermission("pb.toggle")) {
				if (this.getConfig().getBoolean("BloodSpray") == false) {
					this.getConfig().set("BloodSpray", true);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Blood Spray",
							"" + ChatColor.GREEN + ChatColor.BOLD + "Enabled");
					return true;
				} else if (this.getConfig().getBoolean("BloodSpray") == true) {
					this.getConfig().set("BloodSpray", false);
					this.saveConfig();
					p.sendTitle("" + ChatColor.GOLD + ChatColor.BOLD + "Blood Spray",
							"" + ChatColor.RED + ChatColor.BOLD + "Disabled");
					return true;
				}
			}
		}

		if ((args.length == 1) && (args[0].equalsIgnoreCase("admin"))) {
			if (p.hasPermission("pb.toggle")) {

				GUIMenu.openGUI(p);
				return true;
			}

		}

		if ((args.length == 1) && (args[0].equalsIgnoreCase("gui"))) {

			GUIMenu.openGUI2(p);
			return true;
		}

		return false;

	}
}
