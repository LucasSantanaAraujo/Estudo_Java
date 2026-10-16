package fundamentals;

public class MultiplicationGrid {
    public static void main(String[] args) {
        System.out.print("    |");
        for (int col = 1; col <= 10; col++) {
            System.out.printf("%4d", col);
        }
        System.out.println();
        System.out.println("-----" + "-".repeat(40));

        for (int row = 1; row <= 10; row++) {
            System.out.printf("%3d |", row);
            for (int col = 1; col <= 10; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
