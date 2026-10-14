package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the base number : ");
        int base = scanner.nextInt();

        System.out.print("Enter the power number : ");
        int power = scanner.nextInt();

        while (power < 0){
            System.out.print("The power number cant be negative, enter a positive number : ");
            power = scanner.nextInt();
        }

        int result = 1;
        for (int i = 1; i <= power; i++){
            result = result * base;
        }
        System.out.println(base + "^" + power + " = " + result);

        scanner.close();
    }
}
