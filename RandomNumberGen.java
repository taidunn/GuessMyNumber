import java.util.Scanner;
public class RandomNumberGen {
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a number between 1 and 100: ");
		if (userInput.hasNextInt())
		{
			int randomNumberEnt = userInput.nextInt();
			if (randomNumberEnt <= 100) {
				int generateRandom = (int)(Math.random()*101);
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
		}
	}
}
