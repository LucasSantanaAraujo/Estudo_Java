package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter a grade [0-20] : ");
        int grade = scanner.nextInt();

        while (grade < 0 || grade > 20){
            System.out.println("Invalid grade number, enter a number between 0 and 20 : ");
            grade = scanner.nextInt();
        }

        if (grade <= 9){
            System.out.println("Insufficient.");
        } else if (grade >= 10 && grade <= 13){
            System.out.println("Sufficient.");
        } else if (grade >= 14 && grade <= 16){
            System.out.println("Good.");
        } else if (grade >= 17 && grade <= 18){
            System.out.println("Very Good.");
        } else {
            System.out.println("Excellent!");
        }
        scanner.close();
    }
}
