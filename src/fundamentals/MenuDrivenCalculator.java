package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int option;

        do {
            System.out.println();
            System.out.println("=============== MENU CALCULATOR ===============");
            System.out.println("1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("0 - Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            if (option == 0){
                System.out.println("Ending...");
                continue;
            }

            if (option < 0 || option > 4){
                System.out.println("Invalid option number.");
                continue;
            }

            System.out.print("Enter the first number : ");
            double n1 = scanner.nextDouble();

            System.out.print("Enter the second number : ");
            double n2 = scanner.nextDouble();

            switch (option){
                case 1:
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0){
                        System.out.println("Cant divide by zero");
                    } else {
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                        break;
                    }
                default:
                    break;
            }
        } while (option != 0);

        scanner.close();
    }
}
