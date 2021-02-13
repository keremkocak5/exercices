package com.hackerrank;

public class BubbleSort {
    private static int[] bir = new int[]{7, 1, 3, 2, 4, 5, 6};

    public static void main(String[] args) {
        countSwaps(bir);
    }

    static void countSwaps(int[] a) {
        int sc = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (a[j] > a[j + 1]) {
                    sc++;
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Array is sorted in " + sc + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
}