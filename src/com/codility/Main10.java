package com.codility;

public class Main10 {

    public static void main(String[] args) {
        int[] x = {0, 1, 0, 1, 1};
        int z = solution(x);
        System.out.println(z);
    }

    public static int solution(int[] A) {
        int countOfZeros = 0, count = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) countOfZeros++;
            if (A[i] == 1) count += countOfZeros;
            if (count > 1000000000) return -1;
        }
        return count;
    }
}