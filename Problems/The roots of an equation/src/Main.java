import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for (int i = 0; i < 1000; i++) {
            if (i * i * i * a + b * i * i + c * i + d == 0) {
                System.out.println(i);
            }
        }

        /* jetBrains solution - should be count < 3
        for (long x = 0, count = 0; x <= 1000 && count < 4; x++) {
            if (a * x * x * x + b * x * x + c * x + d == 0) {
                System.out.println(x);
                count += 1;
            }
        }
         */
    }
}
