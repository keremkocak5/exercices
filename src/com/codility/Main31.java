package com.codility;

public class Main31 {

    public static void main(String[] args) {
        int[] x = {3, 1, 2, 3, 6};
        System.out.println(solution(4));
    }

    public static int[] solution(int n) {
        for (int i = 0; i < n; i++) {
            for (int m = 0; m < n - i; m++) {
                System.out.print(" ");
            }
            for (int m = i; m < n - m; m++) {
                System.out.print("#");
            }
            System.out.println("");
        }
        return null;
    }
}