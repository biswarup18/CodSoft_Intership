import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        boolean playAgain = true;
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = 10;
            boolean hasGuessedCorrectly = false;
            System.out.println("I have generated a number between 1 and 100. Can you guess it?");
            while (attemptsLeft > 0 && !hasGuessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number correctly.");
                    score += 10;
                    hasGuessedCorrectly = true;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again. Attempts left: " + attemptsLeft);
                } else {
                    System.out.println("Too low! Try again. Attempts left: " + attemptsLeft);
                }
            }
            if (!hasGuessedCorrectly) {
                System.out.println("Sorry! You have run out of attempts. The correct number was: " + numberToGuess);
            }
            System.out.print("Would you like to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
        }
        System.out.println("Your final score is: " + score);
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}