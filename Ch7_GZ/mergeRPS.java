/* This codes reads east.txt, midwest.txt and western.txt and
 * writes all the information into merged.txt
 */

import java.io.*;

public class mergeRPS {
    private static String word;

    public static void main(String [] args) throws FileNotFoundException,IOException {

        // sets up to write into merged.txt
        FileWriter fw = new FileWriter("merged.txt");
        PrintWriter pw = new PrintWriter(fw);

        // takes each line in east.txt and writes into east.txt
        FileReader fr = new FileReader("east.txt");
        BufferedReader br = new BufferedReader(fr);
        while ((word = br.readLine()) !=null) {
            pw.println(word);
            pw.flush();
        }
        br.close();

        // takes each line in east.txt and writes into midwest.txt
        FileReader fr2 = new FileReader("midwest.txt");
        BufferedReader br2 = new BufferedReader(fr2);
        while ((word = br2.readLine()) !=null) {
            pw.println(word);
            pw.flush();
        }
        br2.close();

        // takes each line in east.txt and writes into western.txt
        FileReader fr3 = new FileReader("western.txt");
        BufferedReader br3 = new BufferedReader(fr3);
        while ((word = br3.readLine()) !=null) {
            pw.println(word);
            pw.flush();
        }
        br3.close();

        // closes the FileWriter and printWriter
        pw.close();
    }
}