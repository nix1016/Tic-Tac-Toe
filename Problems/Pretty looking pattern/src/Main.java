import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] pattern = new char[4][4];
        String temp = "";
        String output = "YES";

        for (int i = 0; i < 4; i++) {
            temp = scanner.nextLine();
            pattern[i] = temp.toCharArray();
        }

        for (int i = 1; i < 4; i++) {
            for (int j = 1; j < 4; j++) {
                if (pattern[i][j] == pattern[i - 1][j - 1] &&
                        pattern[i][j] == pattern[i][j - 1] &&
                        pattern[i][j] == pattern[i - 1][j]) {
                    output = "NO";
                    break;
                }
            }
        }

        System.out.println(output);
    }
}