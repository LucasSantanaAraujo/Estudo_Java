package strings;

import java.util.Locale;
import java.util.Scanner;

public class ReplaceCharacter {

    public static String replace(String text, char oldChar, char newChar){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if (c == oldChar){
                c = newChar;
            }
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Which character you want to change? : ");
        char oldChar = scanner.next().charAt(0);

        System.out.print("What new character you want to replace with? : ");
        char newChar = scanner.next().charAt(0);

        System.out.println("String with characters replaced : " + replace(str, oldChar, newChar));

        scanner.close();
    }
}
