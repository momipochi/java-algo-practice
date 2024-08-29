package com.example.LeetCode.L332_ReconstructItinerary;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.example.utils.Utils;

public class ReconstructItineraryTest {
    @Test
    public void testFindItinerary() {
        String[][] s = new String[][] { { "MUC", "LHR" }, { "JFK", "MUC" }, { "SFO", "SJC" }, { "LHR", "SFO" } };
        List<List<String>> cas = Utils.twoDimensionalArrayToList(s);
        String[] ans = new String[] { "JFK", "MUC", "LHR", "SFO", "SJC" };

        cas.forEach(x -> {
            x.forEach(y -> {
                System.out.print(y + " ");
            });
            System.out.println();
        });
        List<String> an = Arrays.asList(ans);
        ReconstructItinerary ri = new ReconstructItinerary();

        assertEquals(an, ri.findItinerary(cas));
    }
}
