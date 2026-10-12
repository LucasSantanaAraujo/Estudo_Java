package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class IntegerDivision {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("x = ");
        int x = scanner.nextInt();

        System.out.println("y = ");
        int y = scanner.nextInt();

        if (y == 0) {
            System.out.println("Division by zero is not defined.");
            return;
        }

        int quotient = x / y;
        int remainderDivision = x % y;

        System.out.println("Quotient of " + x + "/" + y + " = " + quotient);
        System.out.println("Remainder of division of " + x + "/" + y + " = " + remainderDivision);
        System.out.println("Real division: " + ((double) x / y));

        scanner.close();
    }
}
