package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter the first side of the triangle : ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second side of the triangle : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third side of the triangle : ");
        int n3 = scanner.nextInt();

        if ((n1 < n2 + n3) && (n2 < n1 + n3) && (n3 < n1 + n2)){ // it is a triangle
            if (n1 == n2 && n1 == n3){
                System.out.println("It is an equilateral triangle.");
            } else if (n1 != n2 && n1 != n3 && n2 != n3){
                System.out.println("It is a scalene triangle.");
            } else {
                System.out.println("It is an isosceles triangle.");
            }
        } else {
            System.out.println("It is NOT a triangle!");
        }

        scanner.close();
    }
}
