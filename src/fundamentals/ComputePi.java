package fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class ComputePi {

    public static double computePi(int maxDenominator){
        double sum = 0;
        for (int denominator = 1; denominator <= maxDenominator; denominator += 2){
            if (denominator % 4 == 1){
                sum += 1.0 / denominator;
            } else {
                sum -= 1.0 / denominator;
            }
        }
        return 4 * sum;
    }

    public static void main(String[] args) {
        System.out.println("Math.PI          = " + Math.PI);
        System.out.println("100 terms        = " + computePi(100));
        System.out.println("100 000 terms    = " + computePi(100000));
        System.out.println("1 000 000 terms  = " + computePi(1000000));
        System.out.println("10 000 000 terms = " + computePi(10000000));
    }
}
