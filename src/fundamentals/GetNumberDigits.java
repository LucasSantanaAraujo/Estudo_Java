package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GetNumberDigits {

    public static void printDigits(int number){
        int n = Math.abs(number);

        if (n == 0){
            System.out.println("0");
            return;
        }

        int divider = 1;
        while (n / divider >= 10){
            divider = divider * 10;
        }

        while (divider > 0){
            System.out.print((n / divider) + " ");
            n = n % divider;
            divider = divider / 10;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        printDigits(num);

        scanner.close();
    }
}
