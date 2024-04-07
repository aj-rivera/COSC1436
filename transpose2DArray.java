import javax.swing.*;
import java.util.*;

public class transpose2DArray {
    private static int rowsBefore, columnsBefore, sum, max, min, rowsAfter, columnsAfter;
    private static String rowString, columnString;

    public static void main(String[] args) {
        // getting user input
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the number of rows: ");
        rowString = input.nextLine();
        rowsBefore = Integer.parseInt(rowString);

        System.out.print("Enter the number of columns: ");
        columnString = input.nextLine();
        columnsBefore = Integer.parseInt(columnString);
        input.close();

        // declaring 2D array
        int originalArray[][] = new int[rowsBefore][columnsBefore];

        createArray(originalArray);

        printArray(originalArray);

        findSum(originalArray);
        System.out.println("\nSum of all elements: " + sum);

        findMinMax(originalArray);
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        transpose(originalArray);

    }

    // initializing array with random integers
    public static void createArray(int[][] originalArray) {
        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                originalArray[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    // printing original array
    public static void printArray(int[][] originalArray) {
        System.out.println("\nGenerated 2D Array: ");
        for (int i = 0; i < rowsBefore; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < columnsBefore; j++) {
                System.out.print(originalArray[i][j] + "\t");
            }
        }
        System.out.println();
    }

    // calculating sum
    public static void findSum(int[][] originalArray) {
        sum = 0;
        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                sum += originalArray[i][j];
            }
        }
    }

    // calculating mininum and maximum values in array
    public static void findMinMax(int[][] originalArray) {
        min = 101;
        max = 0;
        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                if (originalArray[i][j] < min) {
                    min = originalArray[i][j];
                }
                if (originalArray[i][j] > max) {
                    max = originalArray[i][j];
                }
            }
        }

    }

    // transposing and printing array
    public static void transpose(int[][] originalArray) {
        rowsAfter = columnsBefore;
        columnsAfter = rowsBefore;
        int transposedArray[][] = new int[rowsAfter][columnsAfter];

        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        System.out.println("\nTransposed 2D Array: ");
        for (int i = 0; i < rowsAfter; i++) {
            if (i > 0) {
                System.out.println();
            }
            for (int j = 0; j < columnsAfter; j++) {
                System.out.print(transposedArray[i][j] + "\t");
            }
        }
        System.out.println();

    }
}