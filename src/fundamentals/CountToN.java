package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class CountToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number : ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}
