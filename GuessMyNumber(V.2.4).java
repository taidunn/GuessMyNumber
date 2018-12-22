//Version 2.4
/*Incomplete*/
import java.util.*;

public class GuessMyNumber {

	private static int randomNumberEnt;
	private static int magic = 0;
	private static int generatedNumber = (int)(Math.random()*100);
	private static int h = 0;

	private static void promptForInput() {
		h++;
		System.out.println(h + "/10");
		System.out.print("Enter a number between 1 and 100: ");
		magic = checkInput();
		ifstate();
	}
	private static void ifstate() {
		if (magic != 0) {
			hold();
		}
		else {
			promptForInput();
		}
	}

	private static int checkInput() {
		try {
			return userInput.nextInt();
		}
		catch (InputMismatchException e) {
			userInput.next();
			System.out.println("That isn't a whole number.");
			return 0;
		}
	}

	private static void hold() {
		randomNumberEnt = userInput.nextInt();
				if (h == (int)10) {
					System.out.println("You have reached the maximum amount of attempts");
				}
				else if (randomNumberEnt > 100){
					promptForInput();
				}
				else if (randomNumberEnt <= 0) {
					promptForInput();
				}
				else if (randomNumberEnt < generatedNumber) {
					promptForInput();
				}
	}

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		promptForInput();
		if (h == (int)10) {
			System.out.println("Your guessed number was " + randomNumberEnt + " and the generated number was " + generatedNumber);
			System.out.println("The AI's was higher. You used all of your " + h + " attempts");
		}
		else {
			System.out.println("Your guessed number was " + randomNumberEnt + " and the generated number was " + generatedNumber);
			System.out.println("Your number was higher this took you " + h + " amount of attempts");
		}
	}
}
