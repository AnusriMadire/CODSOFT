import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int numberToGuess = r.nextInt(100) + 1;
            int numberOfAttempts = 0;
            boolean hascorrectguess = false;
            int maxAttempts = 5;

            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts.");

            while (numberOfAttempts < maxAttempts && !hascorrectguess) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                numberOfAttempts++;

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You guessed the number.");
                    hascorrectguess= true;
                    score++;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            if (!hascorrectguess) {
                System.out.println("You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = sc.next().equalsIgnoreCase("yes");
        }

        System.out.println("Your final score is: " + score);
        sc.close();
    }
}
