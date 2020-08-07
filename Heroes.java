package textRPG;

public class Heroes extends AttackEntity{
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	public Heroes(String name, int level, int damageDealt, int hitPoints) {
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
	}
}