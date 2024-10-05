package com.example.LeetCode.L189_RotateArray;

// https://leetcode.com/problems/rotate-array/description/

/*
 * The idea of the algorithm is to use a characteristic of reversal.
 * Instead of rotating an array one by one, we can simply find the index
 * to which the entire array must rotate pass. We can easily find the value
 * by modding the length of the array. All we have to do next is simply
 * reverse the entire array, reverse until the modular - 1, and reverse
 * from modular to the end.
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(0, nums.length - 1, nums);
        reverse(0, k - 1, nums);
        reverse(k, nums.length - 1, nums);
    }

    private void reverse(int a, int b, int[] nums) {
        while (a < b) {
            int tmp = nums[b];
            nums[b] = nums[a];
            nums[a] = tmp;
            a++;
            b--;
        }
    }

}
