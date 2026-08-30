import java.util.Random;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean playAgain = true;

        System.out.println("===== NUMBER GAME =====");

        while (playAgain) {

            int randomNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int guess = 0;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("Try to guess it!");

            while (guess != randomNumber) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                attempts++;

                if (guess > randomNumber) {
                    System.out.println("Too high! Try again.");
                }
                else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("Correct! 🎉");
                    System.out.println("You guessed the number in " + attempts + " attempts.");
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            String answer = sc.next();

            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\nThanks for playing!");
    }
}