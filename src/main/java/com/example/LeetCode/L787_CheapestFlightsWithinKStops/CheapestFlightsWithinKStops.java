package com.example.LeetCode.L787_CheapestFlightsWithinKStops;

import java.util.Arrays;

// https://leetcode.com/problems/cheapest-flights-within-k-stops/description/

/*
 * Explanation
 * 
 * Simple and optimized way is to use a loop to check the existence of a route for each element
 * and within the check, update a collection storing prices to easily return answer later
 * 
 * In order for it to work a copy of the price collection is necessary, as we do not want to affect the orignal copy yet
 * given flights from and to we can use them as index to operate on the price collection
 * 
 * The algorithm would be by design avoiding the case where we don't find a solution or exceed number of stops (k)
 * because if such a case occurs it means that the index at destination will be the defualt MAX_VALUE, in which case we return -1
 */

public class CheapestFlightsWithinKStops {
    int[] track;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        track = new int[n];
        Arrays.fill(track, Integer.MAX_VALUE);
        track[src] = 0;
        for (int i = 0; i <= k; i++) {
            if (!existsRoute(flights)) {
                break;
            }
        }
        return track[dst] == Integer.MAX_VALUE ? -1 : track[dst];
    }

    private boolean existsRoute(int[][] flights) {
        int[] copy = Arrays.copyOf(track, track.length);
        boolean found = false;
        for (int[] flight : flights) {
            int price = flight[2] + copy[flight[0]];
            if (copy[flight[0]] != Integer.MAX_VALUE && track[flight[1]] > price) {
                track[flight[1]] = price;
                found = true;
            }
        }
        return found;
    }

}
