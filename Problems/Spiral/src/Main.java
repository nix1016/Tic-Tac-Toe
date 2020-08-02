import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] spiral = new int[n][n];
      /* https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
        int row = max;
        int col = max;
        int k = 0;
        int l = 0;
        int n = 1;

        while (k < row && l < col) {

            for (int j = l; j < col; j++) {
                spiral[k][j] = n;
                n++;
            }
            k++;

            for (int i = k; i < row; i++) {
                spiral[i][row - 1] = n;
                n++;
            }
            col--;

            if (k < row) {
                for (int j = col - 1; j >= l; j--) {
                    spiral[row - 1][j] = n;
                    n++;
                }
                row--;
            }

            if (l < col) {
                for (int i = row - 1; i >= k; i--) {
                    spiral[i][l] = n;
                    n++;
                }
                l++;
            }

        } */
        int value = 1;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value <= n * n) {
            for (int i = minCol; i <= maxCol; i++) {
                spiral[minRow][i] = value;
                value++;
            }
            for (int i = minRow + 1; i <= maxRow; i++) {
                spiral[i][maxCol] = value;
                value++;
            }
            for (int i = maxCol - 1; i >= minCol; i--) {
                spiral[maxRow][i] = value;
                value++;
            }
            for (int i = maxRow - 1; i >= minRow + 1; i--) {
                spiral[i][minCol] = value;
                value++;
            }
            minCol++;
            minRow++;
            maxCol--;
            maxRow--;
        }

        for (int[] vector: spiral) {
            for (int el: vector) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}