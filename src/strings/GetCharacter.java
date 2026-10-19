package strings;

import java.util.Locale;
import java.util.Scanner;

public class GetCharacter {
    public static char getCharacter(String text, int index){
        if (index < 0 || index >= text.length()) {
            throw new IllegalArgumentException(
                    "Index " + index + " is outside the string (length " + text.length() + ")");
        }
        return text.charAt(index);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String s = scanner.nextLine();

        System.out.print("Enter the index of the string position : ");
        int index = scanner.nextInt();

        try {
            System.out.println("The character in the position " + index + " is the character : " + getCharacter(s, index));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid position number: " + e.getMessage());
        }


        scanner.close();
    }
}
