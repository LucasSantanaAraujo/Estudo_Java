package strings;

import java.util.Locale;
import java.util.Scanner;

public class ReverseString {

    public static String reverse(String text){
        StringBuilder result = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--){
            result.append(text.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println("String reversed : " + reverse(str));

        scanner.close();
    }
}
