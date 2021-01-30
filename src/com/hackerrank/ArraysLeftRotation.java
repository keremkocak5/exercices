package com.hackerrank;

public class ArraysLeftRotation {
    private static int[] bir = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        rotLeft(bir, 2);
    }

    static int[] rotLeft(int[] a, int d) {
        for (int i = 0; i < d%a.length; i++) {
            int temp = a[0];
            for (int ii = 0; ii < a.length - 1; ii++) {
                a[ii] = a[ii + 1];
            }
            a[a.length-1] = temp;
        }
        return a;
    }

}
