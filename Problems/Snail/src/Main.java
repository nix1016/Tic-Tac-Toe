import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int progress = a;
        int days = 1;

        while (progress < h) {
            days++;
            progress += a - b;
        }

        /*
        for (int days = 1, cleared = 0; answer == 0; days++) {
            cleared += a;

            if (h <= cleared) {
                answer = days;
            } else {
                cleared -= b;
            }
        } */

        // int result = (height - night - 1) / (day - night) + 1;

        System.out.println(days);
    }
}