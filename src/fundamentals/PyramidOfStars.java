package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PyramidOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the value of 'n' : ");
        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++){
            for (int space = 0; space < n - row; space++){
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * row - 1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}
