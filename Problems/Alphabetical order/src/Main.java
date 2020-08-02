import java.util.*;
import java.lang.String;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");

        boolean alphabetical = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                alphabetical = false;
                break;
            }
        }

        System.out.println(alphabetical);
    }
}