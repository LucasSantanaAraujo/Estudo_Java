package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GcdRecursive {
    public static int gcdRecursive(int a, int b){
        if (b == 0){
            return Math.abs(a);
        }

        return gcdRecursive(b, a % b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first number : ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.println("The GCD is : " + gcdRecursive(a, b));

        scanner.close();
    }
}
