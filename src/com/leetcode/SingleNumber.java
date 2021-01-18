package com.leetcode;

import java.util.HashMap;

public class SingleNumber {

    private static int[] bir1 = new int[]{1, 2, 1, 2, 4};
    private static int[] bir = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] iki = new int[]{2, 4, 1};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};


    public static void main(String[] args) {
        System.out.println(singleNumber(bir1));
    }

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], 2);
            } else {
                hm.put(nums[i], 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.get(nums[i]) == 1)
                return nums[i];
        }

        return 0;
    }

    public static int singleNumber4(int[] nums) {
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            val ^= nums[i];
        }
        return val;
    }

    public static int singleNumber2(int[] nums) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            r++;
            if (r >= nums.length) {
                return nums[l];
            }
            if (nums[l] == nums[r]) {
                if (r == nums.length)
                    return nums[nums.length];
                if (r - l == 1) {
                    l = r + 1;
                    r = l;
                } else {
                   /* l++;
                    r = l;*/
                    l = r + 1;
                    r = l;

                }
            }

        }
        return nums[l];
    }

    public static int singleNumber1(int[] nums) {
        int l = 0;
        int r = 0;
        while (l < nums.length) {
            r++;
            if (r >= nums.length) {
                l++;
                r = l + 1;
            }
            if (nums[l] == nums[r]) {
                if (r - l == 1 && r == nums.length) {
                    return nums[0];
                } else {

                }
            }

        }


        for (int i = 1; i < nums.length; i++) {
            if (nums[l] == nums[r]) {
                if (r - l == 1) {
                    l = r + 1;
                    r = l + 1;
                } else {
                    l++;
                }
            }
            r++;
            if (r >= nums.length)
                return nums[l];
        }
        return nums[l];
    }
}