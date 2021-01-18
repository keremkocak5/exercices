package com.codility;

public class Main18 {

    public static void main(String[] args) {
        int[] x = {1, 4, 2, -2, 5};
        int[] y = {7, -2, -2, 2, 5};

        int m = solution(x, y);
        //int z = solution(x);
        System.out.println(m);
    }

    public static int solution(int A[], int B[]) {
        int fairNumber = 0;
        int[] totalA = new int[A.length];
        int[] totalB = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            try {
                totalA[i] += totalA[i - 1] + A[i];
                totalB[i] += totalB[i - 1] + B[i];
            } catch (Exception e) {
                totalA[i] += A[i];
                totalB[i] += B[i];
            }
        }
        for (int i = 0; i < A.length - 1; i++) {
            if (totalA[i] == totalB[i] && totalA[A.length - 1] == totalB[A.length - 1] && totalA[i] * 2 == totalA[A.length - 1]) {
                fairNumber += 1;
            }
        }
        return fairNumber;
    }
}



