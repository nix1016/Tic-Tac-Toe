package tictactoe;
import java.util.Scanner;

public class Main {
    static char[][] ttt = new char[3][3];
    static int noOfX = 0;
    static int noOfO = 0;
    static Scanner scanner = new Scanner(System.in);
    static char turn = 'X';

    public static void main(String[] args) {
        setArray();
        String status = "Game not finished";

        while (status == "Game not finished") {
            printField();
            enterCoordinate();
            status = checkStatus();
            if (status != "Game not finished") {
                printField();
                System.out.println(status);
            }
        }
    }

    public static void setArray() {
        // System.out.print("Enter cells: ");
        // String input = scanner.nextLine();
        String input = "         ";
        char val;

        int k = 0;
        for (int i=0; i < 3; i++) {
            for (int j=0; j < 3; j++) {
                val = input.charAt(k);
                ttt[i][j] = val;
                if (val == 'X') {
                    noOfX++;
                } else if (val == 'O') {
                    noOfO++;
                }
                k++;
            }
        }
    }

    public static void enterCoordinate() {
        String error = "";
        boolean valid = false;
        int x = 0;
        int y = 0;

        while (!valid) {
            System.out.println("Enter the coordinates:");
            String[] newInput = scanner.nextLine().split(" ");

            try {
                x = Integer.parseInt(newInput[0]);
                y = Integer.parseInt(newInput[1]);
                error = checkCoordinates(ttt, x, y);
                if (error == "") {
                    valid = true;
                } else {
                    System.out.println(error);
                }
            } catch (Exception e) {
                System.out.println("You should enter numbers!");
            }
        }
    }

    public static String checkCoordinates(char[][] ttt, int x, int y) {
        String error = "";
        int row;
        int col;

        if (x < 0 || x > 3 || y < 0 || y > 3) {
            error = "Coordinates should be from 1 to 3!";
        } else {
            col = x - 1;
            row = Math.abs(y - 3);

            if (ttt[row][col] == '_' || ttt[row][col] == ' ') {
                ttt[row][col] = turn;
                switch (turn) {
                    case 'X':
                        noOfX++;
                        turn = 'O';
                        break;
                    case 'O':
                        noOfO++;
                        turn = 'X';
                        break;
                    default:
                        turn = 'X';
                        break;
                }
            } else {
                error = "This cell is occupied! Choose another one!";
            }
        }

        return error;
    }

    public static void printField() {

        System.out.println("---------");
        for (int i=0; i < ttt.length; i++) {
            System.out.print("| ");
            for (int j=0; j < ttt[i].length; j++) {
                System.out.print(ttt[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static String checkStatus() {
        int winX = 0;
        int winO = 0;
        String status = "";

        if (Math.abs(noOfX - noOfO) > 1) {
            status = "Impossible";
        } else {
            for (int i = 0; i < ttt.length; i++) {
                if (checkWin(ttt[i][0], ttt[i][1], ttt[i][2]) == 'X' ||
                        checkWin(ttt[0][i], ttt[1][i], ttt[2][i]) == 'X') {
                    winX++;
                } else if (checkWin(ttt[i][0],ttt[i][1],ttt[i][2]) == 'O' ||
                        checkWin(ttt[0][i], ttt[1][i], ttt[2][i]) == 'O') {
                    winO++;
                }
            }
            if (checkWin(ttt[0][0], ttt[1][1], ttt[2][2]) == 'X' ||
                    checkWin(ttt[0][2], ttt[1][1], ttt[2][0]) == 'X') {
                winX++;
            } else if (checkWin(ttt[0][0], ttt[1][1], ttt[2][2]) == 'O' ||
                    checkWin(ttt[0][2], ttt[1][1], ttt[2][0]) == 'O') {
                winO++;
            }

            if (winX == 1 && winO == 0) {
                status = "X wins";
            } else if (winO == 1 && winX == 0) {
                status = "O wins";
            } else if (winO == 0 && winX == 0) {
                if (noOfO + noOfX != 9) {
                    status = "Game not finished";
                } else {
                    status = "Draw";
                }
            } else {
                status = "Impossible";
            }
        }

       return status;
    }

    public static char checkWin(char x, char y, char z) {
        if (x == y  && x == z) {
            if (x == 'X') {
                return 'X';
            } else if (x == 'O') {
                return 'O';
            }
        }

        return ' ';
    }
}
