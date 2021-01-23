package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ContainsDuplicate {

    private static int[] bir = new int[]{1, 2, 3, 1};

    public static void main(String[] args) {
        System.out.println(containsDuplicate(bir));
    }


    public static boolean containsDuplicate(int[] nums) {
        Map<Object, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            } else {
                hm.put(nums[i], 1);
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        Map<Object, Long> hm = Arrays
                .stream(nums)
                .boxed() // this
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        for (Map.Entry e : hm.entrySet()) {
            if ((Long) e.getValue() > 1)
                return true;
        }
        return false;
    }
}