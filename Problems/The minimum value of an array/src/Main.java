import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int smallest = scanner.nextInt();
        numbers[0] = smallest;

        for (int i = 1; i < n; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println(smallest);

        /* official solution
        final Scanner scanner = new Scanner(System.in);
        final int[] array = new int[scanner.nextInt()];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println(min);
         */
    }
}