public class DataTypes
{
    public static void main(String [] args)
    {
        int a = 5;
        double b=0;
        double c=5.2;
        final boolean g = true;
        System.out.println("a: " + a + "\t b: " + b + "\t c; " + c + "\t g:" + g);
        b = a;
        System.out.println("a: " + a + "\t b: " + b + "\t c; " + c + "\t g:" + g);
    }
}