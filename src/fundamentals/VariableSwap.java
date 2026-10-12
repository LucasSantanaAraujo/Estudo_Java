package fundamentals;

public class VariableSwap {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int temp;

        System.out.println("\nBefore swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("\nAfter Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
