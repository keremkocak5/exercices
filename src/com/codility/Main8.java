package com.codility;


import java.util.Arrays;

public class Main8 {

    public static void main(String[] args) {
        int[] x = {3, 4, 4, 6, 1, 4, 4};
        int[] z = solution(5, x);
        Arrays.stream(z).forEach((c) -> {
            System.out.println(c);
        });
    }

    public static int[] solution(int N, int[] A) {

        int counter[] = new int[N];
        int n = A.length;
        int max = -1, current_min = 0;

        for(int i=0;i<n;i++){
            if(A[i]>=1 && A[i]<= N){
                if(counter[A[i] - 1] < current_min) counter[A[i] - 1] = current_min;
                counter[A[i] - 1] = counter[A[i] - 1] + 1;
                if(counter[A[i] - 1] > max) max = counter[A[i] - 1];
            }
            else if(A[i] == N+1){
                current_min = max;
            }
        }
        for(int i=0;i<N;i++){
            if(counter[i] < current_min) counter[i] =  current_min;
        }
        return counter;

    /*
        int[] x = new int[N];
        int max = 0;
        Arrays.fill(x, 0);


        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                x[A[i] - 1]++;
                max = Math.max(max, x[A[i] - 1]);
            } else if (A[i] == N + 1) {
                for (int ii = 0; ii < N; ii++) {
                    Arrays.fill(x, max);
                }
            }
        }

        return x;*/
    }
}