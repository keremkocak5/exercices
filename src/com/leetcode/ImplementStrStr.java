package com.leetcode;

public class ImplementStrStr {


    public static void main(String[] args) {
        System.out.println(">>" + strStr("cabcc", "ab"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle.equals(""))
            return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.substring(i, Math.min(i + needle.length(), haystack.length())).equals(needle))
                return i;
        }
        return -1;
    }

}