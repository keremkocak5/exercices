package com.codility;


public class Main6 {

    public static void main(String[] args) {
        int[] x = {1,99,5};
        int z = solution(x);
        System.out.println(">>" + z);
    }

    public static int solution(int[] A) {
        int t1 = 0;
        int t2 = 0;
        int sum = 0;
        int min = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            min += Math.abs(A[i]);
        }



        for (int i = 0; i < A.length - 1; i++) {
            t2 += A[i];
            t1 = Math.abs(((t2) * 2) - sum);
            min = Math.min(min, t1);
        }
        return Math.abs(min);
    }
}