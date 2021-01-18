package com.leetcode;

public class FactorialTrailingZeroes {

    private static int[] bir = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] iki = new int[]{2, 2, 1, 1, 1, 2, 2};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};


    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }

    public static int trailingZeroes(int n) {
        int count = 0;
        int tot = 0;
        while (n >= 5) {
            n = n / 5;
            tot = tot + n;
        }
        return tot;
    }
}