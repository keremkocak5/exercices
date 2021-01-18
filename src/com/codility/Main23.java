package com.codility;

import java.util.Arrays;

public class Main23 {

    public static String ArithGeo(int[] arr) {
        Arrays.sort(arr);
        boolean arith = true;
        boolean geome = true;
        if (arr.length < 2)
            return "-1";
        int afactor = arr[1] - arr[0];
        int gfactor = arr[1] / arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i] || (arr[i + 1] - arr[i]) != afactor) {
                arith = false;
            }
            if (arr[i + 1] == arr[i] || (arr[i + 1] / arr[i]) != gfactor) {
                geome = false;
            }
        }
        if (arith)
            return "Arithmetic";
        if (geome)
            return "Geometric";
        return "-1";
    }

    public static void main(String[] args) {
        // keep this function call here
        int[] x = {};
        System.out.println(ArithGeo(x));
    }

}