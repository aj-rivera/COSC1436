public class EscapeSequences
{
    public static void main(String[] args)
    {
        System.out.println("elvis\rlives");
        System.out.println("elvis\blives");
        System.out.println("elvis\tlives");
        System.out.println("\"elvis\" lives");

        System.out.print("elvis");
        for (long i=-2500000000L; i<500000000L; i++);  //delay
        System.out.print("\b\blives");
    }
}