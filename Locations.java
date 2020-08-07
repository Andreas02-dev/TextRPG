package textRPG;

import java.util.Random;
import java.util.Scanner;

public class Locations {
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
	
	//Dungeon location
	
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
				System.out.println("(2) Heal !NOT IMPLEMENTED YET!");
				System.out.println("(3) Run!");
				int choice = keyboard.nextInt();
				
				switch (choice) {
					case 1: enemyHP -= heroDamageDealt;
							System.out.println("# You dealt " + heroDamageDealt + " HP to " + enemy + "! #");
							enter.nextLine();
							if (enemyHP <= 0) {
								int dropExperience = enemyLevel * 5;
								System.out.println("# You defeated " + enemy + "! #");
								enter.nextLine();
								System.out.println("# " + enemy + " has dropped " + dropExperience + " exp. points! #");
								enter.nextLine();
								break;
							}
							heroHP -= enemyDamageDealt;
							System.out.println("# " + enemy + " dealt " + enemyDamageDealt + " HP to you! #");
							break;
					case 2: System.out.println("This function has not been added yet!");
							break;
					case 3: System.out.println("You succesfully ran away!");
							enter.nextLine();
							Locations.Dungeon(hero);
							break;
				}
			}
		}
	}
	
	//Town location
	
	public static void town(Heroes hero) {
		System.out.println("# Welcome to Jamestown! #");
		enter.nextLine();
		System.out.println("----------------------------------------------");
		System.out.println("Where would you like to go?");
		System.out.println("(1) Brewery !HAS NOT BEEN ADDED YET! ");
		System.out.println("(2) Dungeon of Death ");
		int selection = keyboard.nextInt();
		
		switch (selection) {
		case 1:	System.out.println("This feature has not been added yet!");
				break;
		case 2: System.out.println("Entering the Dungeon of Death!");
				enter.nextLine();
				Locations.Dungeon(hero);
				break;
		}
	}
}
