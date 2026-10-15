package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the numbber of terms (n): ");
        int n = scanner.nextInt();

        long previous = 0;
        long current = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(previous + " ");
            long next = previous + current;
            previous = current;
            current = next;
        }

        scanner.close();
    }
}
