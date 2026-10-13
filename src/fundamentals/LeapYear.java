package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a year : ");
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("The year " + year + " is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year " + year + " is a leap year.");
        } else {
            System.out.println("The year " + year + " is NOT a leap year.");
        }
        scanner.close();
    }
}
