package strings;

import java.util.Locale;
import java.util.Scanner;

public class CountVowels {
    public static int countVowels(String text){
        int count = 0;

        for (int i = 0; i < text.length(); i++){
            char c = Character.toLowerCase(text.charAt(i));

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
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

        System.out.println("The number of vowels in the string " + str + " is : " + countVowels(str));

        scanner.close();
    }
}
