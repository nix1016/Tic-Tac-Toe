import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double M = scanner.nextInt();
        double P = scanner.nextInt();
        double K = scanner.nextInt();

        double deposit = M;
        double interest = P / 100;
        int years = 0;

        if (K > M) {
            do {
                deposit += deposit * interest;
                years++;
            } while (deposit < K);
        }

        System.out.println(years);
    }
}