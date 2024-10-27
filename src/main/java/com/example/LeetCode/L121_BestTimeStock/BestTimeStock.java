package com.example.LeetCode.L121_BestTimeStock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeStock {
    public int maxProfit(int[] prices) {
        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            int tmp = prices[i] - min;
            max = max > tmp ? max : tmp;
        }
        return max;
    }
}
