import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        String op = scanner.next();
        long m = scanner.nextLong();

        switch (op) {
            case "+":
                System.out.println(n + m);
                break;
            case "-":
                System.out.println(n - m);
                break;
            case "/":
                if (m == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(n / m);
                }
                break;
            case "*":
                System.out.println(n * m);
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}