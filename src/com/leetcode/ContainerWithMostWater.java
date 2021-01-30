package com.leetcode;

public class ContainerWithMostWater {

    private static int[] bir1 = new int[]{1,8,6,2,5,4,8,3,7};

    public static void main(String[] args) {
        System.out.println(">>" + maxArea(bir1));
    }

    public static int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0, min = 0, state = 0;

        while (l != r) {
            min = Math.min(height[l], height[r]);
            max = Math.max(max, min * (r - l));
            if (false) {
                r--;
                state = 0;
            } else if (false) {
                l++;
                state = 0;
            } else if (height[l] > height[r]) {
                //l++;
                r--;
                state = -1;
            } else {
                //r--;
                l++;
                state = 1;
            }
        }
        return max;
    }
}