package fundamentals;

import java.util.Scanner;
import java.util.Locale;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Number of seconds : ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);

        scanner.close();
    }
}
