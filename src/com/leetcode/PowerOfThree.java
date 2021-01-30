package com.leetcode;

public class PowerOfThree {

    public static void main(String[] args) {
        for (int i = 0 ; i<200; i++)
        System.out.println(i + "+"+isPowerOfThree(i));


        System.out.println(isPowerOfThree(10));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1)
            return true;
        return divide(n);
    }

    private static boolean divide(double n) {
        if (n == 3)
            return true;
        else if (n < 3)
            return false;
        return divide(n / 3);
    }
}
