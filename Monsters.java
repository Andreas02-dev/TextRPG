package textRPG;

public class Monsters {
	String name;
	int level;
	int maxBaseDamageDealt;
	int damagePerLevel;
	int maxBaseHitPoints;
	int hitPointsPerLevel;
	public Monsters(String name, int level, int maxBaseDamageDealt, int damagePerLevel, int maxBaseHitPoints, int hitPointsPerLevel) {
		this.name = name;
		this.level = level;
		this.maxBaseDamageDealt = maxBaseDamageDealt;
		this.damagePerLevel = damagePerLevel;
		this.maxBaseHitPoints = maxBaseHitPoints;
		this.hitPointsPerLevel = hitPointsPerLevel;
	}
}
