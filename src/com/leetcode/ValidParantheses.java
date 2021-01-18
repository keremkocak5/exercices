package com.leetcode;

import java.util.Arrays;
import java.util.Optional;
import java.util.Stack;

public class ValidParantheses {

    private static String[] in = new String[]{"(", "[", "{"};
    private static String[] out = new String[]{")", "]", "}"};


    public static void main(String[] args) {
        System.out.println(">>" + isValid("]"));
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (inmi(s.substring(i, i + 1), in)) {
                stack.push(s.substring(i, i + 1));
            } else {
                stack.push(s.substring(i, i + 1));
                String gelen = stack.pop();
                if (stack.isEmpty())
                    return false;
                else if (gelen.equals(")") && !stack.peek().equals("("))
                    return false;
                else if (gelen.equals("]") && !stack.peek().equals("["))
                    return false;
                else if (gelen.equals("}") && !stack.peek().equals("{"))
                    return false;
                stack.pop();
            }

        }
        return stack.isEmpty();
    }

    private static boolean inmi(String ssss, String[] in) {
        Optional<String> result = Arrays.stream(in)
                .parallel()
                .filter(s -> s.equals(ssss)).findAny();
        return result.isPresent();
    }

}