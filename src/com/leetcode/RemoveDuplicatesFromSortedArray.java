package com.leetcode;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    private static int[] in = new int[]{0,0,1,1,1,2,2,3,3,4};


    public static void main(String[] args) {
        System.out.println(">>" + removeDuplicates(in));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static int removeDuplicates2(int[] nums) {
        if (nums == null || nums.length < 1)
            return 0;
        int length = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            int trycount = 1;
            while (skip(nums, i, trycount)) {
                nums[i + trycount] = 9999999;
                length--;
                trycount++;
            }
        }
        Arrays.sort(nums);
        return length;
    }

    private static boolean skip(int[] nums, int cursorcount, int trycount) {
        if (nums.length == trycount + cursorcount || nums[cursorcount] == 9999999) {
            return false;
        } else if (nums[cursorcount] != nums[cursorcount + trycount]) {
            return false;
        }
        return true;
    }

}