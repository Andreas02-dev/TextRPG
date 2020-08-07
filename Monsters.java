package textRPG;

public class Monsters extends AttackEntity {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	public Monsters(String name, int level, int damageDealt, int hitPoints) {
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
	}
}
