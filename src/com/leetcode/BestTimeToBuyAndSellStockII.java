package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class BestTimeToBuyAndSellStockII {

    private static int[] bir1 = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] bir = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] iki = new int[]{2, 4, 1};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};

    public static void main(String[] args) {
        System.out.println(maxProfit(bir1));
    }

    public static int maxProfit(int[] prices) {
        List<Integer> intler = new ArrayList<>();
        int profit = 0;
        int l = 0;
        int r = 1;
        boolean aldim = false;
        for (int i = 1; i < prices.length; i++) {
            if (prices[r] < prices[l]) {
                l = r;
            } else {
                System.out.println("profit: " + (prices[r] - prices[l]));
                intler.add(prices[r] - prices[l]);
            }
            r++;
        }
        boolean intler1 = true;
        int a1 = 0;
        int a2 = 0;
        for (int i = 0; i < intler.size(); i++) {
            if (intler1) {
                a1 = a1 + intler.get(i);
            } else {
                a2 = a2 + intler.get(i);
            }
            intler1 = !intler1;
        }

        return Math.max(a1, a2);
    }
}