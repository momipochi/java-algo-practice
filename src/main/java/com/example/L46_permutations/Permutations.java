package com.example.L46_permutations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

//https://leetcode.com/problems/permutations/description/
//Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Stack<Integer> perms = new Stack<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        recur(res, perms, used, nums);
        return res;
    }

    private static void recur(List<List<Integer>> res, Stack<Integer> perms, boolean[] used, int[] nums) {
        if (perms.size() == used.length) {
            res.add(new ArrayList<Integer>(perms));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perms.push(nums[i]);
                recur(res, perms, used, nums);
                used[i] = false;
                perms.pop();
            }
        }
    }
}
