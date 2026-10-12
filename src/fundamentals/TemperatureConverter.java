package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class TemperatureConverter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Fahrenheit temperature: ");
        double fahrenheit = scanner.nextDouble();

        System.out.printf("Celsius temperature: %.2fºC%n", fahrenheitToCelsius(fahrenheit));

        scanner.close();
    }
}
