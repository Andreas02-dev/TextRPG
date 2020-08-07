package textRPG;

public class Zombie extends Monsters {
	String name;
	int level;
	int damageDealt;
	int hitPoints;
	public Zombie(String name, int level, int damageDealt, int hitPoints) {
		super("Zombie", 1, 5, 20);
		this.name = name;
		this.level = level;
		this.damageDealt = damageDealt;
		this.hitPoints = hitPoints;
	}
}
