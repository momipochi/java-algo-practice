package com.example.LeetCode.L46_permutations;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solution(nums, res, new ArrayList<>());
        return res;
    }

    private static void solution(int[] nums, List<List<Integer>> res, List<Integer> combination) {
        if (combination.size() == nums.length) {
            res.add(new ArrayList<>(combination));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (combination.contains((Integer) nums[i])) {
                    continue;
                }
                combination.add(nums[i]);
                solution(nums, res, combination);
                combination.remove(combination.size() - 1);
            }
        }
    }
}
