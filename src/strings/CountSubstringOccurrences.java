package strings;

import java.util.Locale;
import java.util.Scanner;


public class CountSubstringOccurrences {
    /** Counts overlapping occurrences: "aa" appears 3 times in "aaaa". */
    public static int countOccurrences(String text, String word){
        if (text == null || word == null || word.isEmpty() || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= text.length() - word.length(); i++) {
            if (FindWord.indexOf(text.substring(i), word) == 0) {
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

        System.out.print("Enter the substring : ");
        String word = scanner.nextLine();

        int occurences = countOccurrences(str, word);

        System.out.println("The string '" + word + "' appears in '" + str + "' " + occurences + " times");

        scanner.close();
    }
}
