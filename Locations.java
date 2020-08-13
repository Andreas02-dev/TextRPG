package textRPG;

import java.util.Random;
import java.util.Scanner;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Locations {
	// Import variables
	static Scanner keyboard = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
	static Random rand = new Random();
	
	// Dungeon variables
	static String[] monsters = {"Zombie"};
	static boolean running = true;
	static int enemyBaseDamage;
	static int enemyBaseHitpoints;
	static int enemyDamagePerLevel;
	static int enemyHitPointsPerLevel;
	static int enemyDamage;
	static int enemyHP;
	static int enemyLevel;
	
	
	// Buy variables
	static int buyAmount;
	static int healthPotionPrice = 5;

	
	
	// Town location
	
	public static void Town(Heroes hero) {
		System.out.println("----------------------------------------------");
		System.out.println("# Welcome to Jamestown! #");
		System.out.println("----------------------------------------------");
		enter.nextLine();
		System.out.println("Where would you like to go?");
		System.out.println("(1) Brewery");
		System.out.println("(2) Dungeon of Death");
		System.out.println("(3) Save game");
		int selection = keyboard.nextInt();
		boolean repeat = true;
		
		while (repeat) {
		
			switch (selection) {
			case 1:	System.out.println("# Entering the Brewery #");
					enter.nextLine();
					Locations.Brewery(hero);
					break;
			case 2: System.out.println("# Entering the Dungeon of Death! #");
					enter.nextLine();
					Locations.Dungeon(hero);
					repeat = false;
					break;
			case 3: System.out.println("# Saving game, enter to continue #");
					enter.nextLine();
					Locations.SavePlace(hero);
			default: System.out.println("Please make a valid selection!");
					Locations.Town(hero);
					break;
			}
		}
	}
	
	// Brewery location
	
	public static void Brewery(Heroes hero) {
		System.out.println("----------------------------------------------");
		System.out.println("# Welcome to the Brewery! #");
		System.out.println("----------------------------------------------");
		enter.nextLine();
		System.out.println("<Darius>: Hi, I'm Darius!");
		System.out.println("<Darius>: Would you like to buy something?");
		System.out.println("(1) Yes");
		System.out.println("(2) No");
		int enterShop = keyboard.nextInt();
		
		switch (enterShop) {
		case 1: 
				break;
		case 2: System.out.println("<Darius>: Stop wasting my time then!");
				enter.nextLine();
				Locations.Town(hero);
				break;
		default: System.out.println("Please enter a valid selection!");
				enterShop = keyboard.nextInt();
				break;
		}
		System.out.println("You have $" + Heroes.wallet + ".");
		System.out.println("# What would you like to buy? #");
		System.out.println("(1) 30HP Health potions");
		System.out.println("(2) Sorry, I don't want to buy anything");
		
		int selection = keyboard.nextInt();
		while (true) {
			switch (selection) {
				case 1:	System.out.println("Please select your amount:");
						buyAmount = keyboard.nextInt();
						System.out.println("Your total is $" + buyAmount * healthPotionPrice);
						enter.nextLine();
						System.out.println("Would you like to buy this amount?");
						System.out.println("(1) Yes");
						System.out.println("(2) No");
						int buyYesOrNo = keyboard.nextInt();

						switch (buyYesOrNo) {
					 		case 1:
					 				if ( Heroes.wallet >= (buyAmount * healthPotionPrice) ) {
					 					Heroes.wallet -= (buyAmount * healthPotionPrice);
					 					Heroes.healthPotionAmount += buyAmount;
					 					System.out.println("You have bought " + buyAmount + " health potions.");
					 				}
					 				else {
					 					System.out.println("You do not have enough gold to buy this amount!");
					 				}
					 				break;
					 		case 2: Locations.Brewery(hero);
					 				break;
					 		default: System.out.println("Please enter a valid selection!");
					 				buyYesOrNo = keyboard.nextInt();
					 				break;
						}
				case 2: Locations.Brewery(hero);
						break;
				default: System.out.println("Please enter a valid selection!");
						selection = keyboard.nextInt();
						break;
											
			}
		}
	}
	
	// Dungeon location
	
	public static void Dungeon(Heroes hero) {
		int counter = 0;
		while (running) {
			if ((counter%5 == 0) && (counter != 0)) {
				boolean choosing = true;
				while (choosing) {
					System.out.println("# Would you like to leave the Dungeon of Death, ALIVE? #");
					System.out.println("(1) Yes, I'd rather live a wimp than die a hero.");
					System.out.println("(2) NO, running away is for cowards!");
					int choice = keyboard.nextInt();
				
					switch (choice) {
						case 1: System.out.println("# After running a long time, you finally find Jamestown again. #");
								enter.nextLine();
								Locations.Town(hero);
								choosing = false;
								break;
						case 2: choosing = false;
								break;
						default: System.out.println("Invalid selection!");
					}
				}
			}
				
			System.out.println("----------------------------------------------");
			int enemyIndex = rand.nextInt(monsters.length);
			String enemy = monsters[enemyIndex];
			
			switch (enemyIndex) {
				case 0:	if (counter >= 5 && counter % 2 == 0) {
							enemyLevel = (rand.nextInt(counter / 2)) + 1;
						}
						else {
							enemyLevel = (rand.nextInt(3)) + 1;
						}
						enemyBaseDamage = rand.nextInt(5);
						enemyBaseHitpoints = rand.nextInt(25);
						enemyDamagePerLevel = 2;
						enemyHitPointsPerLevel = 5;
						enemyDamage = (enemyLevel * enemyDamagePerLevel) + enemyBaseDamage;
						enemyHP = (enemyLevel * enemyHitPointsPerLevel) + enemyBaseHitpoints;
						break;
				default: break;
			}
			System.out.println("# A level " + enemyLevel + " " + enemy + " has appeared! #");
			System.out.println("----------------------------------------------");

			
		while (enemyHP > 0 ) {	
				enter.nextLine();
				System.out.println("# " + enemy + " has HP:" + enemyHP + " #");
				enter.nextLine();
				Heroes.MaximumHitpointsCalculator();
				System.out.println("# You have " + Heroes.hitpoints + "/" + Heroes.maximumHitPoints + "HP. #");
				enter.nextLine();
				System.out.println("----------------------------------------------");
				System.out.println("What would you like to do?");
				System.out.println("----------------------------------------------");
				System.out.println("(1) Attack");
				System.out.println("(2) Heal");
				System.out.println("(3) Run!");
				int choice = keyboard.nextInt();
				
				switch (choice) {
					case 1: Heroes.DamageCalculator();
							enemyHP -= Heroes.damage;
							System.out.println("# You dealt " + Heroes.damage + " HP to " + enemy + "! #");
							enter.nextLine();
							if (enemyHP <= 0) {
								int dropExperience = enemyLevel * 5;
								int dropGold = enemyLevel;
								Heroes.wallet += dropGold;
								Heroes.AddExperience(dropExperience);
								int beforeLevel = Heroes.level;
								Heroes.CalculateLevel();
								if (Heroes.level != beforeLevel) {
									System.out.println("# You have leveled from " + beforeLevel + " to " + Heroes.level + " #");
									enter.nextLine();
								}
								System.out.println("# You defeated " + enemy + "! #");
								enter.nextLine();
								System.out.println("# " + enemy + " has dropped " + dropExperience + " exp. points! #");
								enter.nextLine();
								System.out.println("# " + enemy + " has dropped " + dropGold + " gold! #");
								enter.nextLine();
								counter++;
								if (counter == 1) {
									System.out.println("# You have killed 1 monster in succession!");
									enter.nextLine();
								}
								else { System.out.println("# You have killed " + counter + " monsters in succession! #");
									   enter.nextLine(); }
								break;
							}
							Heroes.HitpointsAfterDamageCalculator(enemyDamage);
							System.out.println("# " + enemy + " dealt " + enemyDamage + " HP to you! #");
							if (Heroes.hitpoints <= 0) {
								System.out.println("You died!");
								enter.nextLine();
								HeroCreator.heroCreator();
								break;
							}
							break;
					case 2: boolean potionChooser = true;
							while (potionChooser) {
								System.out.println("# Please choose which potion you'd like to consume! #");
								System.out.println("----------------------------------------------");
								System.out.println("(1) 30HP health potion (" + Heroes.healthPotionAmount + ") left.");
								System.out.println("(2) I don't want to consume anything!");
								int potionChoice = keyboard.nextInt();
								switch (potionChoice) {
									case 1: Heroes.MaximumHitpointsCalculator();
											if (Heroes.healthPotionAmount >= 1) {
												int fillerHP = Heroes.maximumHitPoints - Heroes.hitpoints;
												if (fillerHP >= 30) {
													Heroes.hitpoints += 30;
													System.out.println("# You have been healed by 30 HP! # ");
													Heroes.healthPotionAmount -= 1;
													enter.nextLine();
													Heroes.HitpointsAfterDamageCalculator(enemyDamage);
													System.out.println("# " + enemy + " dealt " + enemyDamage + " HP to you! #");
													enter.nextLine();
													potionChooser = false;
													break;
												}
											else {
													Heroes.hitpoints += fillerHP;
													System.out.println("# You have been healed by " + fillerHP + " HP! #");
													Heroes.healthPotionAmount -= 1;
													enter.nextLine();
													Heroes.HitpointsAfterDamageCalculator(enemyDamage);
													System.out.println("# " + enemy + " dealt " + enemyDamage + " HP to you! #");
													enter.nextLine();
													potionChooser = false;
													break;
											}
											}
											else {
												System.out.println("You do not have any health potions!");
												potionChooser = false;
												enter.nextLine();
												break;
											}
									case 2: break;
									default: System.out.println("Invalid selection!");
								}
								break;
							}
							break;
					case 3: System.out.println("You succesfully ran away!");
							enter.nextLine();
							Locations.Dungeon(hero);
							break;
					default: break;
				}
			}
		}
	}
	// Save method
	public static void SavePlace(Heroes hero) {
		
		// Update all variables to most recent
		Heroes.CalculateLevel();
		Heroes.DamageCalculator();
		Heroes.MaximumHitpointsCalculator();
		
		// Variables to be saved
		String saveName = Heroes.name;
		int saveLevel = Heroes.level;
		int saveExperience = Heroes.experience;
		int saveBaseDamage = Heroes.baseDamage;
		int saveDamagePerLevel = Heroes.damagePerLevel;
		String saveWeapon = Heroes.weapon;
		int saveWeaponAmplifier = Heroes.weaponAmplifier;
		int saveDamage = Heroes.damage;
		int saveBaseHitpoints = Heroes.baseHitpoints;
		int saveHitPointsPerLevel = Heroes.hitPointsPerLevel;
		int saveHitpoints = Heroes.hitpoints;
		int saveMaximumHitpoints = Heroes.maximumHitPoints;
		String saveArmor = Heroes.armor;
		int saveArmorAmplifier = Heroes.armorAmplifier;
		int saveWallet = Heroes.wallet;
		int saveHealthPotionAmount = Heroes.healthPotionAmount;
		
		try {
			// Create file
			FileOutputStream saveFile = new FileOutputStream("Savefile.txt");
			// Create ObjectOutputStream
			ObjectOutputStream output = new ObjectOutputStream(saveFile);
			// Write objects to file
			output.writeObject(saveName);
			output.writeInt(saveLevel);
			output.writeInt(saveExperience);
			output.writeInt(saveBaseDamage);
			output.writeInt(saveDamagePerLevel);
			output.writeObject(saveWeapon);
			output.writeInt(saveWeaponAmplifier);
			output.writeInt(saveDamage);
			output.writeInt(saveBaseHitpoints);
			output.writeInt(saveHitPointsPerLevel);
			output.writeInt(saveHitpoints);
			output.writeInt(saveMaximumHitpoints);
			output.writeObject(saveArmor);
			output.writeInt(saveArmorAmplifier);
			output.writeInt(saveWallet);
			output.writeInt(saveHealthPotionAmount);
			output.writeInt(HeroCreator.heroChoice);
			// Close output
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}
}
