package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountLettersAndDigits {

    public static int countLetters(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isLetter(c)){
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isDigit(c)){
                count++;
            }
        }
        return count;
    }

    public static int countOthers(String text){
        return text.length() - countLetters(text) - countDigits(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println("The number of letters in the string '" + str + "' is : " + countLetters(str));
        System.out.println("The number of digits in the string '" + str + "' is : " + countDigits(str));
        System.out.println("The number of others characters in the string '" + str + "' is : " + countOthers(str));

        scanner.close();
    }
}
