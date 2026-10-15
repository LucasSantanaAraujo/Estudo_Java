package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        if (num < 2){
            System.out.println("Not a perfect number.");
            return;
        }

        int sum = 0;
        for (int i = 1; i<= num / 2; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }

        if (sum == num){
            System.out.println("The number " + num + " is a perfect number.");
        } else {
            System.out.println("The number " + num + " is NOT a perfect number.");
        }

        scanner.close();
    }
}
