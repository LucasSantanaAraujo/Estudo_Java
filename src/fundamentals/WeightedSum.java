package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class WeightedSum {

    public static double weightedSum(int n, double a, double b){
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * a / b;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the 'n' value: ");
        int n = scanner.nextInt();

        System.out.print("Enter the 'A' value: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the 'B' value: ");
        double b = scanner.nextDouble();

        System.out.println("The result of the sum is : " + weightedSum(n, a, b));

        scanner.close();
    }
}