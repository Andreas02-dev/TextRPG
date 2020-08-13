package textRPG;

public class Archer extends Heroes {

	public Archer(String name, int level, int experience, int baseDamage, int damagePerLevel, String weapon, int weaponAmplifier, int damage, int baseHitpoints, int hitPointsPerLevel, int hitpoints, int maximumHitPoints, String armor, int armorAmplifier, int wallet, int healthPotionAmount) {
		super("Archer", 1, 541, 6, 4, "Regular bow", 1, 10, 98, 2, 100, 100, "Naked", 1, 0, 0);
	}
}