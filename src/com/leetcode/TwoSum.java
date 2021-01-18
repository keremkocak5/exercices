package com.leetcode;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int[] nums1 = new int[]{3, 2, 4};
        //int[] result = twoSum(nums, 9);
        int[] result = twoSum(nums1, 6);
        System.out.println(result[0] + ", " + result[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result;
        for (int i = 0; i < nums.length; i++) {
            for (int ii = 0; ii < nums.length; ii++) {
                if (nums[ii] + nums[i] == target && ii != i)
                    return new int[]{ii, i};
            }
        }
        return null;
    }
}