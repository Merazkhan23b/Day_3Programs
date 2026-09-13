import java.util.Scanner;

public class GuessTheNumberGame {

    public static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {
        int tryCount = 0;
        boolean guessedCorrectly = false;

        while (tryCount < maxTries && tryCount < guesses.length && !guessedCorrectly) {
            int currentGuess = guesses[tryCount];
            if (currentGuess > secretNumber) {
                System.out.print("Too high ");
            } else if (currentGuess < secretNumber) {
                System.out.print("Too low ");
            } else {
                System.out.print("Correct! You guessed it");
                guessedCorrectly = true;
                break;
            }
            tryCount++;
        }

        if (!guessedCorrectly) {
            System.out.print("Out of tries — the number was " + secretNumber);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter secret number: ");
        int secretNumber = scanner.nextInt();
        
        System.out.print("Enter maximum tries: ");
        int maxTries = scanner.nextInt();
        
        System.out.print("Enter number of guesses: ");
        int n = scanner.nextInt();
        
        int[] guesses = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter guess " + (i + 1) + ": ");
            guesses[i] = scanner.nextInt();
        }
        
        guessTheNumber(secretNumber, maxTries, guesses);
        
        scanner.close();
    }
}