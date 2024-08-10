package com.example.LeetCode.L46_permutations;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        solution(new ArrayList<>(), res, nums, used);
        return res;
    }

    private static void solution(List<Integer> permutation, List<List<Integer>> res, int[] nums, boolean[] used) {
        if (nums.length == permutation.size()) {
            res.add(new ArrayList<>(permutation));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            permutation.add(nums[i]);
            solution(permutation, res, nums, used);
            used[i] = false;
            permutation.remove(permutation.size() - 1);
        }
    }
}
