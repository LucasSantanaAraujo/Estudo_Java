package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountSpecificCharacter {
    public static int countCharacter(String text, char target){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            if (text.charAt(i) == target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to look for : ");
        char c = scanner.next().charAt(0);

        System.out.println("The character " + c + " appears in the string '" + str + "' " + countCharacter(str, c) + " times.");

        scanner.close();
    }
}
