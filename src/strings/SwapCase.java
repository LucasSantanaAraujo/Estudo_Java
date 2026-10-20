package strings;

import java.util.Locale;
import java.util.Scanner;

public class SwapCase {
    public static String swapCase(String text){
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z'){
                c = (char) (c - 32);
            } else if (c >= 'A' && c <= 'Z'){
                c = (char) (c + 32);
            }

            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println("String swapped : " + swapCase(str));

        scanner.close();
    }
}
