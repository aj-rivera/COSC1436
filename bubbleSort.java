import java.util.*;

public class bubbleSort {
    private static int totalSwaps;
    private static int totalComparisons;
    private static int swaps;
    private static int comparisons;
    private static int pass;
    private static final int LIST_LENGTH=5;
    public static void main(String args[]) {
        //creating variables
        ArrayList<Integer> numbers = new ArrayList<Integer>();        
        totalSwaps=0;
        totalComparisons=0;
        
        // making array of random numbers
        generateArray(numbers);
        
        // printing original array
        System.out.println("Original Array: " + numbers);
        
        //initiating comparison count
        comparisons=numbers.size()-1;
        
        // loop where a bubble passthrough is made and results are printed
        // accumulators totalSwaps, totalComparisons are added to as well
        for (pass=1; pass<=numbers.size()-2; pass++) {
            bubblePass(numbers);
            displayBubblePass(numbers);
            totalSwaps+=swaps;
            totalComparisons+=comparisons;
            comparisons--;
        }

        // ending array and accumulators displayed
        displaySortedArray(numbers);
    }
    

    // method that creates original array with random numbers
    public static void generateArray(ArrayList<Integer> numbers) {
        for (int i=0; i<LIST_LENGTH;i++) {
        numbers.add((int) ((Math.random()*100)+1));
        }
    }

    //restarts swaps number and then does a bubble sort passthrough
    public static void bubblePass(ArrayList<Integer> numbers) {
        swaps=0;
        for (int index=0; index<=numbers.size()-2;index++) {
            // if a number is larger than the one that proceeds it,
            // it will switch the numbers
            if (numbers.get(index)>numbers.get(index+1)) {
                int temp = numbers.get(index);
                numbers.set(index, numbers.get(index+1));
                numbers.set(index+1, temp);
                swaps++;
            }
        }     
    }


    // method that displays array after each bubble sort passthrough
    // and the number of comparisons and swaps during that passthrough
    public static void displayBubblePass(ArrayList<Integer> numbers) {
        System.out.print("Pass " + pass+ ":" +numbers);
        System.out.print(" (Comparisons: " + comparisons);
        System.out.println(", Swaps: "+ swaps + ")");
        
    }

    // method that displays finished array and accumulators
    public static void displaySortedArray(ArrayList<Integer> numbers) {
        System.out.println("Sorted Array: " + numbers);
        System.out.print("Total Comparisons; "+totalComparisons);
        System.out.println(" Total Swaps: "+ totalSwaps);
        
    }

        
}