package textRPG;
import java.util.Scanner;

public class Town {

	static Scanner keyboard = new Scanner(System.in);
	static Scanner enter = new Scanner(System.in);
	
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
				Game.Dungeon(hero);
				break;
		}
		
	}
	
}
