import java.io.*;
// import the ArrayList class
import java.util.*; 
// Create an ArrayList object
public class WordFilter {
    //declarations
    private static int desiredLength;
    private static ArrayList<String> words = new ArrayList<>(); // creating arraylist to store words
    private static String word;
    
    public static void main(String [] args) throws FileNotFoundException,IOException {

        takeUserInput(args); // asks user desired length to filter
        
        //printing list heading
        System.out.println("\nWords with length "+desiredLength+" are:");

        /*sets up file reading and goes through each word, 
        filters for length, and adds to array if criteria is met */
        readsAndFilters(words);//

        /* goes through each word in filtered list and 
        prints them separately on each line */
        printFilteredList(words);
    }


    public static void takeUserInput(String [] args) throws FileNotFoundException,IOException {
        //setting up scanner
        Scanner input = new Scanner(System.in);
        //asking user for word length to be filtered
        System.out.print("Enter the length of words to filter by: ");
        //grabs length and converts to integer
        String inputString = input.nextLine();
        desiredLength = Integer.parseInt(inputString);
        input.close();
    }

    public static void readsAndFilters(ArrayList<String> words) throws FileNotFoundException,IOException {
        // creating and accessing the file
        File f = new File("words_alpha.txt");
        // creating and accessing the file reader
        FileReader fr = new FileReader (f);
        // creating and accessing the buffered reader
        BufferedReader br = new BufferedReader(fr);
        // string variable to hold data from file
        //using loop to add words to array that match
        while ((word=br.readLine())!= null) {
            if (word.length()==desiredLength) {
                words.add(word);
            }
        }
        br.close();
    }
    
    public static void printFilteredList(ArrayList<String> words) throws FileNotFoundException,IOException{
        for (int i=0; i<words.size(); i++) {
            System.out.println(words.get(i));
        }
    }
}


    


