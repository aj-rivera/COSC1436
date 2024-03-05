import java.util.Scanner;

class LoopDemo
{
    public static void main(String [] args)
    {
        
        Scanner kb = new Scanner(System.in);
        String x =kb.next();

        do
        {
            System.out.println("running...");
            x=kb.next();
        } while (x.equals("n"));

    kb.close();
    }
}
