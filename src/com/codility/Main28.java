package com.codility;

public class Main28 {

    public static void main(String[] args) {
        int[] x = {-2, -3, 4, -1, -2, 1, 5, -3};
        //int[] x = {3, 2, -6, 4, 0};
        //int[] x = {3};
        System.out.println(solution(x));
    }

    public static int solution(int[] A) {
        int max = 0;
        int maxslice = 0;
        int[] B = new int[A.length];
        int[] max1 = new int[A.length];
        B[0] = A[0];
        max1[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            B[i] = A[i] + B[i-1];
            max1[i] = Math.max(A[i], B[i]);
        }

        for (int maxx : max1) {
            max = Math.max(max, maxx);
        }
        return max;
    }
}