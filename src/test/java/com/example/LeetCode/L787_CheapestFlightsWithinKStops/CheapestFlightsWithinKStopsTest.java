package com.example.LeetCode.L787_CheapestFlightsWithinKStops;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheapestFlightsWithinKStopsTest {

    @Test
    public void testFindCheapestPrice() {
        CheapestFlightsWithinKStops c = new CheapestFlightsWithinKStops();
        int n = 4, src = 0, dst = 3, k = 1;
        int[][] flights = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        assertEquals(700, c.findCheapestPrice(n, flights, src, dst, k));
    }
}
