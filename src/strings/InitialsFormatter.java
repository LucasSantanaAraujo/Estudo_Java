package strings;

import java.util.Locale;
import java.util.Scanner;

public class InitialsFormatter {

    public static String formatInitials(String fullName){
        if (fullName == null) {
            return "";
        }

        String clean = StringUtils.trim(fullName);

        if (clean.isEmpty()) {
            return "";
        }

        String[] names = clean.split("\\s+");
        StringBuilder result = new StringBuilder();

        result.append(names[0]);

        for(int i = 1; i < names.length; i++){
            result.append(" ");
            result.append(Character.toUpperCase(names[i].charAt(0)));
            result.append(".");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a full name : ");
        String fullName = scanner.nextLine();

        System.out.println("Formatted : " + formatInitials(fullName));

        scanner.close();
    }
}
