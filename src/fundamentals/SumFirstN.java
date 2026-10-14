package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SumFirstN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum of all integers from 1 to " + n + " is = " + sum);

        scanner.close();
    }
}
