package com.example.LeetCode.L77_combinations;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/combinations/description/

// Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
// You may return the answer in any order.

/*
 * Unlike permutations where always start looping from 0, with combinations,
 * we cannot do that, because we want unique combinations, regardless of order.
 * What we can do in this case is simply pass a starting index in the recursive
 * call. This way we can by design rule out duplicates, since we won't be starting
 * from 0 everytime. There is no need to even check if the colleciton contains
 * an element already.
 */

public class Combinations {
    List<List<Integer>> res = new ArrayList<>();
    int n;
    int k;

    public List<List<Integer>> combine(int n, int k) {
        this.n = n;
        this.k = k;
        helper(new ArrayList<>(), 1);
        return res;
    }

    public void helper(List<Integer> combinations, int start) {
        if (combinations.size() == k) {
            res.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = start; i <= n; i++) {
            combinations.add(i);
            helper(combinations, i + 1);
            combinations.remove(combinations.size() - 1);
        }
    }
}
