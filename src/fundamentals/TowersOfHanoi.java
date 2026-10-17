package fundamentals;

public class TowersOfHanoi {

    public static void hanoiTowers(int disks, char source, char aux, char target){
        if (disks == 1){
            System.out.println("Move disk 1 from " + source + " to " + target);
            return;
        }

        hanoiTowers(disks - 1, source, target, aux);
        System.out.println("Move disk " + disks + " from " + source + " to " + target);
        hanoiTowers(disks - 1, aux, source, target);

    }

    public static void main(String[] args) {
        System.out.println("Towers of Hanoi with 3 disks:");
        hanoiTowers(3, 'A', 'B', 'C');
    }
}
