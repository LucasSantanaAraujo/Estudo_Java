package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Rectangle length : ");
        float length = scanner.nextFloat();

        System.out.println("Rectangle width : ");
        float width = scanner.nextFloat();

        float area = length * width;
        System.out.println("Rectangle Area = " + area);

        float perimeter = 2 * (length + width);
        System.out.println("Rectangle Perimeter = " + perimeter);

        scanner.close();
    }
}
