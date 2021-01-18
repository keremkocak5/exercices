package com.codility;

public class Main19 {

    public static void main(String[] args) {
        int[] x = {1, 4, 2, -2, 5};
        int[] y = {7, -2, -2, 2, 5};

        int m = solution(1000);
        //int z = solution(x);
        System.out.println(m);
    }

    public static int solution(int N) {
        int sum = 0;
        String[] x = new String[N];

        sum = topla(N);

        for (int i = N+1; i < N*100; i++) {
            if (topla(i) == sum) {
                return i;
            }
        }

        return -1;
    }

    private static int topla (int N)
    {
        String[] x = new String[N];
        int sum = 0;
        for (int i = 0; i < String.valueOf(N).length(); i++) {
            x[i] = String.valueOf(N).charAt(i) + "";
            sum += Integer.parseInt(String.valueOf(N).charAt(i) + "");
        }
        return sum;
    }
}



