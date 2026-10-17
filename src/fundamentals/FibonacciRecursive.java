package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class FibonacciRecursive {
    public static long fibonacciRecursive(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Fibonacci is undefined for negative indexes");
        }

        if (num <= 1){
            return num;
        }

        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the Fibonacci term to calculate (n): ");
        int n = scanner.nextInt();

        long start = System.currentTimeMillis();
        long result = fibonacciRecursive(n);
        long elapsed = System.currentTimeMillis() - start;

        System.out.println("Term " + n + " of Fibonacci is : " + result);
        System.out.println("Computed in " + elapsed + " ms");

        scanner.close();
    }
}
