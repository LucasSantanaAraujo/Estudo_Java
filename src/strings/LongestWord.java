package strings;

import java.util.Locale;
import java.util.Scanner;

public class LongestWord {

    public static String longestWord(String text){
        if (text == null){
            return "";
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return "";
        }

        String[] words = clean.split("\\s+");
        String longest = words[0];

        for (int i = 1; i < words.length; i++){
            if (words[i].length() > longest.length()){
                longest = words[i];
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.println("The longest word in the string is '" + longestWord(str) + "'");

        scanner.close();
    }
}
