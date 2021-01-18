package com.codility;

import java.util.Arrays;

public class Main22 {

    public static void main(String[] args) {
        int[] x = {10, 0,0,0,0,10,0};
        int[] y = {2};
        System.out.println(solution(x, y));
    }

    public static int solution(int[] X, int[] Y) {
            Arrays.sort(X);
            int max = 0;
            for (int i = 0; i < X.length - 1; i++) {
                if (X[i] != X[i + 1]) {
                    max = Math.max(max, Math.abs(X[i] - X[i + 1]));
                }
            }
            return max;
        }

    }



