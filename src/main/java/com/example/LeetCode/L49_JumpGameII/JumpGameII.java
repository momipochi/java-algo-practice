package com.example.LeetCode.L49_JumpGameII;

// https://leetcode.com/problems/jump-game-ii/description/

/*
 * The idea is to use a helper function that would return the next index to look into.
 * Inside the helper function, we want to have a limit a and b so that we know how far
 * we can jump to. Given we know how far we can jump to, we simply need to find the index
 * that, when added up would be the max value we can jump to. In the end we return the index.
 * Of crouse, we need to increment our steps each time we call the function.
 */

public class JumpGameII {
    int ans = 0;

    public int jump(int[] nums) {
        int i = 0;
        while (i < nums.length - 1) {
            i = helper(i, nums[i], nums);
        }
        return ans;
    }

    public int helper(int a, int b, int[] nums) {
        ans++;
        if (a + b >= nums.length - 1) {
            return nums.length;
        }
        int max = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = a; i <= a + b; i++) {
            if (nums[i] + i >= max) {
                temp = i;
                max = nums[i] + i;
            }
        }
        return temp;
    }
}
