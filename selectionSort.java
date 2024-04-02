public class selectionSort {
    static int a,b;
    public static void main(String[] args) {
        int arraySize = 6;
        int[] intArray= new int [arraySize];

        // assigning into array
        for (int i=0; i<intArray.length; i++)
        {
        intArray[i] = (int) (Math.random()*10);
        }
        System.out.println(intArray);
    }

    public static void swap (int a, int b) {
        int temp=a;
        a=b;
        b=temp;
    }
}