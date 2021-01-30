package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionofTwoArraysII {

    private static int[] in1 = new int[]{1};
    private static int[] in2 = new int[]{1, 1};


    public static void main(String[] args) {
        intersect(in1, in2);
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0)
            return new int[0];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] nums3 = new int[Math.max(nums1.length, nums2.length)];
        int l = 0, r = 0, count = 0;
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] < nums2[r]) {
                l++;
            } else if (nums1[l] > nums2[r]) {
                r++;
            } else {
                nums3[count] = nums1[l];
                count++;
                r++;
                l++;
            }
        }
        return Arrays.copyOfRange(nums3, 0, count);
    }

    public static int[] intersect1(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> result0 = new ArrayList<>();
        List<Integer> result02 = new ArrayList<>();
        int[] result = new int[Math.max(nums1.length, nums2.length)];
        int[] result2 = new int[Math.max(nums1.length, nums2.length)];
        int maxCount = 0;
        int iii = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int ii = 0; ii < nums2.length; ii++) {
                if (i < nums1.length && nums1[i] != nums2[ii]) {
                    //continue;
                } else if (i < nums1.length) {
                    result[iii] = nums1[i];
                    iii++;
                    i++;
                }
            }
            if (iii > maxCount) {
                result2 = result;
                maxCount = iii;
            }
            result = new int[Math.max(nums1.length, nums2.length)];
            iii = 0;
        }
        int[] result3 = new int[maxCount];
        for (int i = 0; i < maxCount; i++) {
            result3[i] = result2[i];
        }
        return result3;
    }
}