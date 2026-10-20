package strings;

import java.util.Locale;
import java.util.Scanner;

public class TrimManual {

    public static String trim(String text){

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' '){
            start++;
        }

        while (end >= start && text.charAt(end) == ' '){
            end--;
        }

        if (start > end){
            return "";
        }

        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++){
            char c = text.charAt(i);
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        System.out.println("String with trim spaces : " + trim(str));

        scanner.close();
    }
}
