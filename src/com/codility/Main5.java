package com.codility;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] x = {1};
        int z = solution(x);
        System.out.println(">>" + z);
    }

    public static int solution(int[] A) {
        if (A == null || A.length == 0) {
            return 1;
        }
        if (A.length < 2)
            return (A[0]+1);
        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if ((A[i] + 1) != A[i + 1]) {
                return (A[i] + 1);
            }
        }
        return 1;
    }

}