import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        boolean asc = true;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

            if (i > 0 && array[i] < array[i - 1]) {
                asc = false;
                break;
            }
        }

        System.out.println(asc);
    }
}