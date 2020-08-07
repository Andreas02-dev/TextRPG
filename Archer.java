package textRPG;

public class Archer extends Heroes {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	public Archer(String name, int level, int damageDealt, int hitPoints) {
		super("Archer", 1, 10, 100);
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
	}
}