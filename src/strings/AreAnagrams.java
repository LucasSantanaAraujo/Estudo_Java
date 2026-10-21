package strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AreAnagrams {

    public static boolean areAnagrams(String a, String b){
        if (a == null || b == null){
            return false;
        }

        String cleanA = StringUtils.toLowerCase(StringUtils.removeSpaces(a));
        String cleanB = StringUtils.toLowerCase(StringUtils.removeSpaces(b));

        if (cleanA.length() != cleanB.length()){
            return false;
        }

        char[] charsA = cleanA.toCharArray();
        char[] charsB = cleanB.toCharArray();

        Arrays.sort(charsA);
        Arrays.sort(charsB);

        return Arrays.equals(charsA, charsB);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the first word : ");
        String a = scanner.nextLine();

        System.out.print("Enter the second word : ");
        String b = scanner.nextLine();

        if(areAnagrams(a, b)){
            System.out.println("'" + a + "' and '" + b + "' are anagrams.");
        } else {
            System.out.println("'" + a + "' and '" + b + "' are NOT anagrams.");
        }

        scanner.close();
    }
}
