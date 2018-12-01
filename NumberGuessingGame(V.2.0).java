//NEWEST VERSION
/*COMPLETE*/
//Version 2.4 Release Date Unknown\\
import java.util.Scanner;

public class RandomNumberGen {

	private static int randomNumberEnt;
	private static int generatedNumber = (int)(Math.random()*100);
	private static int h = 0;

	private static void promptForInput() {
		h++;
		System.out.println(h + "/10");
		System.out.print("Enter a number between 1 and 100: ");
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

		//System.out.println(generatedNumber);
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
