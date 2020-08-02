import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        boolean output = false;

        for (int number: numbers) {
            if (n == number) {
                output = true;
                break;
            }
        }

        System.out.println(output);
    }
}