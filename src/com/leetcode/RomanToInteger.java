package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {


    public static void main(String[] args) {
        HashMap<String, Integer> chars1 = new HashMap<>();
        chars1.put("M", 1000);
        chars1.put("D", 500);
        chars1.put("C", 100);
        chars1.put("L", 50);
        chars1.put("X", 10);
        chars1.put("V", 5);
        chars1.put("I", 1);
        System.out.println(romanToInt("MCMXCIV", chars1));
    }

    private static int romanToInt(String s, Map<String, Integer> chars1) {
        int m = 0;
        while (s.length() > 0) {
            if (!isNextMinus(s, chars1)) {
                m += chars1.get(s.substring(0, 1));
                s = s.substring(1, s.length());
            } else {
                m += chars1.get(s.substring(1, 2)) - chars1.get(s.substring(0, 1));
                s = s.substring(2, s.length());
            }
        }
        return m;
    }

    private static boolean isNextMinus(String s, Map<String, Integer> chars1) {
        if (s.length() > 1 && chars1.get(s.substring(1, 2)) > chars1.get(s.substring(0, 1))) {
            return true;
        }
        return false;
    }

}