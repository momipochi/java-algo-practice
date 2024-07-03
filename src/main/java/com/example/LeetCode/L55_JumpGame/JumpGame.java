package com.example.LeetCode.L55_JumpGame;

// https://leetcode.com/problems/jump-game/
public class JumpGame {
    public boolean canJump(int[] nums) {
        int reach = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > reach)
                return false;
            reach = Math.max(reach, i + nums[i]);

        }
        return true;
    }
}
