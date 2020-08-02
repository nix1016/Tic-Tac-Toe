import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];
        int triples = 0;

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

            if (i > 1 && array[i] - array[i - 1] == 1
                && array[i - 1] - array[i - 2] == 1) {
                triples++;
            }
        }

        System.out.println(triples);
    }
}