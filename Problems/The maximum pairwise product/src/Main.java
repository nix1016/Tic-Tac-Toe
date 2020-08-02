import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int len = scanner.nextInt();
        int[] numbers = new int[len];

        int max1 = 0;
        int max2 = 1;

        for (int i = 0; i < len; i++) {
            numbers[i] = scanner.nextInt();

            if (i > 1) {
                if (numbers[i] > numbers[max1]) {
                    max1 = i;
                } else if (numbers[i] > numbers[max2]) {
                    max2 = i;
                }
            }
        }

        System.out.println(numbers[max1] * numbers[max2]);

    }
}