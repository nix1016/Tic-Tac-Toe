import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sequence = 1;
        int max = 1;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();

            if (i != 0 && numbers[i] > numbers[i - 1]) {
                sequence++;
                max = sequence;
            } else {
                sequence = 1;
            }
        }

        System.out.println(max);
    }
}