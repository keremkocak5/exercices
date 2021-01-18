package com.codility;

public class Main30 {

    public static void main(String[] args) {
        //int[] x = {1, 2, 3, 4, 6, 8, 12, 24};

        System.out.println(solution(101));
    }

    public static int solution(int N) {
        if (N == 1)
            return 4;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < Math.sqrt(N); i++) {
            if (N % i == 0) {
                min = Math.min(min, 2 * (i + (N / i)));
            }
        }
        return min;
    }
}