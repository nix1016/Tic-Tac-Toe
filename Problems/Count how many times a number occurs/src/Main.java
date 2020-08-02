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
        int occurs = 0;

        for (int number: numbers) {
            if (n == number) {
                occurs++;
            }
        }

        System.out.println(occurs);
    }
}