package com.leetcode;

public class ReverseString {

    private static char[] in = new char[]{'h', 'e', 'l','o'};

    public static void main(String[] args) {
        reverseString(in);
    }

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
        System.out.println("deneme");
    }
}