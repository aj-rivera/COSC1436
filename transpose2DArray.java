import javax.swing.*;
import java.util.*;

public class transpose2DArray {
    private static int rowsBefore, columnsBefore, sum, max, min, rowsAfter, columnsAfter;
    // private static ArrayList<ArrayList<Integer>> originalArray = new
    // ArrayList<ArrayList<Integer>>();
    private static String rowString, columnString;
    // private static int[][] originalArray = new int[2][3];

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rowString = input.nextLine();
        rowsBefore = Integer.parseInt(rowString);

        System.out.println("Enter the number of columns: ");
        columnString = input.nextLine();
        columnsBefore = Integer.parseInt(columnString);

        input.close();
        int originalArray[][] = new int[rowsBefore][columnsBefore];
        createArray(originalArray);

        printArray(originalArray);

        findSum(originalArray);

        findMinMax(originalArray);

        printArray(transpose(originalArray));

    }

    public static void createArray(int[][] originalArray) {

        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                originalArray[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
    }

    public static void printArray(int[][] originalArray) {
        for (int i = 0; i < rowsBefore; i++) {
            System.out.println();
            for (int j = 0; j < columnsBefore; j++) {
                System.out.print("\t" + originalArray[i][j]);
            }
        }
        System.out.println();
    }

    public static void findSum(int[][] originalArray) {
        sum = 0;
        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                sum += originalArray[i][j];
            }
        }
        System.out.println("Sum: " + sum);
    }

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
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    public static void transpose(int[][] originalArray) {
        rowsAfter = columnsBefore;
        columnsAfter = rowsBefore;
        int transposedArray[][] = new int[rowsAfter][columnsAfter];

        for (int i = 0; i < rowsBefore; i++) {
            for (int j = 0; j < columnsBefore; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        for (int i = 0; i < rowsAfter; i++) {
            System.out.println();
            for (int j = 0; j < columnsAfter; j++) {
                System.out.print("\t" + transposedArray[i][j]);
            }
        }
        System.out.println();

    }
}