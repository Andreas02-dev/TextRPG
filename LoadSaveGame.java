package textRPG;

// Import i/o modules
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadSaveGame {
	public static void LoadGame() {
		// Load saveFile information
		try {
			FileInputStream saveFile = new FileInputStream("Savefile.txt");
			ObjectInputStream input = new ObjectInputStream(saveFile);
			
			String loadName = (String) input.readObject();
			int loadLevel = input.readInt();
			int loadExperience = input.readInt();
			int loadBaseDamage = input.readInt();
			int loadDamagePerLevel = input.readInt();
			String loadWeapon = (String) input.readObject();
			int loadWeaponAmplifier = input.readInt();
			int loadDamage = input.readInt();
			int loadBaseHitpoints = input.readInt();
			int loadHitPointsPerLevel = input.readInt();
			int loadHitpoints = input.readInt();
			int loadMaximumHitPoints = input.readInt();
			String loadArmor = (String) input.readObject();
			int loadArmorAmplifier = input.readInt();
			int loadWallet = input.readInt();
			int loadHealthPotionAmount = input.readInt();
			HeroCreator.heroChoice = input.readInt();
			HeroCreator.heroLoader(loadName, loadLevel, loadExperience, loadBaseDamage, loadDamagePerLevel, loadWeapon, loadWeaponAmplifier, loadDamage, loadBaseHitpoints, loadHitPointsPerLevel, loadHitpoints, loadMaximumHitPoints, loadArmor, loadArmorAmplifier, loadWallet, loadHealthPotionAmount);
			input.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
		// Put saveFile information in Hero
			
	}
}
