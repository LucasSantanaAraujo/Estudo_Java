package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Hexagon side : ");
        double s = scanner.nextDouble();

        double area = (3 * Math.sqrt(3) / 2) * (s * s);

        System.out.printf("Hexagon Area of side %.2f is = %.2f", s, area);

        scanner.close();
    }
}
