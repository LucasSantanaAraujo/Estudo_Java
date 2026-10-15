package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        int num = Math.abs(n);

        int result = 1;
        for (int i = 1; i <= num; i++){
            result = result * i;
        }
        System.out.println(num + "! = " + result);

        scanner.close();
    }
}
