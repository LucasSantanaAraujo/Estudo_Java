package strings;

import java.util.Locale;
import java.util.Scanner;

public class FormatText {
    public static String format(String text){
        if (text == null){
            return "";
        }

        return CapitalizeEachWord.capitalizeEachWord(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.println("The formatted string is : " + format(str));

        scanner.close();
    }
}
