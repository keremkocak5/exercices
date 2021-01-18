package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    private static int[] bir = new int[]{0};
    private static int[] iki = new int[]{1};

    public static void main(String[] args) {
        merge(bir, 0, iki, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int mcursor = m - 1;
        int ncursor = n - 1;
        int cursor = m + n - 1;


        while (true) {
            if (mcursor < 0 && ncursor >= 0) {
                nums1[cursor] = nums2[ncursor];
                ncursor--;
                cursor--;
                continue;
            }
            if (mcursor < 0 || ncursor < 0) {
                break;
            }
            if (nums1[mcursor] > nums2[ncursor]) {
                nums1[cursor] = nums1[mcursor];
                cursor--;
                mcursor--;
            } else {
                nums1[cursor] = nums2[ncursor];
                cursor--;
                ncursor--;
            }
        }

    }


    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = n - 1;
        int ii = m - 1;
        int iii = n + m - 1;
        while (iii >= 0 && i >= 0 && ii >= 0) {
            if (nums2[i] > nums1[ii]) {
                nums1[iii] = nums2[i];
                iii--;
                i--;
            } else if (nums2[i] == nums1[ii]) {
                nums1[iii] = nums2[i];
                nums1[iii - 1] = nums2[i];
                iii--;
                i--;
                iii--;
                ii--;
            } else if (nums2[i] < nums1[ii]) {
                nums1[iii] = nums1[ii];
                iii--;
                ii--;
            }
        }
        while (i >= 0) {
            nums1[iii] = nums2[i];
            iii--;
            i--;
        }

        System.out.println();
    }

    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

}