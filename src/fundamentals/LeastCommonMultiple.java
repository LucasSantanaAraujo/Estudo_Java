package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class LeastCommonMultiple {

    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first number : ");
        int n1 = scanner.nextInt();

        System.out.print("Enter the second number : ");
        int n2 = scanner.nextInt();

        if (n1 == 0 || n2 == 0){
            System.out.println("0");
            return;
        } else {
            System.out.println("The LCM is : " + Math.abs(n1 / gcd(n1, n2) * n2));
        }
        scanner.close();
    }
}
