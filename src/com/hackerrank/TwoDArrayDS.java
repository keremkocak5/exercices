package com.hackerrank;

public class TwoDArrayDS {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        hourglassSum(arr);
    }

    static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int col = 0; col < 4; col++)
            for (int row = 0; row < 4; row++) {
                int max2 = arr[row][col] + arr[row][col + 1] + arr[row][col + 2] + arr[row + 1][col + 1] + arr[row + 2][col] + arr[row + 2][col + 1] + arr[row + 2][col + 2];
                System.out.println(max + " - " + max2);
                max = Math.max(max, max2);
            }
        return max;
    }
}
