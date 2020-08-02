import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt();
        int sum = 0;

        while (element != 0) {
            sum += element;
            element = scanner.nextInt();
        }

        System.out.println(sum);
    }
}