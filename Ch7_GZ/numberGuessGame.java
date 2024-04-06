// /* file with previous best scores is bestScores.txt 
//  * Example text in file:
//  * 
//  * alma
//  * 5
//  * isabel
//  * 6
//  * eliza
//  * 4
//  * olivia
//  * 10
//  * 
// */
// import java.io.*;
// import java.util.*;

// public class numberGuessGame {
//     private static String name;
//     private static int target;
//     private static String guessString;
//     private static int guess;
//     private static int gamesLeft=0;
//     private static int score;
//     private static int lowestScore=100000;
//     private static int oldLowestScore;

//     private static Scanner input = new Scanner(System.in);

//     public static void main(String [] args) throws FileNotFoundException,IOException {
//         System.out.print("Name: ");
//         name = input.nextLine();
        
//         for (gamesLeft=4; gamesLeft>=0; gamesLeft--) {
//             playGame();
//             if (score<lowestScore) {
//                 lowestScore=score;
//             }
//         }
//         input.close();

//         System.out.println("BEST SCORE: "+ lowestScore);
        
//         FileWriter fw = new FileWriter("bestScores.txt");
//         PrintWriter pw = new PrintWriter(fw);
//         FileReader fr = new FileReader("bestScores.txt");
//         BufferedReader br = new BufferedReader(fr);
//         while ((word = br.readLine()) !=null) {
//             oldLowestScore =br.readLine();
//             if (word.equalsTo(name) && lowestScore<oldLowestScore) {
//                 pw.println(word);
//                 pw.flush();
//             }
//         }
//     }

//     static void playGame() {
//         score=1;
//         target = (int) (Math.random()*100)+1;
//         System.out.print("\nGuess a number between 0 and 100: ");
//         guessString = input.nextLine();
//         guess = Integer.parseInt(guessString);

//         while (guess !=target) {
//             score++;
//             if (guess>target) {
//                 System.out.print("Too high. Guess again: ");
//             } else {
//                 System.out.print("Too low. Guess again: ");
//             }
            
//             guessString = input.nextLine();
//             guess = Integer.parseInt(guessString);
//         }

//         System.out.println("You got it! Games left: " + gamesLeft);

//     }
// }
