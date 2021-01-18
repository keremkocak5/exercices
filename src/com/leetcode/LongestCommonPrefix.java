package com.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] st = new String[]{};
        System.out.println(">>" + longestCommonPrefix(st));
    }

    public static String longestCommonPrefix(String[] strs) {
        String result = "";
        int index = 0;
        boolean break1 = true;
        while (break1 && strs.length > 0) {
            if (index + 1 > strs[0].length())
                return result;
            String newr = strs[0].substring(0, index + 1);
            for (int i = 0; i < strs.length; i++) {
                if (index + 1 > strs[i].length())
                    return result;
                if (!strs[i].substring(0, index + 1).equals(newr)) {
                    return result;
                }
                if (strs[i].length() == index) {
                    break1 = false;
                }
            }
            index++;
            result = newr;
        }
        return result;
    }

}