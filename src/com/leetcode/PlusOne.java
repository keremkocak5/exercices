package com.leetcode;

public class PlusOne {

    private static int[] in = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

    public static void main(String[] args) {
        System.out.println(">>" + plusOne(in));
    }

    public static int[] plusOne(int[] digits) {


        boolean parity = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (i == digits.length - 1) {
                if (digits[i] == 9) {
                    parity = true;
                    digits[i] = 0;
                } else {
                    parity = false;
                    digits[i]++;
                }
            } else if (parity) {
                parity = false;
                if (digits[i] == 9) {
                    parity = true;
                    digits[i] = 0;
                } else {
                    parity = false;
                    digits[i]++;
                }
            }
        }
        if (parity) {
            int[] m = new int[digits.length + 1];
            m[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                m[i + 1] = digits[i];
            }
            return m;
        } else {
            return digits;
        }
    }

}