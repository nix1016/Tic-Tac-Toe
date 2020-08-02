import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int n = 0;
        int length = scanner.nextInt();

        while (length > 0) {
            n = scanner.nextInt();
            if (n % 4 == 0 && n > result) {
                result = n;
            }
            length--;
        }

        System.out.println(result);
    }
}