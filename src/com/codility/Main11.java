package com.codility;

import java.util.HashMap;

public class Main11 {

    public static void main(String[] args) {
        int[] x = {2, 1, 1, 2, 3, 1};
        int z = solution(x);
        System.out.println(z);
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int a: A)
            hm.put(a,a);
        return hm.size();
    }
}