package com.example.LeetCode.L46_permutations;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        solution(nums, new ArrayList<>(), res);
        return res;
    }

    private static void solution(int[] nums, List<Integer> permutations, List<List<Integer>> res) {
        if (permutations.size() == nums.length) {
            res.add(new ArrayList<>(permutations));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (permutations.contains(nums[i])) {
                continue;
            }
            permutations.add(nums[i]);
            solution(nums, permutations, res);
            permutations.remove(permutations.size() - 1);
        }
    }
}
