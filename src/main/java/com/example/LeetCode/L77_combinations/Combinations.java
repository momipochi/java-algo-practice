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
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        solution(n, k, 1, new ArrayList<>(), res);
        return res;
    }

    private void solution(int n, int k, int index, List<Integer> combinations, List<List<Integer>> res) {
        if (combinations.size() == k) {
            res.add(new ArrayList<>(combinations));
            return;
        }
        for (int i = index; i <= n; i++) {
            combinations.add(i);
            solution(n, k, i + 1, combinations, res);
            combinations.remove(combinations.size() - 1);
        }
    }

}
