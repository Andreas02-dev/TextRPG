package textRPG;

public class Heroes {
	//declaration of Heroes static (global) variables
	static String name;
	static int level;
	static int experience;
	static int baseDamage;
	static int damagePerLevel;
	static String weapon;
	static int weaponAmplifier;
	static int damage;
	static int baseHitpoints;
	static int hitPointsPerLevel;
	static int hitpoints;
	static int maximumHitPoints;
	static String armor;
	static int armorAmplifier;
	static int wallet;
	static int healthPotionAmount;

	//Heroes constructor
	public Heroes(String name, int level, int experience, int baseDamage, int damagePerLevel, String weapon, int weaponAmplifier, int damage, int baseHitpoints, int hitPointsPerLevel, int hitpoints, int maximumHitPoints, String armor, int armorAmplifier, int wallet, int healthPotionAmount) {
		
		//global variables initialization
		Heroes.name = name;
		Heroes.level = level;
		Heroes.experience = experience;
		Heroes.baseDamage = baseDamage;
		Heroes.damagePerLevel = damagePerLevel;
		Heroes.weapon = weapon;
		Heroes.weaponAmplifier = weaponAmplifier;
		Heroes.damage = damage;
		Heroes.baseHitpoints = baseHitpoints;
		Heroes.hitPointsPerLevel = hitPointsPerLevel;
		Heroes.hitpoints = hitpoints;
		Heroes.maximumHitPoints = maximumHitPoints;
		Heroes.armor = armor;
		Heroes.armorAmplifier = armorAmplifier;
		Heroes.wallet = wallet;
		Heroes.healthPotionAmount = healthPotionAmount;
		
		
	}
	//Method for changing name
	public static void ChangeName(String newName) {
		Heroes.name = newName;
		return;
	}
	//Method for adding experience
	public static void AddExperience(int droppedExperience) {
		Heroes.experience += droppedExperience;
		return;
	}
	//Method for calculating level
	public static void CalculateLevel() {
		for (int i = 0; i<=99; i++) {
			if (Heroes.experience >= 1206534) {
				Heroes.level = 100; 
				return; }
			else {
				if ((Heroes.experience >= TextRPG.leveling[i])) {
					Heroes.level = i+1;
					return;
				}
			}
		}
	}
	//Method for setting weapon name and amplifier
	public static void WeaponSetter(String newWeaponName, int newWeaponAmplifier) {
		Heroes.weapon = newWeaponName;
		Heroes.weaponAmplifier = newWeaponAmplifier;
	}
	//Method for calculating damage
	public static void DamageCalculator() {
		Heroes.damage = ( ( Heroes.baseDamage + ( Heroes.damagePerLevel * Heroes.level ) ) * Heroes.weaponAmplifier );
		return;
	}
	//Method for setting armor name and amplifier
	public static void ArmorSetter(String newArmorName, int newArmorAmplifier) {
		Heroes.armor = newArmorName;
		Heroes.armorAmplifier = newArmorAmplifier;
	}
	//Method for calculating maximum hitpoints
	public static void MaximumHitpointsCalculator() {
		Heroes.maximumHitPoints = ( Heroes.baseHitpoints + ( Heroes.hitPointsPerLevel * Heroes.level ) );
	}
	//Method for calculating hitpoints after damage
	public static void HitpointsAfterDamageCalculator(int damageTaken) {
		Heroes.hitpoints = ( Heroes.hitpoints - ( damageTaken * Heroes.armorAmplifier ) );
	}
}