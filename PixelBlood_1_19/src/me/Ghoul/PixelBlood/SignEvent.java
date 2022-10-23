package me.Ghoul.PixelBlood;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.Sign;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class SignEvent implements Listener {
	public String prefix = ChatColor.WHITE + "[" + ChatColor.AQUA + "Pb" + ChatColor.WHITE + "]";
	Main plugin;

	public SignEvent(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void onBreak(BlockBreakEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		BlockState s = b.getState();

		if (b.getType() == Material.OAK_SIGN || b.getType() == Material.OAK_WALL_SIGN) {
			if (((Sign) s).getLine(0).equalsIgnoreCase("" + ChatColor.RED + ChatColor.BOLD + "[Blood]")) {
				if (p.isSneaking() == false) {
					if (p.hasPermission("pb.sign.break")) {
						p.sendMessage(prefix + " " + ChatColor.AQUA + "Sneak To Break Me");
						e.setCancelled(true);
					}
				}
			}
		}
	}

	@EventHandler
	public void onPlace(SignChangeEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		if (b.getType() == Material.OAK_SIGN || b.getType() == Material.OAK_WALL_SIGN) {
			if (e.getLine(0).equalsIgnoreCase("[Blood]")) {
				if (p.hasPermission("pb.sign.create")) {
					e.setLine(0, "" + ChatColor.RED + ChatColor.BOLD + "[Blood]");
					e.setLine(1, "" + ChatColor.AQUA + ChatColor.BOLD + "Gui");
				}
			}
		}
	}

	@EventHandler
	public void onPlace2(SignChangeEvent e) {
		Block b = e.getBlock();
		Player p = e.getPlayer();
		if (b.getType() == Material.OAK_SIGN || b.getType() == Material.OAK_WALL_SIGN) {
			if (e.getLine(0).equalsIgnoreCase("[Blood]")) {
				if (e.getLine(1).equalsIgnoreCase("cheat")) {
					if (p.hasPermission("pb.sign.create")) {
						e.setLine(0, "" + ChatColor.RED + ChatColor.BOLD + "[Blood]");
						e.setLine(1, "" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "CHEAT");
					}
				}
			}
		}
	}

	@EventHandler
	public void onPlayerInteract1(PlayerInteractEvent e) {
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Block b = e.getClickedBlock();
			Player p = e.getPlayer();
			if (b.getType() == Material.OAK_SIGN || b.getType() == Material.OAK_WALL_SIGN) {
				Sign sign = (Sign) b.getState();
				String[] lines = sign.getLines();
				if (lines[0].equalsIgnoreCase("" + ChatColor.RED + ChatColor.BOLD + "[Blood]")) {
					if (lines[1].equalsIgnoreCase("" + ChatColor.AQUA + ChatColor.BOLD + "Gui")) {
						GUIMenu.openGUI2(p);
					}
				}
			}
		}
	}

	@EventHandler
	public void onPlayerInteract2(PlayerInteractEvent e) {
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
		
		if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
			Block b = e.getClickedBlock();
			Player p = e.getPlayer();
			if (b.getType() == Material.OAK_SIGN || b.getType() == Material.OAK_WALL_SIGN) {
				Sign sign = (Sign) b.getState();
				String[] lines = sign.getLines();
				if (lines[0].equalsIgnoreCase("" + ChatColor.RED + ChatColor.BOLD + "[Blood]")) {
					if (lines[1].equalsIgnoreCase("" + ChatColor.DARK_PURPLE + ChatColor.BOLD + "CHEAT")) {
						p.getInventory().addItem(is4);
					}
				}
			}
		}
	}
}
