import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* official solution for the turning scans into numeric matrix
        String temp = "";
        String finalString = "";
        int dim = -1;

        while (!"end".equals(temp)) {
            finalString = finalString + temp + " ";
            temp = scanner.nextLine();
            dim++;
        }

        scanner.close();
        scanner = new Scanner(finalString);
        int count = 0;

        while (scanner.hasNextInt()) {
            scanner.nextInt();
            count++;
        }

        scanner.close();
        int column = count / dim;
        int[][] inArray = new int[dim][column];
        scanner = new Scanner(finalString);

        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < column; j++) {
                inArray[i][j] = scanner.nextInt();
            }
        }
         */

        String input = "";
        String temp = "";
        int rows = 0;
        int cols = 0;

        temp = scanner.nextLine();
        while (!"end".equals(temp)) {
            input += temp + ",";
            rows++;
            cols = temp.split(" ").length;
            temp = scanner.nextLine();
        }

        String[] line = new String[rows];
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            line = input.split(",");
            for (int j = 0; j < cols; j++) {
                temp = line[i].split(" ")[j];
                matrix[i][j] = Integer.parseInt(temp);
            }
        }

        int[][] newMatrix = new int[rows][cols];
        int value = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                value = matrix[(i - 1 + rows) % rows][j] +
                         matrix[(i + 1 + rows) % rows][j] +
                         matrix[i][(j - 1 + cols) % cols] +
                         matrix[i][(j + 1 + cols) % cols];
                newMatrix[i][j] = value;
            }
        }

        for (int[] vector: newMatrix) {
            for (int el: vector) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}