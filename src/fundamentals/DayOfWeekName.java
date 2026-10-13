package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a number for the day of the week [1-7] : ");
        int num = scanner.nextInt();

        switch (num){
            case 1:
                System.out.println("Sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tueday.");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid weekday number!");
                break;
        }
        scanner.close();
    }
}
