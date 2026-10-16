package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class ChessboardPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the value of 'n' : ");
        int n = scanner.nextInt();

        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                if ((row + col) % 2 == 0){
                    System.out.print(" o ");
                } else {
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
