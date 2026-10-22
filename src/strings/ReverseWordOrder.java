package strings;

import java.util.Locale;
import java.util.Scanner;

public class ReverseWordOrder {

    public static String reverseWordOrder(String text){
        if (text == null){
            return "";
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return "";
        }

        String[] words = clean.split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--){
            reversed.append(words[i]);

            if (i > 0){
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.println("The string reversed is '" + reverseWordOrder(str) + "'");

        scanner.close();
    }
}
