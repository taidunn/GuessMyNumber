//Outdated on: November 22, 2018
//Still fully operational//
/*COMPLETE*/
//Please check out Version 1.2 (https://github.com/taidunn/Random-Number-Game/blob/master/NumberGuessingGame(V.1.2).java)**//
import java.util.Scanner;
public class GuessMyNumber {
	/*These public class names will need to be changed to whatever you decide
	*to change the file name to. At this moment the download will not run this
	*because the public class name does not match the file name. The file name was
	*changed so anyone could tell the Version I was on.
	*/

	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		int generateRandom = 0;
		System.out.print("Enter a number between 1 and 100: ");
		if (userInput.hasNextInt())
		{
			int randomNumberEnt = userInput.nextInt();
			if ((randomNumberEnt <= 100) && (randomNumberEnt > -1)) {
				int max1115 = (int)(Math.random()*116);
				/*The following if statement is to increase the amount of times
				*Math.random will pick a number greater than or equal to 100.
				*/
				if (max1115 >= 100) {
				//Any number greater than or equal to 100 will default to 100.
					generateRandom = 100;
				}
				else {
					generateRandom = max1115;
				}
				if (randomNumberEnt > generateRandom) {
					System.out.println("You entered the number " + randomNumberEnt + " and the generated number was " + generateRandom + ".");
					System.out.println("You guessed the highest number!");
					System.out.println("You won!");
					System.out.println("Thanks for playing the quick game.");
				}
				else if (randomNumberEnt < generateRandom) {
					System.out.println("You entered the number " + randomNumberEnt + " and the generated number was " + generateRandom + ".");
					System.out.println("The AI's Number was higher number!");
					System.out.println("The AI won.");
					System.out.println("Thanks for playing the quick game.");
				}
				else {
					System.out.println("You entered the number " + randomNumberEnt + " and the generated number was " + generateRandom + ".");
					System.out.println("No one was higher");
					System.out.println("No one won");
					System.out.println("Thanks for playing the quick game.");
				}
			}
			else {
				if (randomNumberEnt > 100) {
					System.out.println("You entered " + randomNumberEnt + ".");
					System.out.println("That number is too high for this game");
				}
				else {
					System.out.println("You entered " + randomNumberEnt + ".");
					System.out.println("That number is too low for this game");
				}
			}
		}
	}
}
