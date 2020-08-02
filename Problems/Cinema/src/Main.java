import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] cinema = new int[n][m];
        // int[][] cinema = new int[scanner.nextInt()][scanner.nextInt()];
        int[] emptySeats = new int[n];
        int maxEmptySeats = 0;
        int currentEmptySeats = 0;

        for (int i = 0; i < n; i++) {
            maxEmptySeats = 0;
            currentEmptySeats = 0;
            for (int j = 0; j < m; j++) {
                cinema[i][j] = scanner.nextInt();
                if (cinema[i][j] == 0) {
                    currentEmptySeats++;
                } else {
                    currentEmptySeats = 0;
                }
                maxEmptySeats = currentEmptySeats > maxEmptySeats ? currentEmptySeats : maxEmptySeats;
            }
            emptySeats[i] = maxEmptySeats;
        }

        int k = scanner.nextInt();
        int row = 0;

        for (int i = 0; i < n; i++) {
            if (emptySeats[i] >= k) {
                row = i + 1;
                break;
            }
        }

        System.out.println(row);

    }
}