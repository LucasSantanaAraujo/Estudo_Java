package strings;

import java.util.Locale;
import java.util.Scanner;

public class PrintEachCharacter {
    public static void printEachCharacter(String text){
        for (int i = 0; i < text.length(); i++){
            System.out.println(i + ": " + text.charAt(i));
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter a string : ");
        String str = scanner.nextLine();

        printEachCharacter(str);

        scanner.close();
    }
}
