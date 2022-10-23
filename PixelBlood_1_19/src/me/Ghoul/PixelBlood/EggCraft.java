package me.Ghoul.PixelBlood;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class EggCraft implements Listener {

	Main plugin;

	public EggCraft(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	public void OnEggCraft() {

		ItemStack i = new ItemStack(Material.PIG_SPAWN_EGG, 1);
		ItemMeta meta = i.getItemMeta();
		
		ArrayList<String> lore = new ArrayList<String>();
		lore.add(ChatColor.GREEN + "Hatch A New Pig");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i.setItemMeta(meta);

		NamespacedKey key = new NamespacedKey(plugin, "PigEgg");

		ShapedRecipe r = new ShapedRecipe(key, i);

		r.shape("EGE", "ECE", "EEE");
		r.setIngredient('E', Material.EGG);
		r.setIngredient('C',Material.CARROT);
		r.setIngredient('G', Material.GHAST_TEAR);

		Bukkit.addRecipe(r);

		ItemStack i2 = new ItemStack(Material.COW_SPAWN_EGG, 1);
		ItemMeta meta2 = i2.getItemMeta();

		ArrayList<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.GREEN + "Hatch A New Cow");
		meta2.setLore(lore2);
		meta2.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i2.setItemMeta(meta2);

		NamespacedKey key2 = new NamespacedKey(plugin, "CowEgg");

		ShapedRecipe r2 = new ShapedRecipe(key2, i2);

		r2.shape("EGE", "ELE", "EEE");
		r2.setIngredient('E', Material.EGG);
		r2.setIngredient('L', Material.LEATHER);
		r2.setIngredient('G', Material.GHAST_TEAR);

		Bukkit.addRecipe(r2);

		ItemStack i3 = new ItemStack(Material.CHICKEN_SPAWN_EGG, 1);
		ItemMeta meta3 = i3.getItemMeta();

		ArrayList<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.GREEN + "Hatch A New Chicken");
		meta3.setLore(lore3);
		meta3.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i3.setItemMeta(meta3);

		NamespacedKey key3 = new NamespacedKey(plugin, "ChickenEgg");

		ShapedRecipe r3 = new ShapedRecipe(key3, i3);

		r3.shape("EGE", "EFE", "EEE");
		r3.setIngredient('E', Material.EGG);
		r3.setIngredient('F', Material.FEATHER);
		r3.setIngredient('G', Material.GHAST_TEAR);

		Bukkit.addRecipe(r3);

		ItemStack i4 = new ItemStack(Material.SHEEP_SPAWN_EGG, 1);
		ItemMeta meta4 = i4.getItemMeta();

		ArrayList<String> lore4 = new ArrayList<String>();
		lore4.add(ChatColor.GREEN + "Hatch A New Sheep");
		meta4.setLore(lore4);
		meta4.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		i4.setItemMeta(meta4);

		NamespacedKey key4 = new NamespacedKey(plugin, "SheepEgg");

		ShapedRecipe r4 = new ShapedRecipe(key4, i4);

		r4.shape("EGE", "EWE", "EEE");
		r4.setIngredient('E', Material.EGG);
		r4.setIngredient('W', Material.WHITE_WOOL);
		r4.setIngredient('G', Material.GHAST_TEAR);

		Bukkit.addRecipe(r4);
	}
}
