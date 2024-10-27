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
    int[] nums;

    public int jump(int[] nums) {
        int i = 0;
        this.nums = nums;
        while (i < nums.length - 1) {
            i = nextIndex(i, nums[i]);
        }
        return ans;
    }

    private int nextIndex(int a, int b) {
        ans++;
        if (a + b >= nums.length - 1) {
            return nums.length;
        }
        int max = 0, pos = 0;
        for (int i = a; i <= a + b; i++) {
            int curr = nums[i] + i;
            if (max < curr) {
                max = curr;
                pos = i;
            }
        }
        return pos;
    }

}
