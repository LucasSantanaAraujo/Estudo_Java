package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++){
            sum += 1.0 / i;
        }

        System.out.println("The sum of the first " + n + " terms is = " + sum);

        scanner.close();
    }
}
