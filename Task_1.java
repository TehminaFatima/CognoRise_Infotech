package tasks;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;

        while (true) {
            int secretNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have " + maxAttempts + " attempts to guess the number between 1 and 100.");

            while (attempts < maxAttempts) {
                System.out.print("Guess the number: ");
                int userGuess = scanner.nextInt();

                if (userGuess == secretNumber) {
                    System.out.println("Congratulations! You guessed the correct number " + secretNumber + " in " + (attempts + 1) + " attempts.");
                    score++;
                    break;
                } else if (userGuess < (secretNumber - 10)) {
                    System.out.println("Too low.");
                } else if (userGuess < (secretNumber - 5)) {
                    System.out.println("Low.");
                } else if (userGuess < (secretNumber - 1)) {
                    System.out.println("Near.");
                } else if (userGuess > (secretNumber + 10)) {
                    System.out.println("Too high.");
                } else if (userGuess > (secretNumber + 5)) {
                    System.out.println("High.");
                } else {
                    System.out.println("Close but incorrect.");
                }

                attempts++;
            }

            if (attempts == maxAttempts) {
                System.out.println("Out of attempts. The correct number was: " + secretNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next().toLowerCase();
            if (!playAgain.equals("yes")) {
                break;
            }
        }

        System.out.println("Your score: " + score + " rounds won.");
        scanner.close();
    }
}
