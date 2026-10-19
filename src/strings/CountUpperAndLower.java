package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountUpperAndLower {

    public static int countUpperCase(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isUpperCase(c)){
                count++;
            }
        }
        return count;
    }

    public static int countLowerCase(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (Character.isLowerCase(c)){
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

        System.out.println("The number of Upper case letters is : " + countUpperCase(str));
        System.out.println("The number of Lower case letters is : " + countLowerCase(str));

        scanner.close();
    }
}
