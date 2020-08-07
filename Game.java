package textRPG;
import java.util.Scanner;
import java.util.Random;

public class Game {
	
	// Import variables
	static Scanner keyboard = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
	static Random rand = new Random();
	
	// Game variables
	static String[] monsters = {"Zombie"};
	static boolean running = true;
	static int enemyHP;
	static int enemyDamageDealt;
	static int enemyLevel;

	
	public static void Dungeon(Heroes hero) {
		
		//Tracker variables
		int heroHP = hero.hitPoints;
		int heroDamageDealt = hero.damageDealt;
		
		while (running) {
			System.out.println("----------------------------------------------");
			int enemyIndex = rand.nextInt(monsters.length);
			String enemy = monsters[enemyIndex];
			
			switch (enemyIndex) {
				case 0:	Zombie zomb = new Zombie("Zombie", 1, 5, 20);
						enemyHP = zomb.hitPoints;
						enemyDamageDealt = zomb.damageDealt;
						enemyLevel = zomb.level;
						break;
				default: break;
			}
			System.out.println("# A level " + enemyLevel + " " + enemy + " has appeared! #");
			

			
		while (enemyHP > 0 ) {
				enter.nextLine();		
				System.out.println("# " + enemy + " has HP:" + enemyHP + " #");
				enter.nextLine();
				System.out.println("# You have " + heroHP + "HP. #");
				enter.nextLine();
				System.out.println("----------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("----------------------------------------------");
				System.out.println("(1) Attack");
				System.out.println("(2) Heal");
				System.out.println("(3) Run!");
				int choice = keyboard.nextInt();
				
				switch (choice) {
					case 1: enemyHP -= heroDamageDealt;
							heroHP -= enemyDamageDealt;
							System.out.println("# You dealt " + heroDamageDealt + " HP to " + enemy + "! #");
							enter.nextLine();
							if (enemyHP <= 0) {
								int dropExperience;
								switch (enemyLevel) {
									case 1: dropExperience = 5;
											break;
									case 2: dropExperience = 10;
											break;
								
									}
								System.out.println("# You defeated " + enemy + "! #");
								enter.nextLine();
								System.out.println("# " + enemy + " has dropped " + dropExperience + " exp. points! #");
							}
							System.out.println("# " + enemy + " dealt " + enemyDamageDealt + " HP to you! #");
				}
			}
		}
	}
}
