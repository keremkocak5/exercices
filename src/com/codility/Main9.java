package com.codility;

import java.util.HashMap;
import java.util.Map;

public class Main9 {

    public static void main(String[] args) {
        int[] x = {1,1};
        int z = solution(x);
        System.out.println(z);
    }

    public static int solution(int[] A) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], A[i]);
        }
        int sum = 0;
        int sum2 = 0;
        for (Map.Entry en : hm.entrySet()) {
            sum += hm.get(en.getKey());
        }
        int a = 0;
        while (a < hm.size()) {
            a++;
            sum2 += a;
        }
        if (A.length==1)
            return 0;
        if (hm.size()==1)
            return 0;
        if (sum == sum2)
            return 1;
        return 0;
    }
}