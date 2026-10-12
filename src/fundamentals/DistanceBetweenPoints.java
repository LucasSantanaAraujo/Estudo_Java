package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class DistanceBetweenPoints {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("\nCoordinates of point A(x1, y1) :");
        System.out.println("x1 : ");
        int x1 = scanner.nextInt();
        System.out.println("y1 : ");
        int y1 = scanner.nextInt();

        System.out.println("\nCoordinates of point B(x2, y2) :");
        System.out.println("x2 : ");
        int x2 = scanner.nextInt();
        System.out.println("y2 : ");
        int y2 = scanner.nextInt();

        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.printf("\nDistance between A and B is = %.2f\n", distance);

        scanner.close();
    }
}
