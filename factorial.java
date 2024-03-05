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

        System.out.print("Enter number: ");
        numberString = input.next();
        number=Integer.parseInt(numberString);

        while (number<=1)
        {
            System.out.print("Invalid input. Enter a positive number greater than 1: ");
            numberString = input.next();
            number=Integer.parseInt(numberString);    
        }

        for (i=number; i>1;i--)
        {
            accumulator*=i;
        }
        System.out.println("The factorial of "+ number + " is " +accumulator);

        input.close();
    }
}