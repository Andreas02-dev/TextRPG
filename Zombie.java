package textRPG;

public class Zombie extends Monsters {
	String name;
	int level;
	int maxBaseDamageDealt;
	int damagePerLevel;
	int maxBaseHitPoints;
	int hitPointsPerLevel;
	public Zombie(String name, int level, int maxBaseDamageDealt, int damagePerLevel, int maxBaseHitPoints, int hitPointsPerLevel) {
		super("Zombie", 1, 5, 2, 30, 5);
		this.name = name;
		this.level = level;
		this.maxBaseDamageDealt = maxBaseDamageDealt;
		this.damagePerLevel = damagePerLevel;
		this.maxBaseHitPoints = maxBaseHitPoints;
		this.hitPointsPerLevel = hitPointsPerLevel;
	}
}
