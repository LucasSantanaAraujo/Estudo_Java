package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class FactorialRecursive {

    public static long recursiveFactorial(int number){
        if (number < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative numbers");
        }

        if (number == 0){
            return 1;
        }

        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        scanner.close();

        if (n < 0) {
            System.out.println("Factorial does not exist for negative numbers.");
            return;
        }

        System.out.println(n + "! = " + recursiveFactorial(n));
    }
}
