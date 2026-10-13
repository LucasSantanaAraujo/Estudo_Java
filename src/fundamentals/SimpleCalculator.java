package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter the first number : ");
        double n1 = scanner.nextDouble();

        System.out.println("Enter the second number : ");
        double n2 = scanner.nextDouble();

        System.out.println("Enter a operator [+, -, *, /] : ");
        char operator = scanner.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                break;
            case '-':
                System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                break;
            case '*':
                System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                break;
            case '/':
                if (n2 == 0){
                    System.out.println("Division by zero, impossible operation!");
                    break;
                } else {
                    System.out.printf("%.1f / %.1f = %.1f", n1, n2, (n1 / n2));
                    break;
                }
            default:
                System.out.println("Wrong operator.");
                break;
        }
        scanner.close();
    }
}
