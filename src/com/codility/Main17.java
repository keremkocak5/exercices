package com.codility;

import java.util.Arrays;

public class Main17 {

    public static void main(String[] args) {
        int[] x = {2,0,2,0};

        String m = solution(2, 2, x);
        //int z = solution(x);
        System.out.println(m);
    }

    public static String solution(int u, int l, int C[]) {
        int[] ust = new int[C.length];
        int[] alt = new int[C.length];
        int toplamUst = 0;
        int toplamAlt = 0;
        boolean siraUst = u < l ? false : true;

        for (int i = 0; i < C.length; i++) {
            if (C[i] == 2) {
                alt[i] = 1;
                ust[i] = 1;
                toplamUst += ust[i];
                toplamAlt += alt[i];
            } else if (C[i] == 0) {
                alt[i] = 0;
                ust[i] = 0;
                toplamUst += ust[i];
                toplamAlt += alt[i];
            } else {
                if (siraUst) {
                    ust[i] = 1;
                    alt[i] = 0;
                    siraUst = false;
                    toplamUst += ust[i];
                    toplamAlt += alt[i];
                } else {
                    ust[i] = 0;
                    alt[i] = 1;
                    siraUst = true;
                    toplamUst += ust[i];
                    toplamAlt += alt[i];
                }
            }
        }
        if (toplamAlt == l && toplamUst == u) {
            return Arrays.toString(ust).concat(Arrays.toString(alt));
        }
        return "IMPOSSIBLE";
    }
}



