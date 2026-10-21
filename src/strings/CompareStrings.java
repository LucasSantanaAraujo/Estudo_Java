package strings;

import java.util.Locale;
import java.util.Scanner;

public class CompareStrings {

    public static boolean areEqual(String a, String b){
        if (a.length() != b.length()){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first string : ");
        String a = scanner.nextLine();

        System.out.print("Enter the second string : ");
        String b = scanner.nextLine();

        if (areEqual(a, b)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are different.");
        }

        scanner.close();
    }
}
