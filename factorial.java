import java.util.Scanner;

public class factorial {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in); //starting scanner
        
        //declarations
        int number;
        int accumulator=1;
        String numberString;
        int i;

        System.out.println("Enter number: ");
        numberString = input.nextLine();
        number=Integer.parseInt(numberString);

        for (i=number; i<1;i--)
        {
            accumulator*=i;
        }
        System.out.println(accumulator);

        input.close();
    }
}