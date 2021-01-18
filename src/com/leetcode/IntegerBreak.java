package com.leetcode;

public class IntegerBreak {


    public static void main(String[] args) {
        System.out.println(">>" + integerBreak(8));
    }

    public static int integerBreak(int n) {
        if (n == 2)
            return 1;
        if (n == 3)
            return 2;
        if (n % 3 == 0)
            return (int) Math.pow(3, n / 3);
        if (n % 3 == 1)
            return (int) Math.pow(3, (n - 4) / 3) * 2 * 2;
        if (n % 3 == 2)
            return (int) Math.pow(3, (n-2) / 3) * 2;
        return -1;
    }

}