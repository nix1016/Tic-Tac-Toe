import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;
        boolean stop = false;

        for (int i = 0; !stop; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
                count++;
                if (count == n) {
                    stop = true;
                    break;
                }
            }
        }
    }
}