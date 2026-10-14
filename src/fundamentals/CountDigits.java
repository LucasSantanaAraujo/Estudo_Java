package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        int n = Math.abs(number);

        if (n == 0){
            System.out.println("1 digit");
        }

        int count = 0;

        while (n > 0){
            count++;
            n = n / 10;
        }
        System.out.println(count + " digits.");

        scanner.close();
    }
}
