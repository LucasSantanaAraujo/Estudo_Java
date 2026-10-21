package strings;

import java.util.Locale;
import java.util.Scanner;

public class ContainsSubstring {

    public static boolean contains(String text, String word){
        return FindWord.indexOf(text, word) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.print("Enter the substring : ");
        String word = scanner.nextLine();

        if (contains(str, word)){
            System.out.println("The string '" + str + "' contains the substring '" + word + "'");
        } else {
            System.out.println("The string '" + str + "' does NOT contains the substring '" + word + "'");

        }

        scanner.close();
    }
}
