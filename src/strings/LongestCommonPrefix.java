package strings;

import java.util.Locale;
import java.util.Scanner;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String a, String b){
        if (a == null || b == null){
            return "";
        }

        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++){
            if (a.charAt(i) != b.charAt(i)){
                return a.substring(0, i);
            }
        }
        return a.substring(0, minLength);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first word : ");
        String a = scanner.nextLine();

        System.out.print("Enter the second word : ");
        String b = scanner.nextLine();

        System.out.println("The longest common prefix between '" + a + "' and '" + b + "' is : " + longestCommonPrefix(a, b));

        scanner.close();
    }
}
