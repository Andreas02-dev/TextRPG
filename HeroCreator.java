package textRPG;
import java.util.Scanner;

public class HeroCreator {
	static Scanner keyboard = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
	static Heroes hero;
	static int heroChoice;

	
	//system variable
	static boolean notRepeat = false;
	public static void heroCreator() {
		System.out.println("----------------------------------------------");
		System.out.println("Please choose your hero!");
		System.out.println("(1) Archer");
		int heroSelection = keyboard.nextInt();
		while (!notRepeat) {
			switch (heroSelection) {
			case 1:	hero = new Heroes("Archer", 1, 541, 6, 4, "Regular bow", 1, 10, 98, 2, 100, 100, "Naked", 1, 0, 0);
					heroChoice = 1;
					Locations.Town(hero);
					break;
			default: System.out.println("Invalid option!");
					break;
			}
		}
	}
	public static void heroLoader(String loadName, int loadLevel, int loadExperience, int loadBaseDamage, int loadDamagePerLevel, String loadWeapon, int loadWeaponAmplifier, int loadDamage, int loadBaseHitpoints, int loadHitPointsPerLevel, int loadHitpoints, int loadMaximumHitPoints, String loadArmor, int loadArmorAmplifier, int loadWallet, int loadHealthPotionAmount) {
		switch (HeroCreator.heroChoice) {
			case 1:	hero = new Heroes(loadName, loadLevel, loadExperience, loadBaseDamage, loadDamagePerLevel, loadWeapon, loadWeaponAmplifier, loadDamage, loadBaseHitpoints, loadHitPointsPerLevel, loadHitpoints, loadMaximumHitPoints, loadArmor, loadArmorAmplifier, loadWallet, loadHealthPotionAmount);
					Locations.Town(hero);
					break;
		}
	}
}
