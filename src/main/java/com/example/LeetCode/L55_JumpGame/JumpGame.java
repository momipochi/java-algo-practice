package com.example.LeetCode.L55_JumpGame;

// https://leetcode.com/problems/jump-game/
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
