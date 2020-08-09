import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        int a;
        int b;
        int c;
        double area = 0;

        switch (shape) {
            case "triangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                double s = 0.5 * (a + b + c);
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                break;
            case "circle":
                a = scanner.nextInt();
                area = 3.14 * a * a;
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                area = a * b;
                break;
        }

        System.out.println(area);
    }
}