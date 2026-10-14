package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        scanner.close();
    }
}
