package com.codility;

public class Main44 {
    public static void main(String[] args) {

        int i = 5;
        for (int m = 1; m <= i; m++) {
            printBlank(i - m);
            for (int ii = 0; ii <= m - 1; ii++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    private static void printBlank(int blank) {
        for (int y = 0; y <= blank; y++) {
            System.out.print(" ");
        }

    }

}