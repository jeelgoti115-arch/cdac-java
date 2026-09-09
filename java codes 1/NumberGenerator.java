import java.util.Random;
import java.util.Scanner;

public class NumberGenerator {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int target = random.nextInt(101);
		int guess;

		System.out.println("Guess the number between 0 and 100.");

		do {
			System.out.print("Enter your guess: ");
			guess = scanner.nextInt();

			if (guess < target) {
				System.out.println("Too low.");
			} else if (guess > target) {
				System.out.println("Too high.");
			}
		} while (guess != target);

		System.out.println("Correct! The number was " + target + ".");
		scanner.close();
	}
}
