package com.codility;

import java.util.Arrays;
import java.util.Stack;

public class Main25 {

    public static void main(String[] args) {
        int m = solution("");
        //int z = solution(x);
        System.out.println(m);
    }

    public static int solution(String S) {
        if (S.length() == 0)
            return 1;
        Stack<String> stack = new Stack<>();
        String[] positive = {"(", "{", "["};
        String[] negative = {")", "}", "]"};
        char[] chars = S.toCharArray();

        for (char x : chars) {
            try {
                if (Arrays.asList(positive).contains(x + "")) {
                    stack.push(x + "");
                } else {
                    if (Arrays.asList(negative).indexOf(x + "") != Arrays.asList(positive).indexOf(stack.peek())) {
                        return 0;
                    }
                    stack.pop();
                }
            } catch (Exception e)
            {
                return 0;
            }
        }
        if (stack.size() > 0)
            return 0;
        return 1;
    }
}



