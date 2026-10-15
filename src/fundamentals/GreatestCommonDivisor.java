package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("The GCD is : " + Math.abs(a));

        scanner.close();
    }
}
