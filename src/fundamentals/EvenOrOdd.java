package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class EvenOrOdd {

    public static void isEvenOrOdd(int num){
        if (num % 2 == 0){
            System.out.println(num + " is even");
        }
        else {
            System.out.println(num + " is odd");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number : ");
        int number = scanner.nextInt();

        isEvenOrOdd(number);

        scanner.close();
    }
}
