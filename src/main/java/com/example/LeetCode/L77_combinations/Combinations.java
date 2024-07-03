package com.example.LeetCode.L77_combinations;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combinations/description/

// Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
// You may return the answer in any order.
public class Combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(k, 1, n, res, new ArrayList<>());
        return res;
    }

    private static void backtrack(int combinationLen, int currN, int maxN, List<List<Integer>> res,
            List<Integer> combination) {
        if (combination.size() == combinationLen) {
            res.add(new ArrayList<>(combination));
            return;
        }
        for (int i = currN; i <= maxN; i++) {
            combination.add(i);
            backtrack(combinationLen, ++currN, maxN, res, combination);
            combination.remove(combination.size() - 1);
        }
    }
}
