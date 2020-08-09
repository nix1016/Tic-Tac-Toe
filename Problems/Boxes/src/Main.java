import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];

        for (int i = 0; i < 3; i++) {
            x[i] = scanner.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            y[i] = scanner.nextInt();
        }

        Arrays.sort(x);
        Arrays.sort(y);

        String comparison = "";

        for (int i = 0; i < 3; i++) {
            if (x[i] < y[i]) {
                if (comparison == "Box 1 > Box 2") {
                    comparison = "Incomparable";
                } else {
                    comparison = "Box 1 < Box 2";
                }
            } else if (x[i] > y[i]) {
                if (comparison == "Box 1 < Box 2") {
                    comparison = "Incomparable";
                } else {
                    comparison = "Box 1 > Box 2";
                }
            } else if (comparison == "") {
                comparison = "Box 1 = Box 2";
            }
        }

        System.out.println(comparison);

    }
}