package com.leetcode;

import java.util.Stack;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    private static int reverse(int x) {
        try {
            Stack<String> stack = new Stack();
            String stringX = x + "";
            String result = "";
            for (int i = x >= 0 ? 0 : 1; i < stringX.length(); i++) {
                stack.push(stringX.charAt(i) + "");
            }
            while (!stack.isEmpty()) {
                result = result.concat(stack.pop());
            }
            return Integer.parseInt(result) * (x >= 0 ? 1 : -1);
        } catch (Exception e) {
            return 0;
        }
    }
}