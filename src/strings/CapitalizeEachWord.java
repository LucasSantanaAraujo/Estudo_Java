package strings;

import java.util.Locale;
import java.util.Scanner;

public class CapitalizeEachWord {

    public static String capitalizeEachWord(String text){
        if (text == null){
            return "";
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return "";
        }

        String lower = StringUtils.toLowerCase(clean);
        String[] words = lower.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++){
            String word = words[i];

            result.append(Character.toUpperCase(word.charAt(0)));
            result.append(word.substring(1));

            if (i < words.length - 1){
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String str = scanner.nextLine();

        System.out.println(capitalizeEachWord(str));

        scanner.close();
    }
}
