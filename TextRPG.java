package textRPG;

public class TextRPG {
	static int[] leveling = new int[100];
	public static void main(String[] args) {
		
		double a = 500;
		for (int i = 0; i<=99; i++) {
			a = a * 1.081;
			leveling[i] = (int) Math.round(a);
		}
	StartMenu.startMenu();
	}
}