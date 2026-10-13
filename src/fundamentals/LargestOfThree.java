package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter the first number : ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int n2 = scanner.nextInt();

        System.out.println("Enter the third number : ");
        int n3 = scanner.nextInt();

        if (n1 == n2 && n1 == n3){
            System.out.println("The three numbers are equal.");
        } else {
            if (n1 > n2 && n1 > n3){
                System.out.println(n1 + " is the biggest number.");
            } else if (n2 > n1 && n2 > n3){
                System.out.println(n2 + " is the biggest number.");
            } else {
                System.out.println(n3 + " is the biggest number.");
            }
        }

        scanner.close();
    }
}
