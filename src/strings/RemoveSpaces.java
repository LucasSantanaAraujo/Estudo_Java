package strings;

import java.util.Locale;
import java.util.Scanner;

public class RemoveSpaces {

    public static String removeSpaces(String text){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c != ' '){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println("String with no spaces : " + removeSpaces(str));

        scanner.close();
    }
}
