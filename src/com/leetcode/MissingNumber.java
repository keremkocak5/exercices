package com.leetcode;

import java.util.Arrays;

public class MissingNumber {

    private static int[] bir = new int[]{0, 1};

    public static void main(String[] args) {
        System.out.println(">>" + missingNumber(bir));
    }

    public static int missingNumber(int[] nums) {
        int total = Arrays.stream(nums).sum();
        return (nums.length * (nums.length + 1) / 2) - total;
    }

}