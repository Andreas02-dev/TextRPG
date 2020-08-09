package textRPG;

public class Heroes {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	int walletAmount;
	int healthPotionAmount;
	public Heroes(String name, int level, int damageDealt, int hitPoints, int walletAmount, int healthPotionAmount) {
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
		this.walletAmount = walletAmount;
		this.healthPotionAmount = healthPotionAmount;
	}
}