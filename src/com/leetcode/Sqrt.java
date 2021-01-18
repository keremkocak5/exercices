package com.leetcode;

public class Sqrt {

    public static void main(String[] args) {
        System.out.println(">>" + mySqrt(4));
    }

    private static int mySqrt(int x) {
        if (x < 2)
            return 1;
        int right = 1;
        int left = x;
        int mid = mid(right, left);
        while (left-right > 1) {
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                left = mid;
                mid = mid(right, left);
            } else if (mid * mid < x) {
                right = mid;
                mid = mid(right, left);
            }
        }
        return mid;
    }

    private static int mid(int r, int l) {
        return  r + ((l - r) / 2) ;
    }

    private static int mySqrt4(int x) {
        if (x < 2)
            return x;
        int hi = x, low = 1;
        long mid = low + ((hi - low) / 2);
        while (hi - low > 1) {
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                low = (int) mid;
                mid = low + ((hi - low) / 2);
            } else {
                hi = (int) mid;
                mid = low + ((hi - low) / 2);
            }
        }
        return (int) mid;
    }


    private static int mySqrt3(int x) {
        if (x < 2)
            return x;
        int hi = x, low = 1;
        long mid = low + ((hi - low) / 2);
        while (hi - low > 1) {
            long sq = mid * mid;
            if (sq == x)
                return (int) mid;
            if (sq > x)
                hi = (int) mid;
            else
                low = (int) mid;
            mid = low + ((hi - low) / 2);
        }
        return (int) mid;
    }


    public static int mySqrt2(int x) {

        return (int) Math.sqrt(x);
    }
}