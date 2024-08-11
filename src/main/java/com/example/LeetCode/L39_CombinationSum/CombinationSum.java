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

    public void solution(int[] candidates, int target, int sum, int index, List<Integer> combination,
            List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(combination));
            return;
        }
        if (sum > target || index >= candidates.length) {
            return;
        }

        combination.add(candidates[index]);
        solution(candidates, target, sum + candidates[index], index, combination, res);
        combination.remove(combination.size() - 1);
        solution(candidates, target, sum, index + 1, combination, res);
    }

}
