package com.codility;


import java.util.HashSet;

public class Main7 {

    public static void main(String[] args) {
        int[] x = {1};
        int z = solution(5, x);
        System.out.println(">>" + z);
    }

    public static int solution(int X, int[] A) {
        HashSet hm = new HashSet<>();
        int sum = X * (X + 1) / 2;
        int sum2 = 0;
        for (int i = 0; i < A.length; i++) {
            if (!hm.contains(A[i])) {
                hm.add(A[i]);
                sum2 += A[i];
            }
            if (sum2 >= sum) {
                return i;
            }
        }
        return -1;
    }
}