package com.example.LeetCode.L46_permutations;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

/*
 * A simple dfs would do the work. Keep in mind that the definition of permutation is to find
 * combinations of numbers such that all numbers are used but their index is different and unique.
 * This means you need to iterate over the entire array and check before backtracking whether
 * and element exists already, so that you skip it. This will by design create all permutations.
 */

public class Permutations {
    List<List<Integer>> res = new ArrayList<>();
    int[] nums;
    boolean[] picked;

    public List<List<Integer>> permute(int[] nums) {
        this.nums = nums;
        picked = new boolean[nums.length];
        backtrack(new ArrayList<>());
        return res;
    }

    private void backtrack(List<Integer> perm) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (picked[i]) {
                continue;
            }
            picked[i] = true;
            perm.add(nums[i]);
            backtrack(perm);
            picked[i] = false;
            perm.remove(perm.size() - 1);
        }
    }

}
