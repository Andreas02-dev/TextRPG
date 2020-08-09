package textRPG;

public class Archer extends Heroes {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	int walletAmount;
	public Archer(String name, int level, int damageDealt, int hitPoints, int walletAmount) {
		super("Archer", 1, 10, 100, 0);
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
		this.walletAmount = walletAmount;
	}
}