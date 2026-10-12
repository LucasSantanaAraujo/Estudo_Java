package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SumOfTwoDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Number : ");
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int lastDigit = number % 10;

        int sumOfDigits = firstDigit + lastDigit;

        System.out.println(firstDigit + " + " + lastDigit + " = " + sumOfDigits);

        scanner.close();
    }
}
