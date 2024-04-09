import java.util.*;

public class TicTacToe {
    private static boolean won = false; // stops game when someone wins
    private static int numberPlays = 0; // stops game when spaces full
    private static Scanner input = new Scanner(System.in);

    private static String board[][] = { // board printed for user to see
            { "1", "2", "3" },
            { "4", "5", "6" },
            { "7", "8", "9" } };
    private static ArrayList<String> leftoverSpots = new ArrayList<String>(
            Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9"));

    public static void main(String[] args) {

        printBoard();

        /*
         * This is the loop that runs while game is still
         * going on and does not stop until board has filled
         * up or someone has won.
         */
        while (won == false && numberPlays <= 8) {
            userPlays();
            printBoard();
            checkIfWon();
            if (won == true) {
                System.out.println("We have a winner! Human won!\n");
            }
            if (won == false && numberPlays <= 8) {
                computerPlays();
                printBoard();
                checkIfWon();
                if (won == true) {
                    System.out.println("We have a winner! Computer won!\n");
                }
            }

        }

        /*
         * Statement that prints if game ended but
         * had no winner.
         */
        if (won == false) {
            System.out.println("DRAW! No winner.\n");
        }

        input.close();
    }

    /*
     * Goes through the 2D array and prints each element
     * in a 3x3 configuration
     */
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

    /* human user turn */
    public static void userPlays() {
        System.out.print("\nEnter the position where you want to play >> ");
        String position = input.nextLine(); // take user input for position of X
        leftoverSpots.remove(position); // removes used position from list of availiable spots
        for (int i = 0; i < 3; i++) { // goes through each element on board
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(position)) {
                    board[i][j] = "X"; // replaces number with X
                }
            }
        }
        numberPlays++;
        System.out.println("\nYour move is recorded");
    }

    /*
     * Goes through all horizontal, vertical and diagonal
     * rows to check if there is a winner
     */
    public static void checkIfWon() {
        if ((board[0][0].equals(board[0][1]) && board[0][0].equals(board[0][2])) || // horizontal rows
                (board[1][0].equals(board[1][1]) && board[1][0].equals(board[1][2])) ||
                (board[2][0].equals(board[2][1]) && board[2][0].equals(board[2][2])) ||

                (board[0][0].equals(board[1][0]) && board[0][0].equals(board[2][0])) || // vertical rows
                (board[0][1].equals(board[1][1]) && board[0][1].equals(board[2][1])) ||
                (board[0][2].equals(board[1][2]) && board[0][2].equals(board[2][2])) ||

                (board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) || // diagonals
                (board[2][0].equals(board[1][1]) && board[2][0].equals(board[0][2]))) {
            won = true;
        }
    }

    /*
     * randomly picks element in "leftoverSpots" list, replaces
     * element with "0" on the board and then removes it from
     * "leftoverSpots" list.
     */
    public static void computerPlays() {
        System.out.println("\nNow the computer will play");
        int randomIndex = (int) (Math.random() * leftoverSpots.size());
        String computerPosition = leftoverSpots.get(randomIndex);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(computerPosition)) {
                    board[i][j] = "O";
                }
            }
        }

        leftoverSpots.remove(computerPosition);
        numberPlays++;
    }
}