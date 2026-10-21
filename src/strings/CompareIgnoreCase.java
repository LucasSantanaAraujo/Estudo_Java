package strings;

import java.util.Locale;
import java.util.Scanner;

public class CompareIgnoreCase {
    public static boolean areEqualIgnoreCase(String a, String b){
        String c = StringUtils.toLowerCase(a);
        String d = StringUtils.toLowerCase(b);

        return CompareStrings.areEqual(c, d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first string : ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string : ");
        String b = scanner.nextLine();

        if (areEqualIgnoreCase(a, b)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are different.");
        }

        scanner.close();
    }
}
