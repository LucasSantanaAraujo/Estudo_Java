package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the value of 'n' : ");
        int n = scanner.nextInt();

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
