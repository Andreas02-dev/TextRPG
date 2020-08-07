package textRPG;
import java.util.Scanner;

public class StartMenuSelection {
	static Scanner keyboard = new Scanner(System.in);
	public static void startMenuSelector() {
		boolean repeat = true;
		
		while (repeat) {
			
			System.out.println("(1) Start new game");
			System.out.println("(2) Exit game");
			int startMenuSelect = keyboard.nextInt();
			
			switch (startMenuSelect) {
			case 1: 
					repeat = false;
					break;
			case 2: 
					System.out.println("Goodbye!");
					repeat = false;
					break;
			default: System.out.println("Invalid selection.");
					 break;
			}
		}
	}
}
