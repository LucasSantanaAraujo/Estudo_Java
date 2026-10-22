package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountWords {

    public static int countWords(String text){
        if (text == null){
            return 0;
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return 0;
        }

        String[] words = clean.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.println("The string has " + countWords(str) + " words.");

        scanner.close();
    }
}
