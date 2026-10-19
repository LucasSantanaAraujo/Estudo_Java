package strings;

import java.util.Locale;
import java.util.Scanner;

public class RepeatString {

    public static String repeat(String text, int times) {
        if (times < 0) {
            throw new IllegalArgumentException("Times cannot be negative");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++) {
            result.append(text);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the number of times to repeat the string : ");
        int n = scanner.nextInt();

        System.out.println(repeat(str, n));

        scanner.close();
    }
}
