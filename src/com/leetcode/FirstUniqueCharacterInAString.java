package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {


    public static void main(String[] args) {
         System.out.println(firstUniqChar("loveleetcode"));;
    }

    public static int firstUniqChar(String s) {
        Map<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i) + "")) {
                hashMap.put(s.charAt(i) + "", hashMap.get(s.charAt(i) + "") + 1);
            } else {
                hashMap.put(s.charAt(i) + "", 1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.get(s.charAt(i) + "") == 1)
                return i;
        }
        return -1;
    }
}