package com.codility;

public class Main29 {

    public static void main(String[] args) {
        //int[] x = {1, 2, 3, 4, 6, 8, 12, 24};

        System.out.println(solution(6));
    }

    public static int solution(int A) {
        int i = 1;
        int result = 0;
        while (i * i < A) {
            System.out.println(">" + A + " " + i + " " + result);
            if (A % 2 == 0) {
                result += 2;
            }
            i += 1;
            if (i * i == A) {
                result += 1;
            }
            System.out.println(">>>" + A + " " + i + " " + result);
        }
        return result;
    }
}