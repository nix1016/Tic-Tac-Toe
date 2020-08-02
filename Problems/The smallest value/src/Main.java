import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long number = scanner.nextLong();
        long count = 2;
        long last = 1;

        while (last * count <= number) {
            last *= count;
            count++;
        }

        System.out.println(count);
    }
}