import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int col1 = scanner.nextInt();
        int col2 = scanner.nextInt();

        int[][] newMatrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == col1) {
                    newMatrix[i][j] = matrix[i][col2];
                } else if (j == col2) {
                    newMatrix[i][j] = matrix[i][col1];
                } else {
                    newMatrix[i][j] = matrix[i][j];
                }
            }
        }

        for (int[] vector: newMatrix) {
            for (int el: vector) {
                System.out.print(el + " ");
            }
            System.out.println("");
        }

        /* Official Solution
        for (int i = 0; i < matrix.length; i++) {
            final int tmp = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = tmp;
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
         */
    }
}