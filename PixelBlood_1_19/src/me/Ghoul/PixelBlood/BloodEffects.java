package me.Ghoul.PixelBlood;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.Material;
import org.bukkit.entity.Bat;
import org.bukkit.entity.Bee;
import org.bukkit.entity.Blaze;
import org.bukkit.entity.Cat;
import org.bukkit.entity.CaveSpider;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Cod;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Dolphin;
import org.bukkit.entity.Donkey;
import org.bukkit.entity.Drowned;
import org.bukkit.entity.Enderman;
import org.bukkit.entity.Endermite;
import org.bukkit.entity.Evoker;
import org.bukkit.entity.Fox;
import org.bukkit.entity.Ghast;
import org.bukkit.entity.Guardian;
import org.bukkit.entity.Hoglin;
import org.bukkit.entity.Horse;
import org.bukkit.entity.Husk;
import org.bukkit.entity.Llama;
import org.bukkit.entity.MagmaCube;
import org.bukkit.entity.Mule;
import org.bukkit.entity.Ocelot;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Parrot;
import org.bukkit.entity.Phantom;
import org.bukkit.entity.Pig;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Piglin;
import org.bukkit.entity.Pillager;
import org.bukkit.entity.Player;
import org.bukkit.entity.PolarBear;
import org.bukkit.entity.PufferFish;
import org.bukkit.entity.Rabbit;
import org.bukkit.entity.Ravager;
import org.bukkit.entity.Salmon;
import org.bukkit.entity.Sheep;
import org.bukkit.entity.Shulker;
import org.bukkit.entity.Silverfish;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Slime;
import org.bukkit.entity.Spider;
import org.bukkit.entity.Squid;
import org.bukkit.entity.Stray;
import org.bukkit.entity.Strider;
import org.bukkit.entity.TraderLlama;
import org.bukkit.entity.TropicalFish;
import org.bukkit.entity.Turtle;
import org.bukkit.entity.Vex;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Vindicator;
import org.bukkit.entity.WanderingTrader;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class BloodEffects implements Listener {

	Main plugin;

	public BloodEffects(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}

	@EventHandler
	public void PlayerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("BloodEffects") == true) {
			if ((e.getEntity() instanceof Player))
				if (this.plugin.getConfig().getBoolean("Player.Enabled") == true) {
					e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
							Effect.STEP_SOUND,
							Material.getMaterial(this.plugin.getConfig().getString("Player.BloodType")));
					return;
				}
		}
	}

	@EventHandler
	public void BatBlood(EntityDamageEvent e) {

		if ((e.getEntity() instanceof Bat))
			if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Bat")));
				return;
			}
	}

	@EventHandler
	public void CatBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
		}
		if ((e.getEntity() instanceof Cat))
			e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
					Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Cat")));
		return;
	}

	@EventHandler
	public void ChickenBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
		}
		if ((e.getEntity() instanceof Chicken))
			e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
					Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Chicken")));
		return;
	}

	@EventHandler
	public void CodBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Cod))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Cod")));
			return;
		}
	}

	@EventHandler
	public void CowBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Cow))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Cod")));
			return;
		}
	}

	@EventHandler
	public void DonkeyBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Donkey))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Donkey")));
			return;
		}
	}

	@EventHandler
	public void FoxBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Fox))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Fox")));
			return;
		}
	}

	@EventHandler
	public void HorseBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Horse))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Horse")));
			return;
		}
	}

	@EventHandler
	public void MuleBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Mule))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Mule")));
			return;
		}
	}

	@EventHandler
	public void OcelotBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Ocelot))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Ocelot")));
			return;
		}
	}

	@EventHandler
	public void ParrotBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Parrot))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Parrot")));
			return;
		}
	}

	@EventHandler
	public void PigBlood(EntityDamageEvent e) {

		if ((e.getEntity() instanceof Pig))
			if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Pig")));
				return;
			}
	}

	@EventHandler
	public void PolarBearBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof PolarBear))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.PolarBear")));
			return;
		}
	}

	@EventHandler
	public void PufferFishBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof PufferFish))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.PufferFish")));
			return;
		}
	}

	@EventHandler
	public void RabbitBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Rabbit))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Rabbit")));
			return;
		}
	}

	@EventHandler
	public void SalmonBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Salmon))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Salmon")));
			return;
		}
	}

	@EventHandler
	public void SheepBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Sheep))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Sheep")));
			return;
		}
	}

	@EventHandler
	public void SquidBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Squid))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Squid")));
			return;
		}
	}

	@EventHandler
	public void StriderBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Strider))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Strider")));
			return;
		}
	}

	@EventHandler
	public void TropicalFishBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof TropicalFish))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.TropicalFish")));
			return;
		}
	}

	@EventHandler
	public void TurtleBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Turtle))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Turtle")));
			return;
		}
	}

	@EventHandler
	public void VillagerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Villager))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.Villager")));
			return;
		}
	}

	@EventHandler
	public void WanderingTraderBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Passive-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof WanderingTrader))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("FriendlyMobs.WanderingTrader")));
			return;
		}
	}

	@EventHandler
	public void BeeBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Bee))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Bee")));
			return;
		}
	}

	@EventHandler
	public void DolphinBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Dolphin))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Dolphin")));
			return;
		}
	}

	@EventHandler
	public void EndermanBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Enderman))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Enderman")));
			return;
		}
	}

	@EventHandler
	public void LlamaBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Llama))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Llama")));
			return;
		}
	}

	@EventHandler
	public void PandaBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Panda))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Panda")));
			return;
		}
	}

	@EventHandler
	public void TraderLlamaBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof TraderLlama))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.TraderLlama")));
			return;
		}
	}

	@EventHandler
	public void WolfBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Wolf))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.Wolf")));
			return;
		}
	}

	@EventHandler
	public void PigZombieBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Neutral-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof PigZombie))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("IdleMobs.PigZombie")));
			return;
		}
	}

	@EventHandler
	public void BlazeBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Blaze))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Blaze")));
			return;
		}
	}

	@EventHandler
	public void CreeperBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Creeper))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Creeper")));
			return;
		}
	}

	@EventHandler
	public void DrownedBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Drowned))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Drowned")));
			return;
		}
	}

	@EventHandler
	public void CaveSpiderlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof CaveSpider))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.CaveSpider")));
			return;
		}
	}

	@EventHandler
	public void EndermiteBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Endermite))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Endermite")));
			return;
		}
	}

	@EventHandler
	public void EvokerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Evoker))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Evoker")));
			return;
		}
	}

	@EventHandler
	public void GhastBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Ghast))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Ghast")));
			return;
		}
	}

	@EventHandler
	public void GuardianBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Guardian))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Guardian")));
			return;
		}
	}

	@EventHandler
	public void HoglinBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Hoglin))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Hoglin")));
			return;
		}
	}

	@EventHandler
	public void HuskBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Husk))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Husk")));
			return;
		}
	}

	@EventHandler
	public void MagmaCubeBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof MagmaCube))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.MagmaCube")));
			return;
		}
	}

	@EventHandler
	public void PhantomBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Phantom))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Phantom")));
			return;
		}
	}

	@EventHandler
	public void PhillagerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Pillager))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Pillager")));
			return;
		}
	}

	@EventHandler
	public void PiglinBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Piglin))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Piglin")));
			return;
		}
	}

	@EventHandler
	public void RavagerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Ravager))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Ravager")));
			return;
		}
	}

	@EventHandler
	public void ShulkerBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Shulker))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Shulker")));
			return;
		}
	}

	@EventHandler
	public void SilverFishBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Silverfish))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Silverfish")));
			return;
		}
	}

	@EventHandler
	public void SkeletonBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Skeleton))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Skeleton")));
			return;
		}
	}

	@EventHandler
	public void SlimeBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Slime))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Slime")));
			return;
		}
	}

	@EventHandler
	public void StrayBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Stray))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Stray")));
			return;
		}
	}

	@EventHandler
	public void VexBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Vex))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Vex")));
			return;
		}
	}

	@EventHandler
	public void VindicatorBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Vindicator))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Vindicator")));
			return;
		}
	}

	@EventHandler
	public void WitchBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Witch))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Witch")));
			return;
		}
	}

	@EventHandler
	public void WitherSkeletonBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof WitherSkeleton))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND,
						Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.WitherSkeleton")));
			return;
		}
	}

	@EventHandler
	public void ZombieBlood(EntityDamageEvent e) {
		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Zombie))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Zombie")));
			return;
		}
	}

	@EventHandler
	public void SpiderBlood(EntityDamageEvent e) {

		if (this.plugin.getConfig().getBoolean("Hostile-Mobs.Enabled") == true) {
			if ((e.getEntity() instanceof Spider))
				e.getEntity().getLocation().getWorld().playEffect(e.getEntity().getLocation().add(0.0D, 0.5D, 0.0D),
						Effect.STEP_SOUND, Material.getMaterial(this.plugin.getConfig().getString("EnemyMobs.Spider")));
			return;
		}
	}
}
