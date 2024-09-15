package com.example.LeetCode.L55_JumpGame;

// https://leetcode.com/problems/jump-game/

/*
 * We only need to know if we can reach the destination, meaning we should have a variable
 * that would add up all the elements. We only need to add the current index to the current element
 * and compare it with the variable to get the max. This way we are able to ensure that
 * we go through all elements and check all the values, which one is greater and whether
 * it can even reach the next index.
 */

public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (reach >= nums.length - 1) {
                return true;
            }
            reach = Math.max(reach, nums[i] + i);
        }
        return false;
    }
}
