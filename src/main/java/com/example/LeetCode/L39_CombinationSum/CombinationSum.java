package com.example.LeetCode.L39_CombinationSum;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/description/
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        solution(candidates, target, 0, 0, new ArrayList<>(), res);
        return res;
    }

    private void solution(int[] candidates, int target, int index, int sum, List<Integer> combination,
            List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }
        combination.add(candidates[index]);
        solution(candidates, target, index, sum + candidates[index], combination, res);
        combination.remove(combination.size() - 1);
        solution(candidates, target, index + 1, sum, combination, res);

    }
}
