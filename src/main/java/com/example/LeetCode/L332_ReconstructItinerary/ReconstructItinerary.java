package com.example.LeetCode.L332_ReconstructItinerary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
    Map<String, List<String>> map = new HashMap<>();
    LinkedList<String> res = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {

        for (List<String> list : tickets) {
            map.putIfAbsent(list.get(0), new ArrayList<>());
            map.get(list.get(0)).add(list.get(1));
        }

        solution("JFK");
        return res;
    }

    private void solution(String from) {
        List<String> nexts = map.get(from);
        if (nexts != null) {
            nexts.sort((a, b) -> a.compareTo(b));
            while (nexts.size() != 0) {
                String nextFrom = nexts.get(0);
                nexts.remove(0);
                solution(nextFrom);
            }
        }
        res.addFirst(from);
    }
}
