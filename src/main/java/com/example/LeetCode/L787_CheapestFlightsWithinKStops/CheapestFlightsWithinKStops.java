package com.example.LeetCode.L787_CheapestFlightsWithinKStops;

import java.util.Arrays;

public class CheapestFlightsWithinKStops {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] dest = new int[n];
        Arrays.fill(dest, Integer.MAX_VALUE);
        dest[src] = 0;
        for (int i = 0; i <= k; i++) {
            if (!existsRoute(dst, dest, flights)) {
                break;
            }
        }
        return dest[dst] == Integer.MAX_VALUE ? -1 : dest[dst];
    }

    private boolean existsRoute(int dst, int[] dest, int[][] flights) {
        int[] copy = Arrays.copyOf(dest, dest.length);
        boolean present = false;
        for (int[] flight : flights) {
            int price = flight[2] + copy[flight[0]];
            if (copy[flight[0]] != Integer.MAX_VALUE && dest[flight[1]] > price) {
                dest[flight[1]] = price;
                present = true;
            }
        }
        return present;
    }

}
