package com.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class SherlockAndTheValidString {

    public static void main(String[] args) {
        System.out.println(isValid("abccc"));
    }

    static String isValid(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i))) {
                charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
            } else {
                charMap.put(s.charAt(i), 1);
            }
        }
        boolean joker = true;
        for (Map.Entry<Character, Integer> mapEntry : charMap.entrySet()) {
            if (joker && mapEntry.getValue() == 2) {
                joker = false;
            } else if (mapEntry.getValue() > 1) {
                return "NO";
            }
        }
        return "YES";
    }
}
