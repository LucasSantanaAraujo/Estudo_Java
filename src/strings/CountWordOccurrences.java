package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountWordOccurrences {

    public static int countWord(String text, String word){
        if (text == null || word == null){
            return 0;
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return 0;
        }

        String[] words = clean.split("\\s+");
        int count = 0;

        for (String current : words){
            if (CompareIgnoreCase.areEqualIgnoreCase(current, word)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.print("Enter the word to check how many times it appears in the string : ");
        String word = scanner.nextLine();

        System.out.println("The word '" + word + "' appears in the string : " + countWord(str, word) + " times.");

        scanner.close();
    }
}
