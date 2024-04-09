import java.util.*;
import java.io.*;

public class TicTacToe {

    private static String board[][] = {
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" } };

    private static String leftoverSpots[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
    private static boolean won = false;

    public static void main(String[] args) {

        printBoard();
        userPlays();
        printBoard();
        checkIfWon();
    }

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                System.err.println();
            }
            for (int j = 0; j < 3; j++) {
                System.out.print("\t" + board[i][j]);
            }
        }
        System.err.println();
    }

    public static void userPlays() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position where you want to play >> ");
        String position = input.nextLine();

        input.close();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(position)) {
                    board[i][j] = "X";
                }
            }
        }
    }

    public static void checkIfWon() {
        if ((board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])) ||
                (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])) ||
                (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2]))) {
            won = true;
        }
    }
}