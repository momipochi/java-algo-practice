package com.example.L46_permutations;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        rec(res, new ArrayList<>(), nums, used);
        return res;
    }

    private static void rec(List<List<Integer>> res, List<Integer> perm, int[] nums, boolean[] used) {
        if (perm.size() == nums.length) {
            res.add(new ArrayList<>(perm));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            perm.add(nums[i]);
            rec(res, perm, nums, used);
            used[i] = false;
            perm.remove(perm.size() - 1);
        }
    }
}
