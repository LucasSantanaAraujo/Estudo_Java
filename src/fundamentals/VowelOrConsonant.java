package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a character : ");
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z'){
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                System.out.println("It is a vowel.");
            } else {
                System.out.println("It is a consonant.");
            }
        } else {
            System.out.println("It is a different character but not a letter.");
        }

        scanner.close();
    }
}
