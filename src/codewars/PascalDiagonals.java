package codewars;

import java.util.ArrayList;

public class PascalDiagonals {
    public static long[] generateDiagonal(int n, int l) {

        if (l == 0) {
            return new long[] {};
        }

        int arrLen = n + l;

        long[][] triangle = new long[arrLen][arrLen];

        for (int i = 0; i < arrLen; i++) {
                for (int j = 0; j < i + 1; j++) {
                    if (i == 0 ) {
                        if (triangle[0][0] != 1){
                            triangle[0][0] = 1;
                            System.out.print(triangle[i][i]);
                            System.out.print(" ");
                        }
                    }
                    else if (j == 0 || j == i) {
                        triangle[i][j] = 1;
                        System.out.print(triangle[i][j]);
                        System.out.print(" ");
                    }
                    else {
                        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                        System.out.print(triangle[i][j]);
                        System.out.print(" ");
                    }
                }
                System.out.println();
        }

        long[] arr = new long[l];
        int index = 0;
        int row = n;
        for (int i = 0; i < l; i++) {
            arr[index] = triangle[row][i];
            System.out.println(arr[index]);
            index += 1;
            row += 1;
        }

        return arr;
    }
}
