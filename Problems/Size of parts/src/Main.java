import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int perfect = 0;
        int fixed = 0;
        int rejects = 0;

        for (int i = 0; i < n; i++) {
            int part = scanner.nextInt();

            if (part > 0) {
                fixed++;
            } else if (part < 0) {
                rejects++;
            } else {
                perfect++;
            }
        }

        System.out.println(perfect + " " + fixed + " " + rejects);
    }
}