package com.example.LeetCode.L332_ReconstructItinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/reconstruct-itinerary/description/
/*
 * Given tickets, we need to covert to Map so that we know how many connections there are from each airport
 * and because we can assume there is at least one valid answer, it means we do not have to care if there is
 * an invalid solution, for example unreachable destination
 * 
 * Therefore, it is a matter of iterating through all the possible airports for each key and adding to the collection
 * and because the task asks to prioritize lexicographic order, this means we need to make sure we sort the possible
 * destinations collection or use a Queue instead.
 */

public class ReconstructItinerary {
    Map<String, PriorityQueue<String>> map;
    List<String> res;

    public List<String> findItinerary(List<List<String>> tickets) {
        map = new HashMap<>();
        for (int i = 0; i < tickets.size(); i++) {
            map.putIfAbsent(tickets.get(i).get(0), new PriorityQueue<>());
            map.get(tickets.get(i).get(0)).add(tickets.get(i).get(1));
        }
        res = new ArrayList<>();
        solve("JFK");
        return new ArrayList<>(res);
    }

    private void solve(String src) {
        PriorityQueue<String> q = map.get(src);
        if (q != null) {
            while (!q.isEmpty()) {
                solve(q.poll());
            }
        }
        res.add(0, src);

    }
}
