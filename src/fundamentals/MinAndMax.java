package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the quantity of numbers : ");
        int n = scanner.nextInt();

        int min = 999999;
        int max = 0;

        for (int i = 1; i <= n; i++){
            System.out.print(i + "º number : ");
            int num = scanner.nextInt();

            if (num < min){
                min = num;
            }
            if (num > max){
                max = num;
            }
        }

        System.out.println("The max number is : " + max);
        System.out.println("The min number is : " + min);

        scanner.close();
    }
}
