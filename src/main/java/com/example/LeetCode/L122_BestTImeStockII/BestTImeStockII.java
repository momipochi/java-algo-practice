package com.example.LeetCode.L122_BestTImeStockII;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
public class BestTImeStockII {
    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                res += prices[i] - prices[i - 1];
            }
        }
        return res;
    }
}
