package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SignOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number : ");
        int num = scanner.nextInt();

        if (num < 0){
            System.out.println("The number " + num + " is negative.");
        } else if (num > 0) {
            System.out.println("The number " + num + " is positive.");
        } else {
            System.out.println("The number " + num + " is zero.");
        }
        scanner.close();
    }
}
