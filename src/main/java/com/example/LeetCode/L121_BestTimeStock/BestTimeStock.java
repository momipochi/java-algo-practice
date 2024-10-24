package com.example.LeetCode.L121_BestTimeStock;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeStock {
    public int maxProfit(int[] prices) {
        int max = 0, l = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (l > prices[i]) {
                l = prices[i];
            }
            max = Math.max(max, prices[i] - l);
        }
        return max;
    }
}
