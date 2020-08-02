import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[][] stars = new String[n][n];

        for (String[] row: stars) {
            Arrays.fill(row, ".");
        }

        int middle = n / 2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i == middle || j == middle ||
                    j == n - 1 - i) {
                    stars[i][j] = "*";
                }
                System.out.print(stars[i][j] + " ");
            }
            System.out.println();
        }

    }
}