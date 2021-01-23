package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {


    public static void main(String[] args) {
        System.out.println(">>" + isAnagram("anagram", "anagram"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            if (hm1.containsKey(s.charAt(i) + "")) {
                hm1.put(s.charAt(i) + "", 1 + hm1.get(s.charAt(i) + ""));
            } else {
                hm1.put(s.charAt(i) + "", 1);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            if (!hm1.containsKey(t.charAt(i) + ""))
            {
                return false;
            }
            if (hm2.containsKey(t.charAt(i) + "")) {
                hm2.put(t.charAt(i) + "", 1 + hm2.get(t.charAt(i) + ""));
            } else {
                hm2.put(t.charAt(i) + "", 1);
            }
        }

        for (Map.Entry<String, Integer> map : hm1.entrySet()) {
            if (!hm2.containsKey(map.getKey())) {
                return false;
            }
            if (!hm2.get(map.getKey()).equals(map.getValue())) {
                return false;
            }
        }
        return true;
    }

}