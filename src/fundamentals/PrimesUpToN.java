package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PrimesUpToN {

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        if (number == 2){
            return true;
        }
        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i * i <= number; i += 2){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a number : ");
        int n = scanner.nextInt();

        if (n < 2){
            System.out.println("There are no prime numbers.");
            return;
        }

        System.out.println("Prime numbers up to " + n + " : ");
        for (int i = 2; i <= n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
