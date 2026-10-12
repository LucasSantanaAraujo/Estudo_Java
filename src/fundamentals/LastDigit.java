package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Number : ");
        int n = scanner.nextInt();

        int lastDigit = Math.abs(n % 10);
        System.out.println("Last digit of " + n + " is : " + lastDigit);

        scanner.close();
    }
}
