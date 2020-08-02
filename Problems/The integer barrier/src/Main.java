import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            sum += n;

            if (sum >= 1000) {
              System.out.println(sum - 1000);
              break;
            } else if (n == 0) {
                System.out.println(sum);
                break;
            }
        }
        /* official solution
        while ((input = scanner.nextInt()) != 0) {
            sum += input;
            if (sum >= 1000) {
                sum = sum - 1000;
                break;
            }
        }

        System.out.println(sum);
         */
    }
}