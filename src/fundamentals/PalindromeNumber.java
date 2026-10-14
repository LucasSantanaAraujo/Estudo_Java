package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        int num = Math.abs(n);

        if (num == 0){
            System.out.print("0");
            return;
        }

        int reversed = 0;
        while (num > 0){
            reversed = (reversed * 10) + (num % 10);
            num = num / 10;
        }

        if (reversed == n){
            System.out.println("The number " + n + " is a palindrome");
        } else {
            System.out.println("The number " + n + " is NOT a palindrome");
        }
        scanner.close();
    }
}
