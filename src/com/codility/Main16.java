package com.codility;

import java.util.Stack;

public class Main16 {

    public static void main(String[] args) {
        int m = solution("{{{{");
        //int z = solution(x);
        System.out.println(m);
    }

    public static int solution(String S) {
        Stack<String> stack = new Stack<>();
        String[] x = new String[S.length()];
        try {
            for (int i = 0; i < S.length(); i++) {
                if ((S.charAt(i) + "").equals("(") || (S.charAt(i) + "").equals("{") || (S.charAt(i) + "").equals("[")) {
                    stack.push(S.charAt(i) + "");
                } else {
                    String pop = stack.pop();
                    if ((S.charAt(i) + "").equals("}") && pop.equals("{")) {
                        continue;
                    }
                    if ((S.charAt(i) + "").equals(")") && pop.equals("(")) {
                        continue;
                    }
                    if ((S.charAt(i) + "").equals("]") && pop.equals("[")) {
                        continue;
                    }
                    return 0;
                }
            }
        } catch (Exception e) {
            return 0;
        }
        if (stack.size() == 0)
            return 1;
        return 0;
    }
}



