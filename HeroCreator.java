package textRPG;
import java.util.Scanner;

public class HeroCreator {
	static Scanner keyboard = new Scanner(System.in);
	static Heroes archie = new Archer("Archie", 1, 5, 20);
	
	//system variable
	static Heroes hero;
	static boolean notRepeat = false;
	public static void heroCreator() {
		System.out.println("----------------------------------------------");
		System.out.println("Please choose your hero!");
		System.out.println("(1) Archer");
		int heroSelection = keyboard.nextInt();
		while (!notRepeat) {
			switch (heroSelection) {
			case 1:	hero = archie;
					Locations.town(hero);
					break;
			default: System.out.println("Invalid option!");
					notRepeat = true;
					break;
			}
		}
	}
}
