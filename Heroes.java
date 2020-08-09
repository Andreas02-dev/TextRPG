package textRPG;

public class Heroes {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	int walletAmount;
	public Heroes(String name, int level, int damageDealt, int hitPoints, int walletAmount) {
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
		this.walletAmount = walletAmount;
	}
}