import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] a = scanner.nextLine().split(" ");
        int n = scanner.nextInt();
        String[] b = new String[a.length];

        for (int i = 0; i < a.length; i++) {
            b[(i + n) % b.length] = a[i];
        }

        for (String el: b) {
            System.out.print(el + " ");
        }
    }
}