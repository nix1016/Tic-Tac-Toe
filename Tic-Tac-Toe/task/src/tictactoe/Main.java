package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        System.out.println("---------");
        int k = 0;
        for (int i=0; i < 3; i++) {
            System.out.print("| ");
            for (int j=0; j < 3; j++) {
                System.out.print(input.charAt(k) + " ");
                k++;
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}
