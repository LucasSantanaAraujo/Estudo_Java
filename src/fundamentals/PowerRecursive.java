package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class PowerRecursive {

    private static int naiveCalls = 0;
    private static int fastCalls = 0;

    public static long powerRecursive(int base, int exponent){
        naiveCalls++;

        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent is not supported");
        }

        if (exponent == 0){
            return 1;
        }

        return base * powerRecursive(base, exponent - 1);
    }

    public static long fastPower(int base, int exponent){
        fastCalls++;

        if (exponent < 0) {
            throw new IllegalArgumentException("Negative exponent is not supported");
        }

        if (exponent == 0){
            return 1;
        }

        if (exponent % 2 == 0){
            long half = fastPower(base, exponent / 2);
            return half * half;
        }

        return base * fastPower(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Enter the base number : ");
        int base = scanner.nextInt();

        System.out.print("Enter the power number : ");
        int exponent = scanner.nextInt();

        System.out.println(base + "^" + exponent + " naive = " + powerRecursive(base, exponent));
        System.out.println(base + "^" + exponent + " fast  = " + fastPower(base, exponent));

        naiveCalls = 0;
        fastCalls = 0;
        powerRecursive(2, 1000);
        fastPower(2, 1000);

        System.out.println();
        System.out.println("Calls needed for exponent 1000:");
        System.out.println("  naive version: " + naiveCalls);
        System.out.println("  fast version : " + fastCalls);

        scanner.close();
    }
}
