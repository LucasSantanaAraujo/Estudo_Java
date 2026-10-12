package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class RegularPolygonArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Number of sides (n) : ");
        int n = scanner.nextInt();

        System.out.println("Side length (s) : ");
        double s = scanner.nextDouble();

        double area = (n * (s * s)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("Regular Polygon Area of %d sides and %.2f side length is = %.2f\n", n, s, area);

        scanner.close();
    }
}
