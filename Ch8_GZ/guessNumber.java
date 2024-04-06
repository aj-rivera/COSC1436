import java.util.*;
import java.io.*;


public class guessNumber {
    private static int target, guess, numGames;
    private static double average, median,numGuesses;
    private static ArrayList<Double> scores = new ArrayList<Double>();
    private static String guessString, answer;
    private static boolean finished = false;
    private static Scanner input = new Scanner(System.in);

    public static void main( String [] args) throws FileNotFoundException,IOException {
        numGames=0;
        while(numGames<20 && finished==false) {
            playGame();
            askPlayAgain();
            System.out.println("");
        }


        bubbleSort();
        findMedian();
        findAverage();

        System.out.println("Scores: "+scores);
        System.out.println("Median: " + median );
        System.out.println("Average: " + average );
    }

    /* goes through the game pickng random number and gives feedback. */
    public static void playGame() {
        target = (int) (Math.random()*100+1);
        System.out.println("Guess a number between 1 and 100: ");
        guessString = input.nextLine();
        guess = Integer.parseInt(guessString);
        numGuesses=1;
        while (guess != target) {
            if (guess>target) {
                System.out.println("Too high. Guess again: ");
            } else if (guess<target) {
                System.out.println("Too low. Guess again: ");
            }
            numGuesses++;
            guessString = input.nextLine();
            guess = Integer.parseInt(guessString);
        }
        System.out.println("Correct! You got it in " + numGuesses + " guesses.");
        scores.add(numGuesses);
        numGames++;
    }

    /*after a round, player gets asked if they want to play again
     * only if they haven't played 20 games yet.
     */
    public static void askPlayAgain() {
        if (numGames<20) {
            System.out.println("\nDo you want to play again? (Y/N): ");
            answer = input.nextLine();
            while (((answer.equals("Y")==false) && (answer.equals("N"))==false)) {
                System.out.println("Invalid input. Do you want to play again? (Y/N): " );
                answer = input.nextLine();
            }
            if (answer.equals("N")) {
                finished=true;
            }
        }
    }

    // list of scores goes through a bubble sort
    public static void bubbleSort() {
        for (int pass=1; pass<=scores.size()-1; pass++) {
            for (int index=0; index<=scores.size()-2;index++) {
            
                if (scores.get(index)<scores.get(index+1)) {  
                    double temp = scores.get(index);            
                    scores.set(index, scores.get(index+1));
                    scores.set(index+1, temp);
                }
            }     
        }    
    }

    // calculates median
    public static void findMedian() {
        
        if(numGames%2==0) {
            median =(double) (( scores.get(numGames/2)+scores.get(numGames/2-1) )/2);
        } else if (numGames%2==1) {
            median= (double) scores.get( (numGames-1) / 2);
        }
    }

    // calculates average
    public static void findAverage() {
        double accum = 0;
        for (double value:scores) {
            accum+=value;
        }
        average = (double)(accum / numGames);
    }

}
