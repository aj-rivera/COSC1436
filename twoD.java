import javax.swing.*;

import java.util.*;

public class twoD {
    public static void main(String[] args) {
        int originalArray[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                originalArray[i][j] = (int) (Math.random() * 100 + 1);
            }
        }
        System.out.print(originalArray[1][2]);
        System.out.print(originalArray[0].length);
    }
}