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
    List<List<Integer>> res = new ArrayList<>();
    int[] cands;
    int tar;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.cands = candidates;
        this.tar = target;
        backtrack(new ArrayList<>(), 0, 0);
        return res;
    }

    private void backtrack(List<Integer> combination, int sum, int index) {
        if (sum == tar) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if (sum > tar || index >= cands.length) {
            return;
        }

        combination.add(cands[index]);
        backtrack(combination, sum + cands[index], index);
        combination.remove(combination.size() - 1);
        backtrack(combination, sum, index + 1);
    }

}
