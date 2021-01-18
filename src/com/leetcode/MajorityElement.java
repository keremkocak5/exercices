package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    private static int[] bir = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] iki = new int[]{2, 2, 1, 1, 1, 2, 2};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};


    public static void main(String[] args) {
        System.out.println(majorityElement(iki));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> ent : hm.entrySet()) {
            if (ent.getValue() > nums.length / 2)
                return ent.getKey();
        }
        return -1;
    }
}