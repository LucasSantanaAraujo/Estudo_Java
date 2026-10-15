package fundamentals;

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("I have picked a number between 1 and 100.");

        do {
            System.out.print("Enter your guess : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < number){
                System.out.println("Higher.");
            } else if (guess > number){
                System.out.println("Lower.");
            }
        } while (guess != number);

        System.out.println("Congratulations, you guessed correctly; the random number was " + number);
        System.out.println("You have tried " + attempts + " times.");

        scanner.close();
    }
}
