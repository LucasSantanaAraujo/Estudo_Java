package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class TriangleValidity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter the first side of the triangle : ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second side of the triangle : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third side of the triangle : ");
        int n3 = scanner.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)){
            System.out.println("It is a triangle!");
        } else {
            System.out.println("It is NOT a triangle!");
        }
    }
}
