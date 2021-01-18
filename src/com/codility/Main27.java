package com.codility;

import java.util.Arrays;
import java.util.Stack;

public class Main27 {

    public static void main(String[] args) {
        int[] x = {1, 2, 3};
        //int[] x = {3};
        System.out.println(solution(x));
    }

    public static int solution(int[] A) {
        int[] xx = A.clone();
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(A);
        for (int h : A) {
            if (stack.isEmpty()) {
                //System.out.println(h + " girdi");
                stack.push(h);
            } else if (stack.peek() < h) {
                //System.out.println(stack.peek() + " cikti");
                stack.pop();
            } else if (stack.peek() == h) {
                //System.out.println(h + " girdi");
                stack.push(h);
            } else if (stack.peek() > h) {
                //System.out.println("????");
            }
        }
        if (stack.isEmpty()) {
            return -1;
        }
        int t = 0;
        int ret = -1;
        for (int i = 0; i < xx.length; i++) {
            if (xx[i] == stack.peek()) {
                t = t + 1;
                ret = i;
            }
        }
        if (t > xx.length / 2)
            return ret;
        return -1;
    }
}