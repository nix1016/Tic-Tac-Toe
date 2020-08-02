import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[] max = new int[3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] > max[0] || i == 0 && j == 0) {
                    max[0] = matrix[i][j];
                    max[1] = i;
                    max[2] = j;
                }
            }
        }

        System.out.println(max[1] + " " + max[2]);

    }
}