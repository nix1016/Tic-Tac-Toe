import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < count; i++) {
            int n = scanner.nextInt();
            if (n % 6 == 0) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}