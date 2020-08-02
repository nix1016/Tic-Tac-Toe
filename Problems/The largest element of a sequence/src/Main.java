import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int largest = n;

        while (n != 0) {
            if (n > largest) {
                largest = n;
            }
            n = scanner.nextInt();
        }

        System.out.println(largest);
    }
}