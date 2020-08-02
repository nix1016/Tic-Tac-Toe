import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] rectangle = new int[n][m];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = scanner.nextInt();
            }
        }

        int[][] newRectangle = new int[m][n];

        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                newRectangle[j][n - 1 - i] = rectangle[i][j];
            }
        }

        for (int[] vector: newRectangle) {
            for (int el: vector) {
                System.out.print(el + " ");
            }
            System.out.println("");
        }

        /* Official Solution
        for (int i = 0; i < matrix[0].length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                System.out.print(matrix[matrix.length - j - 1][i] + " ");
            }
            System.out.println();
        }
         */
    }
}