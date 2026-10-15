package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int num = scanner.nextInt();

        if (num <= 1){
            System.out.println("The number " + num + " is NOT prime");
            return;
        }

        if (num == 2){
            System.out.println("2 is a prime number.");
            return;
        }

        if (num % 2 == 0){
            System.out.println("The number " + num + " is NOT prime.");
            return;
        }

        for (int i = 3; i * i <= num; i += 2){
            if (num % i == 0){
                System.out.println("The number " + num + " is NOT prime.");
                return;
            }
        }
        System.out.println("The number " + num + " is prime.");

        scanner.close();
    }
}
