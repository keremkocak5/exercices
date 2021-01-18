package com.codility;


public class Main4 {

    public static void main(String[] args) {
        int z = solution(1, 85, 30);
        System.out.println(">>" + z);
    }

    public static int solution(int X, int Y, int D) {
        if (X == Y)
            return 0;
        int i = 0;
        while (true) {
            if (X >= Y) {
                return i;
            }
            if (Y - X > D) {
                Y = Y - D;
                i++;
            }
            X = X + D;
            i++;
        }
    }

}