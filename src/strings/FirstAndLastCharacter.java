package strings;

import java.util.Locale;
import java.util.Scanner;

public class FirstAndLastCharacter {

    public static char firstCharacter(String text){
        if (text.length() == 0) {
            throw new IllegalArgumentException("Cannot get the first character of an empty string");
        }

        return text.charAt(0);
    }

    public static char lastCharacter(String text){
        if (text.length() == 0) {
            throw new IllegalArgumentException("Cannot get the last character of an empty string");
        }

        return text.charAt(text.length() - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        try {
            System.out.println("First character: " + firstCharacter(str));
            System.out.println("Last character: " + lastCharacter(str));
        } catch (IllegalArgumentException e) {
            System.out.println("Could not read characters: " + e.getMessage());
        }

        scanner.close();
    }
}
