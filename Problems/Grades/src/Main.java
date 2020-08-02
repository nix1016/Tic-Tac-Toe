import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int noOfA = 0;
        int noOfB = 0;
        int noOfC = 0;
        int noOfD = 0;

        for (int i = 0; i < n; i++) {
            int grade = scanner.nextInt();

            if (grade == 5) {
                noOfA++;
            } else if (grade == 4) {
                noOfB++;
            } else if (grade == 3) {
                noOfC++;
            } else if (grade == 2) {
                noOfD++;
            }
        }

        System.out.println(noOfD + " " + noOfC + " " + noOfB + " " + noOfA);
    }
}