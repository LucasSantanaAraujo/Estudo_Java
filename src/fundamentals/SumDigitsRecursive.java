package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SumDigitsRecursive {

    public static int recursiveSum(int n){
        int num = Math.abs(n);

        if (num < 10){
            return num;
        }

        return (num % 10) + recursiveSum(num / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Number : ");
        int number = scanner.nextInt();

        System.out.println("The sum of the digits of the number " + number + " is = " + recursiveSum(number));

        scanner.close();
    }
}
