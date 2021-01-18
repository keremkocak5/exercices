package com.codility;

import java.util.Arrays;

public class Main12 {

    public static void main(String[] args) {
        int[] x = {-7, 1,2,3};
        int z = solution(x);
        System.out.println(z);
    }

    public static int solution(int[] A) {
        if (A.length < 3)
            return 0;

        Arrays.sort(A);
        int max1 = A[(A.length - 2)] * A[(A.length - 1)] * A[A.length-3];
        int max2 = A[0] * A[1] * A[(A.length - 1)];
        return Math.max(max1, max2);
    }
}