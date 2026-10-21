package strings;

import java.util.Locale;
import java.util.Scanner;

public class IsPalindromeString {

    public static boolean isPalindrome(String text){
        String str = StringUtils.toLowerCase(StringUtils.removeSpaces(text));

        String reversed = StringUtils.reverse(str);

        return CompareStrings.areEqual(str, reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        if (isPalindrome(str)){
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        scanner.close();
    }
}
