package com.leetcode;

import java.util.HashMap;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int mm = 0;
        String x = String.valueOf(n);
        for (int i = 0; i < x.length(); i++) {
            mm += (int) Math.pow(Double.parseDouble(x.charAt(i) + ""), 2);
        }
        HashMap<Integer, Integer> hm = new HashMap<>();
        return isHappy(mm, mm, hm);
    }

    public static boolean isHappy(int n, int m, HashMap<Integer, Integer> hm) {
        //System.out.println(">>" + n + " - " + m);
        int mm = 0;
        String x = String.valueOf(m);
        for (int i = 0; i < x.length(); i++) {
            mm += (int) Math.pow(Double.parseDouble(x.charAt(i) + ""), 2);
        }
        if (hm.containsKey(mm))
            return false;
        if (mm == 1)
            return true;
        hm.put(mm, mm);
        return isHappy(n, mm, hm);
    }
}