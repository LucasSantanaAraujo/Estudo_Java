package strings;

import java.util.Locale;
import java.util.Scanner;

public class FindWord {

    public static int indexOf(String text, String word){
        if (text == null || word == null) {
            return -1;
        }
        if (word.isEmpty()) {
            return 0;
        }


        for (int i = 0; i <= (text.length() - word.length()); i++){
            int j;
            for (j = 0; j < word.length(); j++){
                if (text.charAt(i + j) != word.charAt(j)){
                    break;
                }
            }

            if (j == word.length()){
                return i;
            }
        }
        return (-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the word to find in the string : ");
        String word = scanner.nextLine();

        System.out.println(indexOf(str, word));

        scanner.close();
    }
}
