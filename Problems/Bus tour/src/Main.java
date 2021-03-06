import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int noOfBridges = scanner.nextInt();
        boolean crash = false;

        for (int i = 0; i < noOfBridges; i++) {
            if (busHeight >= scanner.nextInt()) {
                System.out.println("Will crash on bridge " + ++i);
                crash = true;
                break;
            }
        }

        if (!crash) {
            System.out.println("Will not crash");
        }
    }
}