package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("First Number = ");
        float num1 = scanner.nextFloat();

        System.out.println("Second Number = ");
        float num2 = scanner.nextFloat();

        System.out.println("Third Number = ");
        float num3 = scanner.nextFloat();

        float mean = (num1 + num2 + num3) / 3;
        System.out.printf("Arithmetic Mean = %.2f", mean);

        scanner.close();
    }
}
