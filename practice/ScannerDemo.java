import java.util.*;

public class ScannerDemo {

    public static void main(String [] args)
    {
        //declarations
        String name;
        double favNum;

        //obtaing input from user
        Scanner kb = new Scanner(System.in);
        System.out.println("What's your name?");
        name = kb.nextLine();
        System.out.println("What's your fave number?");
        favNum = kb.nextDouble();

        //processing input
        favNum *= 2;

        //output
        System.out.println(name + ", your fave number multiplied by 2 is " + favNum);

        kb.close();
    }
}