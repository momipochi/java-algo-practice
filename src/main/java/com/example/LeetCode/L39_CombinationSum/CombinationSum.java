package com.example.LeetCode.L39_CombinationSum;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/description/

/*
 * The idea is simple, use backtracking to reach the answer.
 * If the sum is equal to the target we can add the result and return.
 * If the sum or index is faulty we return.
 * 
 * If everything is find, aka the index is not faulty, we can run backtrack on it,
 * as well as index+1. However, we don't need to backtrack index+1.
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solution(target, 0, 0, candidates, new ArrayList<>(), res);
        return res;
    }

    public void solution(int target, int sum, int index, int[] candidates, List<Integer> combinations,
            List<List<Integer>> res) {
        if (target == sum) {
            res.add(new ArrayList<>(combinations));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }

        combinations.add(candidates[index]);
        solution(target, sum + candidates[index], index, candidates, combinations, res);
        combinations.remove(combinations.size() - 1);
        solution(target, sum, index + 1, candidates, combinations, res);
    }
}
