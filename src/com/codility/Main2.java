package com.codility;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        int[] x = {3, 8, 9, 7, 6};
        int[] z = solution(x, 1);
        Arrays.stream(z).forEach((c) -> {System.out.println(c);}   );
    }

    public static int[] solution(int[] A, int K) {
        int temp;
        int[] yedek; //= new int[A.length];
        for (int i = 0; i < K; i++) {
            yedek = new int[A.length];
            for (int ii = 0; ii < A.length;  ii++ ) {
                try {
                    yedek[ii+1] = A[ii];
                } catch (Exception e) {
                    yedek[0] = A[ii];
                }
            }
            /*for (int iii = 0; iii< A.length; iii++)
                A[iii] = yedek[iii];*/
            A = yedek;
        }
        return A;
    }
}