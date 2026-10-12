package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class CircleMetrics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Circle Radius : ");
        double radius = scanner.nextDouble();

        double area = Math.PI * (radius * radius);
        double perimeter = 2 * Math.PI * radius;

        System.out.printf("Circle Area = %.2f\n", area);
        System.out.printf("Circle Perimeter = %.2f", perimeter);

        scanner.close();
    }
}
