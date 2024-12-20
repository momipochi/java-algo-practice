package com.example.LeetCode.L78_subsets;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/

// Given an integer array nums of unique elements, return all possible subsets (the power set).
// The solution set must not contain duplicate subsets. Return the solution in any order.

// https://leetcode.com/problems/subsets-ii/
// Given an integer array nums that may contain duplicates, return all possible subsets (the power set).

// The solution set must not contain duplicate subsets. Return the solution in any order.

/*
 * For simple backtrack, it is similar to combinations, however, you don't care about returning,
 * once the loop ends you will reach your answer, just need to add subset to result at the start
 * for the recursion function.
 * 
 * For iterative approach, we simply need to loop through the nums and use result's size as the
 * condition for the nested loop. Create a list withing the nested loop with the element
 * in the result collection at current index, append current num and add it back to result.
 */

public class Subsets {
    public static List<List<Integer>> subsetsIterative(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int size = result.size();
            for (int j = 0; j < size; j++) {
                List<Integer> tmp = new ArrayList<>(result.get(j));
                tmp.add(nums[i]);
                result.add(tmp);
            }
        }
        return result;
    }

    public static List<List<Integer>> subsetsBacktrack(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solution(0, nums, new ArrayList<>(), result);
        return result;
    }

    private static void solution(int start, int[] nums, List<Integer> subsets, List<List<Integer>> res) {
        res.add(new ArrayList<>(subsets));
        for (int i = start; i < nums.length; i++) {
            subsets.add(nums[i]);
            solution(i + 1, nums, subsets, res);
            subsets.remove(subsets.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsBitmanipulation(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
