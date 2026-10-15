package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GeometricSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum = 0;
        double term = 1;

        for (int i = 1; i <= n; i++){
            term = term / 2;
            sum = sum + term;
        }

        System.out.println("The sum of the first " + n + " terms is = " + sum);

        scanner.close();
    }
}
