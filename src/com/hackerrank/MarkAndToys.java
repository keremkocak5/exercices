package com.hackerrank;

import java.util.Arrays;

public class MarkAndToys {
    private static int[] bir = new int[]{3, 7, 2, 9, 4};

    public static void main(String[] args) {
        System.out.println(maximumToys(bir, 15));
    }

    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0, price = 0;
        while (count < prices.length - 1 && price + prices[count] < k ) {
            price += prices[count];
            count++;
        }
        return count;
    }

}