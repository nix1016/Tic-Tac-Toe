import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] sudoku = new int[n * n][n * n];
        int[][] sudokuTranspose = new int[n * n][n * n];
        int[][] sudokuBlocks = new int[n * n][n * n];
        int temp = 0;
        boolean pass = true;

        int x = 0;
        int y = 0;

        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                temp = scanner.nextInt();
                if (temp < 1 || temp > n * n) {
                    pass = false;
                    break;
                }
                sudoku[i][j] = temp;
                sudokuTranspose[j][i] = temp;

                x = j / n + (i / n) * n;
                y = j % n + (i % n) * n;

                sudokuBlocks[x][y] = temp;

            }
        }

        if (pass) {
            for (int i = 0; i < sudoku.length; i++) {
                pass = checkArray(sudoku[i]);
                if (!pass) {
                    break;
                } else {
                    pass = checkArray(sudokuTranspose[i]);
                    if (!pass) {
                        break;
                    } else {
                        pass = checkArray(sudokuBlocks[i]);
                        if (!pass) {
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(pass ? "YES" : "NO");

    }

    public static boolean checkArray(int[] arr) {
        boolean pass = true;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                pass = false;
                break;
            }
        }

        return pass;
    }
}
