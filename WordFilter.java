import java.io.*;
// import the ArrayList class
import java.util.*; 
// Create an ArrayList object
public class WordFilter {
    public static void main(String [] args) throws FileNotFoundException,IOException {
        //setting up scanner
        Scanner input = new Scanner(System.in);
        //asking user for word length to be filtered
        System.out.print("Enter the length of words to filter by:");
        //grabs length and converts to integer
        String inputString = input.nextLine();
        int desiredLength = Integer.parseInt(inputString);

        input.close();


        // creating arraylist to store words
        ArrayList<String> words = new ArrayList<>();
        // creating and accessing the file
        File f = new File("words_alpha.txt");
        // creating and accessing the file reader
        FileReader fr = new FileReader (f);
        // creating and accessing the buffered reader
        BufferedReader br = new BufferedReader(fr);
        // string variable to hold data from file
        String word;

        //using loop to add words to array
        while ((word=br.readLine())!= null) {
            words.add(word);
        }
        br.close();



        //printing list heading
        System.out.println("Words with length "+desiredLength+" are:");
        

        //filtering desired length
        int index=0;
        while (index<words.size()) {
            if (words.get(index).length()!=desiredLength) {
                words.remove(index);
            } else {
                index++;
            }
        }
        
        


        for (int i=0; i<words.size(); i++) {
            System.out.println(words.get(i));
            }
        }
    }
    


