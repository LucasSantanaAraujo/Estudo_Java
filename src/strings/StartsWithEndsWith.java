package strings;

import java.util.Locale;
import java.util.Scanner;

public class StartsWithEndsWith {

    public static boolean startsWith(String text, String prefix){
        if (text == null || prefix == null) {
            return false;
        }
        if (prefix.isEmpty()) {
            return true;
        }
        if (prefix.length() > text.length()) {
            return false;
        }

        for (int i = 0; i < prefix.length(); i++){
            if (text.charAt(i) != prefix.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean endsWith(String text, String suffix){
        if (text == null || suffix == null) {
            return false;
        }
        if (suffix.isEmpty()) {
            return true;
        }
        if (suffix.length() > text.length()) {
            return false;
        }

        int startPoint = text.length() - suffix.length();

        for (int i = 0; i < suffix.length(); i++){
            if (text.charAt(startPoint + i) != suffix.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the prefix : ");
        String prefix = scanner.nextLine();

        System.out.print("Enter the suffix : ");
        String suffix = scanner.nextLine();

        System.out.print("The string starts with '" + prefix + "' ? ");
        System.out.println(startsWith(str, prefix));

        System.out.print("The string ends with '" + suffix + "' ? ");
        System.out.println(endsWith(str, suffix));

        scanner.close();
    }
}
