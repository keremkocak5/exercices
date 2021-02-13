package com.hackerrank;

public class AlternatingCharacters {
    private static int[] bir = new int[]{1, 2, 3, 4, 5};

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("AAAAA"));
    }

    static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

}
