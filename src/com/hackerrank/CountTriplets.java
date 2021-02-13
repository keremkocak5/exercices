package com.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTriplets {

    public static void main(String[] args) {

        List<Long> arr = Arrays.asList(1L, 2L, 2L, 4L);
        List<Long> arr2 = Arrays.asList(1L, 4L, 16L, 64L);
        List<Long> arr3 = Arrays.asList(1L, 1L, 1L, 1L);


        System.out.println(countTriplets(arr2, 4L));
        System.out.println(countTriplets(arr, 2L));
        System.out.println(countTriplets(arr3, 1L));

    }

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> hm = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long total = 0L;
        for (int i = 0; i < arr.size(); i++) {
            if (hm.containsKey(arr.get(i) * r) && hm.containsKey(arr.get(i) * r * r)) {
                total = total + 1 + (hm.get(arr.get(i) * r) - 1) + (hm.get(arr.get(i) * r * r) - 1);
            }
        }
        return total;
    }

    static long countTriplets1(List<Long> arr, long r) {
        int left = 0, right = 1, total = 0;
        Long product = 0L;
        boolean secondFound = false;
        boolean bingo = false;
        while (left < arr.size() - 2) {
            if (!bingo && arr.get(left) * r != arr.get(right)) {
                right++;
            } else if (bingo && arr.get(left) * r * r != arr.get(right)) {
                right++;
            } else if (!bingo) {
                bingo = true;
                right++;
            } else if (bingo) {
                total++;
                //bingo = false;
                left++;
                right = left + 1;
            }

            if (right >= arr.size()) {
                left++;
                right = left + 1;
                bingo = false;
            }


            /*
            if (!secondFound && arr.get(left) * r != arr.get(right)) {
                left++;
                right = left + 1;
                //continue;
            } else if (secondFound && arr.get(left) * r * r != arr.get(right)) {
                // total++;
                //secondFound = false;
                right++;
                //continue;
            } else if (!secondFound) {
                right++;
                secondFound = true;
            } else {
                left++;
                right = left + 1;
                total++;
                secondFound = false;
            }*/


        }
        return total;
    }
}
