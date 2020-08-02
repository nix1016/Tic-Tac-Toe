import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] numbers = new int[len];

        int index = 0;

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] > numbers[index]) {
                index = i;
            }
        }

        System.out.println(index);
    }
}