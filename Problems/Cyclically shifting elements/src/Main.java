import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 1; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        if (n != 0) {
            a[0] = scanner.nextInt();
        }

        for (int number: a) {
            System.out.print(number + " ");
        }
    }
}