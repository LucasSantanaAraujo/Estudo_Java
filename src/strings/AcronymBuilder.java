package strings;

import java.util.Locale;
import java.util.Scanner;

public class AcronymBuilder {

    public static String buildAcronym(String text){
        if (text == null){
            return "";
        }

        String clean = StringUtils.trim(text);

        if (clean.isEmpty()){
            return "";
        }

        String[] words = clean.split("\\s+");
        StringBuilder acronym = new StringBuilder();

        for (String word : words){
            if (word.length() >= 3){ // 3 because its the minimal word length for an acronym
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return acronym.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a text : ");
        String text = scanner.nextLine();

        String acronym = buildAcronym(text);

        if (acronym.isEmpty()) {
            System.out.println("No word was long enough to build an acronym.");
        } else {
            System.out.println("Acronym : " + acronym);
        }

        scanner.close();
    }
}
