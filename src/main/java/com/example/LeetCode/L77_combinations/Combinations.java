package com.example.LeetCode.L77_combinations;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combinations/description/

// Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
// You may return the answer in any order.
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        solution(n, k, k, new ArrayList<>(), res);
        return res;
    }

    private static void solution(int n, int k, int curr, List<Integer> combinations, List<List<Integer>> res) {
        if (combinations.size() == k) {
            res.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = curr; i <= n; i++) {
            combinations.add(i);
            solution(n, k, ++curr, combinations, res);
            combinations.remove(combinations.size() - 1);
        }
    }
}
