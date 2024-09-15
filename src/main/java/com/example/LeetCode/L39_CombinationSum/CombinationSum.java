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
 * Keep in mind that backtracking for index requires sum+candidates[index],
 * where as backtracking for index+1 doesn't require it. This is because
 * we need to check if element at index could be used multiple times to add up
 * to the target. Also, we need to move to the next index at some point.
 */

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solution(0, 0, target, candidates, new ArrayList<>(), res);
        return res;
    }

    private void solution(int sum, int index, int target, int[] candidates, List<Integer> combinations,
            List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(combinations));
            return;
        }
        if (index >= candidates.length || sum > target) {
            return;
        }

        combinations.add(candidates[index]);
        solution(sum + candidates[index], index, target, candidates, combinations, res);
        combinations.remove(combinations.size() - 1);
        solution(sum, index + 1, target, candidates, combinations, res);
    }
}
