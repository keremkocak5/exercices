package com.codility;


import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] x = {1,2,3,4,3,2,1};
        int z = solution(x);
        System.out.println(">>" + z);
    }

    public static int solution(int[] A) {
        Arrays.sort(A);
        boolean skip = false;
        int m = 0;
        if (A.length < 2)
            return  A[0];
        for (int i = 0 ; i< A.length; i++)
        {
            if ( i+1<A.length && A[i] == A[i+1] )
            {
                i = i+1;
                continue;
            }else
            {
                return A[i];
            }
        }
        return A[m];
    }

}