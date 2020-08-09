package textRPG;

public class Archer extends Heroes {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	int walletAmount;
	int healthPotionAmount;
	public Archer(String name, int level, int damageDealt, int hitPoints, int walletAmount, int healthPotionAmount) {
		super("Archer", 1, 10, 100, 0, 0);
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
		this.walletAmount = walletAmount;
		this.healthPotionAmount = healthPotionAmount;
	}
}