package com.example.LeetCode.L2087_MincostGrid;

public class MincostGrid {
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int sr = startPos[0], sc = startPos[1], hr = homePos[0], hc = homePos[1], cost = 0;

        while (sr != hr) {
            if (sr < hr) {
                cost += rowCosts[++sr];
            } else {
                cost += rowCosts[--sr];
            }
        }

        while (sc != hc) {
            if (sc < hc) {
                cost += colCosts[++sc];
            } else {
                cost += colCosts[--sc];
            }
        }
        return cost;
    }
}
