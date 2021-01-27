package com.leetcode;

public class MoveZeroes {

    private static int[] bir = new int[]{0, 1, 0, 3, 12};
    private static int[] iki = new int[]{0,1};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};

    public static void main(String[] args) {
        moveZeroes(bir);
    }

    public static void moveZeroes(int[] nums) {
        int zeroCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[i - zeroCount] = nums[i];
            }
        }
        for (int i = nums.length-zeroCount; i < nums.length; i++) {
            nums[i] = 0;
        }
        System.out.println("deneme");
    }
}
