package com.leetcode;

public class BestTimeToBuyAndSellStock {

    private static int[] bir = new int[]{7, 1, 5, 3, 6, 4};
    private static int[] iki = new int[]{2, 4, 1};
    private static int[] uc = new int[]{7, 6, 4, 3, 1};
    private static int[] dort = new int[]{1, 2};


    public static void main(String[] args) {
        System.out.println(maxProfit(bir));
    }

    public static int maxProfit(int[] prices) {
        int dayToBuy = 0;
        int dayToSell = 1;
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[dayToBuy]) {
                dayToBuy = i;
            } else {
                profit = Math.max(profit, prices[dayToSell] - prices[dayToBuy]);
            }
            dayToSell++;
        }
        return profit;
    }

    public static int maxProfit1(int[] prices) {
        int diff = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int i1 = i; i1 < prices.length; i1++) {
                diff = Math.max(diff, prices[i1] - prices[i]);
            }
        }
        return diff;
    }
}